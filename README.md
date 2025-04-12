Aadhaar Card Management System (Backend using Core Java & OOP)

📌 Project Description:
The Aadhaar Card Management System is a console-based backend application developed using Core Java and Object-Oriented Programming (OOP) principles. This system allows users to store, retrieve, update, delete, and list Aadhaar card details for individuals. The application uses in-memory storage with a HashMap to simulate a simple database. It demonstrates modular design, encapsulation, abstraction, and method-driven development, making it a perfect example of practical Java OOP implementation.

🔧 Key Features:

✅ Add Aadhaar details (Card Number, Name, DOB, Gender, Address)
🔍 View details of a specific Aadhaar card
✏️ Update existing Aadhaar records
❌ Delete Aadhaar record
📄 List All stored Aadhaar records
🚪 Exit the program safely

🧰 Technologies Used:
1. Java SE (Core Java)
2. OOP (Classes, Objects, Encapsulation, Inheritance)
3. Collections Framework – HashMap
4. Scanner for console input

📁 Class Overview:
1. AadhaarCardDetails.java
Represents the Aadhaar entity with fields:
Aadhaar Number
-> Name
-> Date of Birth
-> Gender
-> Address
Includes constructors, getters/setters, and a Display() method to show details.

2. AadhaarCardService.java
Handles all core operations:
-> Add
-> View
-> Update
-> Delete
-> List all
Uses a HashMap<String, AadhaarCardDetails> as an in-memory database.

3. Main.java
The main class that presents a menu-driven interface to the user and delegates tasks to the service layer.
📚 Learning Outcomes:
-> Applying object-oriented principles in real-world Java applications
-> Managing data using Java Collections
-> Implementing CRUD operations in a backend environment
-> Handling user input and validation through console I/O

