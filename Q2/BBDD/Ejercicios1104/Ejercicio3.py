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

query1 = "SELECT c.customerName, c.country, c.creditLimit FROM customers c WHERE c.country = 'Spain'"
result1 = run_query(query1)
for row in result1:
  customerName=row[0]
  country=row[1]
  limitCredit=row[2]
  print("{0},{1},{2}".format(customerName,country,limitCredit))
query2 = "UPDATE customers c SET c.creditLimit = c.creditLimit * 1.10 WHERE c.country = 'Spain'"
result2 = run_query(query2)
print("Updated")
query3 = "SELECT c.customerName, c.country, c.creditLimit FROM customers c WHERE c.country = 'Spain'"
result3 = run_query(query3)
for row in result3:
  customerName=row[0]
  country=row[1]
  limitCredit=row[2]
  print("{0},{1},{2}".format(customerName,country,limitCredit))

print(query1)
print(query2)
print(query3)