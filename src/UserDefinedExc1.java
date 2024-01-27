import java.lang.*;
class cexcep extends Exception
{
String st;
cexcep(String message)
{
super(message); st=message;
}
void disp()
{
System.out.println(st);
}
}
class UserDefinedExc1
{
public static void main(String args[])
{
int x=5;
int y=1000;
try
{
float z= (float) x / (float) y; if(z<0.01)
{
throw new cexcep("number is too small");
}
}
catch(cexcep e)
{
System.out.println("Caught my exception");
System.out.println(e.getMessage()); e.disp();
}
finally
{
System.out.println("I am always here");
}}	}
