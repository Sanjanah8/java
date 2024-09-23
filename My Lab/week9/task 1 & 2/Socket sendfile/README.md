## Compiling and Running Java Socket Applications

### 1. Save the Files
Save each server and client code in separate `.java` files with the names given below:
- `SocketDateServer.java`
- `SocketDateClient.java`
- `SocketFileServer.java`
- `SocketFileClient.java`

### 2. Compile the Code
1. Open Command Prompt.
2. Navigate to the directory where you saved the Java files. You can use the `cd` command, for example:
   ```bash
   cd C:\path\to\your\java\files
   ```
3. Compile the Java files using:
   ```bash
   javac SocketDateServer.java SocketDateClient.java
   javac SocketFileServer.java SocketFileClient.java
   ```

### 3. Run the Server
Start the server in one Command Prompt window:
- For the date server:
   ```bash
   java SocketDateServer
   ```
- For the file server:
   ```bash
   java SocketFileServer
   ```

### 4. Run the Client
Open another Command Prompt window and run the client:
- For the date client:
   ```bash
   java SocketDateClient
   ```
- For the file client:
   ```bash
   java SocketFileClient
   ```
