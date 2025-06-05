import MySQLdb

DB_HOST = 'localhost'
DB_USER = 'admin'
DB_PASS = 'admin123'
DB_NAME = 'classicmodels'

def run_query(query=''):
    datos = [DB_HOST, DB_USER, DB_PASS, DB_NAME]
    connection = MySQLdb.connect(*datos)
    cursor = connection.cursor()
    cursor.execute(query)

    if query.upper().startswith('SELECT'):
        data = cursor.fetchall()
    else:
        connection.commit()
        data = None
    
    cursor.close()
    connection.close()

    return data

query = "SELECT employees.firstName, employees.lastName, employees.extension, offices.city FROM employees JOIN offices ON employees.officeCode = offices.officeCode WHERE offices.city = 'San Francisco'"
result = run_query(query)
print("first_name,last_name,extension,city")
for row in result:
  course_id=row[0]
  title=row[1]
  dept_name=row[2]
  credits=row[3]
  print("{0},{1},{2},{3}".format(course_id,title,dept_name,credits))