# EmployeeManagementSystem
Employee Management System Project in Spring Boot

Tools and technologies used:
    Java 8
    Spring Boot
    Spring Data JPA
    MySQL
    Spring Tool Suite 
    
API Details :


1) Hit url : "http://localhost:8080/employee/" to search all employees details in JSON Formate 
Request Type: GET
OutPut : [
    {
        "empId": 1,
        "empName": "Aman",
        "empEmail": "aman@gmail.com",
        "empPhone": "9873216540",
        "empAddress": "New-Delhi"
    },
    {
        "empId": 2,
        "empName": "Raman",
        "empEmail": "raman@gmail.com",
        "empPhone": "9685216540",
        "empAddress": "New-Delhi"
    }
]

2) Hit url : "http://localhost:8080/employee/" to add new employee details in db
Request Type: POST
formate :  {
        "empName": "Aman Sharma",
        "empAddress": "Delhi",
        "empEmail": "amansharma@gmail.com",
        "empPhone": "9638216221"
    }
    

3) Hit url : "http://localhost:8080/employee/1" to update existing employee details in db
Request Type: PUT
formate :  {
        "empName": "Aayush",
        "empAddress": "Delhi",
        "empEmail": "aayush@gmail.com",
        "empPhone": "9638216221"
    }    

4) Hit url : "http://localhost:8080/employee/1" to search employee details in JSON Formate where empID=1 
Request Type: GET
OutPut :  {
        "empId": 1,
        "empName": "Aman",
        "empEmail": "aman@gmail.com",
        "empPhone": "9873216540",
        "empAddress": "New-Delhi"
    }
    
5) Hit url : "http://localhost:8080/employee/email/aayush@gmail.com" to search employee details by empEmail 
Request Type: GET
OutPut :  {
        "empId": 1,
        "empName": "Aman",
        "empEmail": "aman@gmail.com",
        "empPhone": "9873216540",
        "empAddress": "New-Delhi"
    }    

6) Hit url : "http://localhost:8080/employee/phone/9873216540" to search employee details by empPhoneNumber 
Request Type: GET
OutPut :  {
        "empId": 1,
        "empName": "Aman",
        "empEmail": "aman@gmail.com",
        "empPhone": "9873216540",
        "empAddress": "New-Delhi"
    }    


7) Hit url : "http://localhost:8080/employee/1" to delete employee details from db by empID
Request Type: DELETE
OutPut :  {
        "empId": 1,
        "empName": "Aman",
        "empEmail": "aman@gmail.com",
        "empPhone": "9873216540",
        "empAddress": "New-Delhi"
    }   
