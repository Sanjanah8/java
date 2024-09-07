# JAVA Lab Test – 1

### 1. Package Operations:
Write a Java program that uses packages in different files for different number operations:
- **Factorial**
- **Fibonacci**

---

### 2. Library Management System using JDBC:
Write a Java program to implement JDBC connectivity for a Library Management System. The system should:
- Insert 5 new book records into the database with fields: **Book ID**, **Book Title**, **Author**, **Publication Year**, **Genre**.
  - **a)** Remove a book authored by Srimathi.
  - **b)** Display all the books in the library.

---

### 3. Bank Operations Interface:
Write a Java program to create an interface for Bank operations and implement it in an Account class.

---

### 4. Hotel Management System using JDBC:
Write a Java program to implement JDBC connectivity for a Hotel Management System. The table should contain details like **Guest ID**, **Name**, **Room Number**, **Check-in Date**, and **Number of Nights**.
- **a)** Search an existing guest record based on **Guest ID**.
- **b)** Display all the records.

---

### 5. String Operations:
Write a Java program to implement the following string operations using different types of constructors:
- **Palindrome Checking**
- **Substring Finding**
- **Equal String**

---

### 6. Movie Management System:
Define a table **MOVIES** with the columns: **id**, **title**, **genre**, and **year of release**.
- **a)** Add five records to the MOVIES table.
- **b)** Modify selected records.
- **c)** Delete a selected record with specific attributes.
- **d)** Display all other records.

---

### 7. Room Class:
Write a program to create a `Room` class with attributes:
- **roomno**, **roomtype**, **roomarea**, and **AC machine**.
The member functions of this class should be:
- **setdata** and **displaydata**.

---

### 8. Employee Pay Slip Application using JDBC:
Write a Java program to develop an Employee Pay Slip application. The table should contain the following fields:
- **empid**, **name**, **Basic Salary**, **PF**, **DA**, **HRA**, **Gross pay**, and **Net pay**.
  - **a)** Remove the **PF amount** for employees with a basic salary of less than ₹20,000.
  - **b)** Display employee details where **Net Pay** is more than ₹1 lakh.
  - **c)** Implement a feature to provide a **5% salary incentive** to employees who have not taken any leave in the current month and update their salary accordingly.

---

### 9. Array Search and Custom Exception:
Write a Java program to search for an element in an array and return its position. Throw an exception if the element is not found in the array. Create a custom exception if the array length is 1. Use a **linear search** algorithm.

---

### 10. Simple Banking System using JDBC:
Write a Java program to develop a simple banking system using JDBC to manage customer accounts and perform transactions.
- **a)** Add a new customer account with details: **Customer ID**, **Name**, **Address**, and **Initial Balance**.
- **b)** Modify the account details of the customer with **Customer ID 22**.
- **c)** Remove an account from the system using **Customer ID**.
- **d)** Withdraw funds from an existing account while ensuring there is a sufficient balance.

---

### 11. Thread-Based Q&A:
Write a Java program to have a **Question-and-Answer** session using threads. One thread should ask questions, while another searches and answers from a **QA array**.

---

### 12. Loan Management System using JDBC:
Write a Java program to implement JDBC connectivity for a Loan Management System. Each loan record should include:
- **Loan ID**, **Customer Name**, **Customer ID**, **Loan Amount**, **Loan Type**, **Interest Rate**, **Loan Tenure (in years)**, **Application Date**.
  - **a)** Update an existing loan application based on its **Loan ID**.
  - **b)** Remove ineligible loan applications from the database.
  - **c)** Calculate and store the monthly installment amount for a loan based on **loan amount**, **interest rate**, and **tenure**.

---

### 13. Frequency of Array Elements:
Write a Java program to find the frequency of all elements in an array using an interface and remove duplicate elements.

---

### 14. Student Marks List using JDBC:
Write a Java program to develop a student marks list application using JDBC. The table should contain:
- **student id**, **student name**, **fee**, **mark1**, **mark2**, **mark3**, **total**, **average**, **grade**.
  - **a)** Remove students with a grade of **D**.
  - **b)** Display students who scored more than **250 in total**.
  - **c)** Provide a **5% discount** on the fee for students who scored higher marks, and update the fee accordingly.

---

### 15. Find Vowels in a String:
Write a Java program to find all the vowels present in a string using inheritance and write the vowels to a separate text file.

---

### 16. Electricity Billing System using JDBC:
Write a Java program to implement JDBC connectivity for an Electricity Billing System. The table should include:
- **Customer ID**, **Name**, **Address**, **Meter Number**, **Previous Reading**, **Current Reading**, and **Bill Amount**.
  - **a)** Calculate and store the **bill amount** using meter readings.
  - **b)** Retrieve all customer details (**Customer ID**, **Name**, **Address**).

---

### 17. Multi-Threaded Application:
Write a Java program to implement a multi-thread application with three threads:
- First thread generates a random integer every 1 second.
  - If the value is even, the second thread computes and prints the square of the number.
  - If the value is odd, the third thread prints the cube of the number.

---

### 18. Online Shopping System using JDBC:
Write a Java program to implement JDBC connectivity for an Online Shopping System. Each product record should include:
- **Product ID**, **Product Name**, **Category**, **Price**, and **Quantity in Stock**.
  - **a)** Update the details of an existing product based on its **Product ID (14)**.
  - **b)** Retrieve products by category, with the **category** as a user input.

---

### 19. Interface for Sports:
Write a Java program to create an interface **Playable** with a method `play()` that takes no arguments and returns void. Create three classes: **Football**, **Volleyball**, and **Basketball** that implement the **Playable** interface and override the `play()` method to play the respective sports.

---

### 20. Movies Management System using JDBC:
Write a Java program to implement JDBC connectivity to perform insert, update, delete, and retrieve operations in the **MOVIES** table. The table should have columns: **id**, **title**, **genre**, and **year of release**.
  - **a)** Modify selected records.
  - **b)** Delete a selected record.
  - **c)** Display all other records.

---

### 21. Product Inventory System using JDBC:
Write a Java program to implement JDBC connectivity for a Product Inventory System. The table should contain:
- **Product ID**, **Product Name**, **Supplier Name**, **Quantity in Stock**, and **Price**.
  - **a)** Update the stock of a product based on **Product ID (32)**.
  - **b)** Display all the products with their details.

---

### 22. Hotel Reservation System:
Write a Java program to develop a simple Hotel Reservation System that includes:
- **Booking ID**, **Customer Name**, **Room Number**, **Check-in Date**, and **Check-out Date**.
  - **a)** Search for a reservation based on **Booking ID**.
  - **b)** Display all bookings in the hotel.

---

### 23. Custom Exception for Invalid Age:
Write a Java program that creates a custom exception called **InvalidAgeException**. The exception should be thrown if the user tries to register for a course but is below 18 years of age. The program should prompt for age and raise the exception if the age criteria are not met.

---

### 24. Vehicle Rental System using JDBC:
Write a Java program to implement JDBC connectivity for a Vehicle Rental System. Each vehicle record should include:
- **Vehicle ID**, **Vehicle Type**, **Rental Price**, **Availability**, and **Rental Duration**.
  - **a)** Modify the rental duration for a vehicle based on its **Vehicle ID**.
  - **b)** Retrieve the details of available vehicles for rental.

---

