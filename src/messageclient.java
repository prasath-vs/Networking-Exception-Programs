import java.io.*;
import java.util.Scanner; 
import java.net.*;

public class messageclient {
	public static void main(String[] args) throws Exception { 
		Socket soc = new Socket("127.0.0.1", 9092);
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter the string to transfer from client:"); 
		String message = s.nextLine();
		PrintWriter out = new PrintWriter(soc.getOutputStream(),true); 
		out.println(message);
		soc.close();	
	}
}
