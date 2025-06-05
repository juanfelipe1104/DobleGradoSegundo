import MySQLdb
import os
import getpass

os.system("clear")

def Acceso_BBDD():
   DB_HOST=input("Introduce nombre del host: ")
   DB_USER=input("Introduce el usuario: ")
   DB_PASS=getpass.getpass("Introduce la password: ")
   DB_NAME=input("introduce la BBDD: ")
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
    
def imprimir_resultados(datos):
 for row in datos:
  field_0=row[0]
  field_1=row[1]
  field_2=row[2]
  field_3=row[3]
  print("{0},{1},{2},{3}".format(field_0,field_1,field_2,field_3))

def imprimir_tabla(datos):
 print(datos)


salir = False
opcion = 0

while not salir:

    print ("1. Definir BBDD, usuario y password")
    print ("2. Mostrar las tablas de la BBDD elegida")
    print ("3. Mostrar datos de una tabla de la BBDD elegida")
    print("4. Crear base de datos")
    print ("5. Salir")

    opcion = input ("Elige una opción: ")

    if opcion == "1":
        DB_HOST,DB_USER,DB_PASS,DB_NAME=Acceso_BBDD()
    elif opcion == "2":
        query = "SHOW TABLES"
        result = run_query(query)
        imprimir_tabla(result)
    elif opcion == "3":
        TABLA = input("Introduce la tabla: ")
        NR = input("Número de registros: ")
        query = "SELECT * FROM %s LIMIT %s" %(TABLA, NR)
        result = run_query(query)
        imprimir_resultados(result)
    elif opcion == "4":
       DB_NAME = input("Introduce el nombre de la base de datos: ")
       query = "CREATE DATABASE %s" %(DB_NAME)
       result = run_query(result)
    elif opcion == "5":
        salir = True
    else:
        print ("Introduce un numero entre 1 y 3")

print ("Fin")
