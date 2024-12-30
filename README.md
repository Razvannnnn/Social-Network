# Social Network Application

Welcome to the **Social Network Application**! This application provides a user-friendly platform for connecting with friends, managing friendships, and communicating seamlessly, all within an intuitive graphical user interface (GUI) developed using JavaFX.

---

## Features

### Key Functionalities:

- **User Authentication**: Secure login and registration functionality for personalized access.
- **Manage Friendships**:
  - View a list of friends.
  - Send and receive friend requests.
  - Get real-time notifications for new friend requests.
- **Chat Room**: Seamless communication through an interactive chat feature.
- **Database Integration**: Efficient and reliable management of user data and interactions.

---

## Screenshots

### Login Page

![Login Page](images/LogIn.png)

### Registration Page

![Registration Page](images/Register.png)

### Main Menu

The main menu provides an overview of your friends and access to other functionalities.
![Main Menu](images/Menu.png)

### Friend Requests

Easily manage incoming and outgoing friend requests.
![Friend Requests](images/Friend%20Request.png)

### Find New Friends

![New Friends](images/New%20Friends.png)

### Chat Room

Stay connected with friends through the chat room.
![Chat Room](images/Chat.png)

---

## Prerequisites

Ensure you have the following installed on your system:

- **Java Development Kit (JDK)** (version 11 or above).
- **JavaFX SDK**.
- A database server (e.g., MySQL) to manage user data.

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/social-network.git
   cd social-network
   ```
2. Set up the database:
   - Import the provided SQL script (if available) into your database.
   - Update the database connection details in the application configuration file.
3. Compile and run the application:
   ```bash
   javac -d out --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml src/**/*.java
   java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -cp out Main
   ```

---

## Usage

1. **Launch the Application**:
   - Run the `Main` class to start the app.
2. **Login or Register**:
   - Use the login screen to access your account, or register for a new account.
3. **Explore Features**:
   - View and manage your friends from the main menu.
   - Send and receive friend requests.
   - Chat with friends in the chat room.

---

## Technologies Used

- **Java**: Core application development.
- **JavaFX**: GUI development.
- **MySQL**: Database management.
- **JDBC**: Database connectivity.

---

## Contributing

We welcome contributions to enhance the Social Network Application! To contribute:

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/YourFeatureName
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push to your branch:
   ```bash
   git push origin feature/YourFeatureName
   ```
5. Open a pull request.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

## Contact

For any inquiries or feedback, please contact [your-email@example.com](mailto:your-email@example.com).

---

Enjoy connecting with your friends on the Social Network Application!
