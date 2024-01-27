import java.util.Scanner;
 
import java.net.*;
public class messageserver {
 
  //For Connection –Oriented Protocol (TCP)	
	public static void main(String[] args) throws Exception { 
		Socket socket=null;
		ServerSocket listener = new ServerSocket(9092); 
		while (true) 
		{
			socket = listener.accept(); //establishes connection and waits for the client 
			Scanner input=new Scanner(socket.getInputStream());
			String answer = input.nextLine(); 
			System.out.println("The Client User Message: "+answer); 
			socket.close();
		} 
	}
}
