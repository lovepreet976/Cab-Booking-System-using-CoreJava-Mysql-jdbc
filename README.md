# Cab-Booking-System-using-CoreJava-Mysql-jdbc
The cab booking system is a software application designed to simplify the process of booking and managing cab rides. Built using core Java programming, the system integrates with a MySQL database through the JDBC (Java Database Connectivity) API, and utilizes the AWT (Abstract Window Toolkit) and Swing libraries for the GUI.
The core functionality of the cab booking system includes:
User Registration and Authentication:
The system allows users to register and create an account by providing personal details such as name, contact information. Users can log in to the system using their registered credentials, which are securely stored and verified against the MySQL database.
Cab Availability and Booking: 
The system maintains a database of available cabs, including their location, driver details, and pricing information. Upon booking, the system records the trip details, including the pickup and drop-off locations, the selected cab.
Driver Management: 
The system maintains a database of registered drivers, including their personal details, vehicle information. Cab drivers can register with the system and update their availability and location status. The system assigns booked trips to the most suitable available driver.
The implementation of the cab booking system using core Java, MySQL, JDBC, and the AWT and Swing libraries involves the following key components: 
User Interface (GUI): 
The AWT and Swing libraries are used to create a user-friendly and responsive graphical interface for the cab booking system. This includes various windows, forms, and dialogs for user registration, cab booking, payment, and trip history.
Database Connectivity:
The JDBC API is used to establish a connection between the Java application and the MySQL database, allowing for the storage and retrieval of user, cab, and trip data. Business Logic:
The core Java code implements the business logic of the cab booking system, including user authentication, cab availability and booking, payment processing, and trip management.
Exception Handling and Error Reporting: 
The system includes robust exception handling mechanisms to gracefully handle any errors or unexpected situations, and provide informative error messages to the users.

Overall, the cab booking system leverages the power of core Java, MySQL, JDBC, and the AWT and Swing libraries to deliver a comprehensive and user-friendly solution for managing cab rides and transportation services.

