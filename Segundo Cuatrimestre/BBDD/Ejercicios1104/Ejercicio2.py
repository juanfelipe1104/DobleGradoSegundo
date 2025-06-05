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
    data = cursor.fetchall()
    cursor.close()
    connection.close()
    return data

query = "INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit) VALUES (5000, 'Tech Innovations', 'Smith', 'John', '+1 555-1234', '123 Innovation Drive', NULL, 'New York', 'NY', '10001', 'USA', NULL, 50000.00)"
result = run_query(query)
print("Added customer")