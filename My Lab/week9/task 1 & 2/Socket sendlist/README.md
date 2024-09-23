## Socket_SendList Application

### Overview
This application demonstrates a simple client-server model where a server sends a list collection object to a client using Java sockets.

### Files Included
- `SocketListServer.java`: The server code that sends a list of items.
- `SocketListClient.java`: The client code that receives and displays the list.

### Instructions to Compile and Run

1. **Save the Files**
   - Save the server code as `SocketListServer.java`.
   - Save the client code as `SocketListClient.java`.

2. **Compile the Code**
   - Open Command Prompt.
   - Navigate to the directory where you saved the Java files using the `cd` command. For example:
     ```cmd
     cd C:\path\to\your\java\files
     ```
   - Compile the Java files using:
     ```cmd
     javac SocketListServer.java SocketListClient.java
     ```

3. **Run the Server**
   - Start the server in one Command Prompt window:
     ```cmd
     java SocketListServer
     ```

4. **Run the Client**
   - Open another Command Prompt window and run the client:
     ```cmd
     java SocketListClient
     ```
