import java.io.*;
import java.lang.*; 
class Singleton1
{
private static Singleton1 single_instance=null; 
public String s;
private Singleton1(String s)
{
this.s=s;
}
public static Singleton1 getInstance(String s)
{
if(single_instance==null) 
single_instance=new Singleton1(s);
return single_instance;
}
}
class SingletonDesignPattern
{
public static void main(String args[])throws IOException
{
DataInputStream ds=new DataInputStream(System.in); 
System.out.println("Enter string1:");
String s1=ds.readLine();
System.out.println("Enter string2:"); 
String s2=ds.readLine(); 
System.out.println("Enter string3:"); 
String s3=ds.readLine();
Singleton1 x=Singleton1.getInstance(s1); 
Singleton1 y=Singleton1.getInstance(s2); 
Singleton1 z=Singleton1.getInstance(s3); 
x.s=(x.s).toUpperCase(); 
System.out.println("String from x is:"+x.s); 
System.out.println("String from y is:"+y.s); 
System.out.println("String from z is:"+z.s); 
z.s=(z.s).toLowerCase(); 
System.out.println("String from x is:"+x.s); 
System.out.println("String from y is:"+y.s); 
System.out.println("String from z is:"+z.s);
}
}
