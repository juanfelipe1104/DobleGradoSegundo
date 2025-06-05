import MySQLdb
comprobador=0
comprobador2=0

def Datos(contraseña,usuario):
    global comprobador
    try:
        DB_HOST='localhost'
        DB_USER= usuario
        DB_PASS= contraseña
        DB_NAME= 'classicmodels'
       
        print(f"Intentando conectar a la base de datos con el usuario: {DB_USER}")
        conn = MySQLdb.connect(host=DB_HOST, user=DB_USER, passwd=DB_PASS, db=DB_NAME)
        print("Conexión exitosa.")
        cursor=conn.cursor()        #crear cursor
        comprobador=1
        return conn
    except:
        print("ERROR, nombre o contraseña incorrectos")
def imprimir_datos(datos):
   # Recorre cada fila en los resultados
   for row in datos:
      # Imprime cada campo de la fila, separados por 4 espacios
      for field in row:
        print(field, end="    ")
      print("")  # Salto de línea al final de cada fila       
def ListarDirectivos(conn):
    cursor = conn.cursor()
    cursor.execute("SELECT employeeNumber, lastName, firstName, email, jobTitle FROM employees;")
    
    # Obtener todos los resultados
    resultados = cursor.fetchall()

    # Imprimir los resultados usando la función imprimir_datos
    imprimir_datos(resultados)
def TopClientes(conn):
    cursor = conn.cursor()
    cursor.execute("SELECT customers.customerNumber, customers.customerName, SUM(payments.amount) as totalPagos  FROM customers  JOIN payments ON customers.customerNumber = payments.customerNumber GROUP BY customers.customerNumber, customers.customerName ORDER BY totalPagos DESC LIMIT 10 ")   
    print(cursor.fetchall())
def BorrarPantalla(conn):
    cursor = conn.cursor()
    cursor.execute('clear')  #limpiar pantalla
def main():
    global comprobador, comprobador2
    conn=None
    opcion=0
    while comprobador==0:
        print("ELIJA SU USURAIO Y CONRASEÑA PARA CONECTARSE A LA BASE DE DATOS CASSIC MODELS \n")
        Nombre=input()
        contraseña=input()
        conn=Datos(contraseña,Nombre )

    while comprobador2==0:
        print("ELIJA OPCCION, 1:Presentar el listado de los directivos de la empresa Classic Model \n 2:El Top 10 de los clientes que más pagos hacen a la empresa ordenados de mayor a menor.\n 3:limpiar pantalla\n 4:salir ")
        opcion=input()
        
        if opcion=='1':
            ListarDirectivos(conn)
        elif opcion=='2':
            TopClientes(conn)
        elif opcion=='3':
           BorrarPantalla(conn)
        elif opcion=='4':
            comprobador2=1
        
if __name__ == "__main__":
    main()