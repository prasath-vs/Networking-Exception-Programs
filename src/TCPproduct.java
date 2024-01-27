import java.io.*; 
import java.net.*; 

public class TCPproduct {
public static void main(String[] args) { 
	try {
	
			ServerSocket serverSocket = new ServerSocket(12345); 
			System.out.println("Server waiting for a connection..."); 
			Socket clientSocket = serverSocket.accept(); 
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); 
			String clientInput = in.readLine();
			System.out.println("Received message from client " + clientSocket.getInetAddress() + ": " + clientInput);
	
			int number = Integer.parseInt(clientInput); 
			int product = calculateDigitProduct(number); 
			out.println(product);
	
			in.close();
			out.close(); 
			clientSocket.close(); 
			serverSocket.close();
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}

private static int calculateDigitProduct(int number) {
	// TODO Auto-generated method stub
	return 0;
}
}

