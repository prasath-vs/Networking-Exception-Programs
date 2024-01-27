import java.net.*; 

class UDPServer {
	public static void main(String args[]) throws Exception { 
		DatagramSocket serverSocket = new DatagramSocket(9876);
		byte[] receiveData = new byte[20]; 
		byte[] sendData = new byte[20]; 
		while(true) 
		{ 
			System.out.println("Ready to transfer:");
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			serverSocket.receive(receivePacket);
			String sentence = new String(receivePacket.getData()); 
			InetAddress IPAddress = receivePacket.getAddress();
			System.out.println("Received :" +sentence+" from "+IPAddress.getHostAddress()); 
			String capitalizedSentence = sentence.toUpperCase();
			sendData = capitalizedSentence.getBytes();
			int port = 0;
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress,port); 
			serverSocket.send(sendPacket); 
		} 
	} 
}
