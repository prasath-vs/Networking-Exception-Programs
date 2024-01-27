import java.net.*;

class URLDemo
{
	public static void main(String args[]) throws MalformedURLException
	{ 
		String urlstr="https://vtop.vit.ac.in:80/faculty/home.asp?user=mareeswari&pwd=vit";
		URL url1=new URL(urlstr);
		System.out.println("Ext:" + url1.toExternalForm()); 
		System.out.println("Protocol: " + url1.getProtocol());
		System.out.println("Host: " + url1.getHost());
		System.out.println("Port: "+ url1.getPort()); 
		System.out.println("File: " + url1.getFile());
		System.out.println("Path: "+url1.getPath());
		System.out.println("Query: " + url1.getQuery());
	}
}