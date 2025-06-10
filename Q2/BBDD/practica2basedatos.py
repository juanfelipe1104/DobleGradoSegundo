import MySQLdb
import os
comprobador=0
comprobador2=0

def obtenerDatos():
    print("ELIJA SU USURAIO Y CONRASEÑA PARA CONECTARSE A LA BASE DE DATOS CASSIC MODELS \n")
    DB_HOST= 'localhost'
    DB_USER= input()
    DB_PASS= input()
    DB_NAME= 'classicmodels'
    return DB_HOST, DB_USER, DB_PASS, DB_NAME

def run_query(query=''):
    datos = [DB_HOST, DB_USER, DB_PASS, DB_NAME]

    conn = MySQLdb.connect(*datos) # Conectar a la base de datos
    cursor = conn.cursor()         # Crear un cursor
    cursor.execute(query)          # Ejecutar una consulta

    if query.upper().startswith('SELECT'):
        data = cursor.fetchall()   # Traer los resultados de un select
    else:
        conn.commit()              # Hacer efectiva la escritura de datos
        data = cursor.fetchall()   # Traer los resultados de otras operaciones no select

    cursor.close()                 # Cerrar el cursor
    conn.close()                   # Cerrar la conexión

    return data

def imprimir_datos(datos):
   # Recorre cada fila en los resultados
   for row in datos:
      # Imprime cada campo de la fila, separados por 4 espacios
      for field in row:
        print(field, end="    ")
      print("")  # Salto de línea al final de cada fila       

terminar = False
opcion = 0
DB_HOST, DB_USER, DB_PASS, DB_NAME = obtenerDatos()
while not terminar:
    print("ELIJA OPCCION, 1:Presentar el listado de los directivos de la empresa Classic Model \n 2:El Top 10 de los clientes que más pagos hacen a la empresa ordenados de mayor a menor.\n 3:limpiar pantalla\n 4:salir ")
    opcion=input()
    if opcion=='1':
        query = "SELECT employeeNumber, lastName, firstName, email, jobTitle FROM employees;"
        imprimir_datos(run_query(query))
    elif opcion=='2':
        query = "SELECT customers.customerNumber, customers.customerName, SUM(payments.amount) as totalPagos  FROM customers  JOIN payments ON customers.customerNumber = payments.customerNumber GROUP BY customers.customerNumber, customers.customerName ORDER BY totalPagos DESC LIMIT 10 "
        imprimir_datos(run_query(query))
    elif opcion=='3':
        os.system("clear")
    elif opcion=='4':
        terminar=True