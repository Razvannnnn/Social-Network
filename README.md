# Social Network Application

Welcome to the **Social Network Application**! This application provides a user-friendly platform for connecting with friends, managing friendships, and communicating seamlessly, all within an intuitive graphical user interface (GUI) developed using JavaFX.

---

## Features

### Key Functionalities:

- **User Authentication**: Secure login and registration functionality for personalized access.
- **Manage Friendships**:
  - View a list of friends.
  - Send and receive friend requests.
  - View your pending friend requests.
  - Get notifications of new friend requests.
- **Chat Room**: Seamless communication through an interactive chat feature.
- **Database Integration**: Efficient and reliable management of user data and interactions.

---

## Implementation Details

### Database

- **PostgreSQL**: The application uses PostgreSQL for robust and scalable database management.

### Design Patterns

- **Singleton**: Ensures a single instance of critical components such as the database connection manager, providing efficient and centralized access.
- **Observer**: Implements real-time notifications for friend requests and chat updates.
- **Decorator**: Enhances user interface components dynamically, ensuring flexibility and reusability.

### Architectural Principles

- **Layered Architecture (Arhitectură Stratificată)**: The application is structured into distinct layers, such as presentation, business logic, and data access, promoting separation of concerns and easier maintenance.
- **Domain-Driven Design (DDD)**: The application models its core logic and processes based on the business domain, ensuring that features align closely with user requirements.

### Additional Features

- **Paging**: The main menu implements paging to efficiently display a large list of friends without overwhelming the interface.

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

## License

This project is licensed under the [MIT License](LICENSE).

---

Enjoy connecting with your friends on the Social Network Application!
