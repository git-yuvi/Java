import java.io.*;
class Student
{
String name,dept;
int id;
Student(String n,int i,String d)
{
 name=n;
id=i;
dept=d;
}
}
class Marksheet extends Student
{
int m1,m2,m3,tot; 
float avg;
Marksheet(String n,int i,String d,int mark1,int mark2,int mark3)
{
super(n,i,d);
m1=mark1;
m2=mark2;
m3=mark3;
}
void calc()
{
tot=m1+m2+m3;
avg=tot/3;
System.out.println();
System.out.println("RESULT");
System.out.println("******");
System.out.println();
System.out.println("\n Name           :"+name);
System.out.println("\n ID             :"+id);
System.out.println("\n Department     :"+dept);
System.out.println("\n Mark1          :"+m1);
System.out.println("\n  Mark2         :"+m2);
System.out.println("\n Mark3          :"+m3);
System.out.println("\n Total          :"+tot);
System.out.println("\n Average        :"+avg);
}
}
class SingleInheritance
{
public static void main(String args[])throws IOException
{
DataInputStream ds=new DataInputStream(System.in);
System.out.print("\n\t SINGLE INHERITANCE");
System.out.print("\n\t ******* **********");
System.out.print("\n STUDENT DETAILS");
System.out.print("\n Enter name           :");
String name=ds.readLine();
System.out.print("\n Enter id             :");
int id=Integer.parseInt(ds.readLine());
System.out.print("\n Enter Department     :");
String dept=ds.readLine();
System.out.print("\n Enter Mark1          :");
int m1=Integer.parseInt(ds.readLine());
System.out.print("\n Enter Mark2          :");
int m2=Integer.parseInt(ds.readLine());
System.out.print("\nEnter  Mark3          :");
int m3=Integer.parseInt(ds.readLine());
Marksheet m=new Marksheet(name,id,dept,m1,m2,m3);
m.calc();
}
}
