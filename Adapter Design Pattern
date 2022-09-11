public interface Student1
{
public void getid();
public void getname();
}


public class Details implements Student1
{
String name;
int id;
Details(String n,int i)
{
name=n;
id=i;
}
public void getid()
{
System.out.println("\n\t\t STUDENT MARK STATEMENT");
System.out.println("\n\t\t **********************");
System.out.println("\n ID:"+id);
}
public void getname()
{
System.out.println("\n Name:"+name);
}
}


public class Marks
{
int m1,m2,m3,tot;
float avg;
Marks(int mark1,int mark2,int mark3)
{
m1=mark1;
m2=mark2;
m3=mark3;
System.out.println("\n Mark1:"+m1);
System.out.println("\n Mark2:"+m2);
System.out.println("\n Mark3:"+m3);
}
public void gettotal()
{
tot=m1+m2+m3;
System.out.println("\n Total:"+tot);
}
public void getaverage()
{
avg=tot/3;
System.out.println("\n Average:"+avg);
}
}


import java.io.*;
class StudentDetails implements Student1
{
Marks mark;
public StudentDetails(Marks mark)
{
this.mark=mark;
}
public void getid()
{
mark.gettotal();
}
public void getname()
{
mark.getaverage();
if(mark.avg>=90)
System.out.println("\n Grade A");
else if(mark.avg>=90)
System.out.println("\n Grade B");
else if(mark.avg>=50)
System.out.println("\n Grade C");
else if(mark.avg>=35)
System.out.println("\n Grade D");
else 
System.out.println("\n Failed");
}
}
class AdapterDesign
{
public static void main(String args[])throws IOException
{
DataInputStream ds=new DataInputStream(System.in);
System.out.println("\n\t ADAPTER DESIGN PATTERN");
System.out.println("\n\t ***********************");
System.out.print("\n Enter the name:");
String  name=ds.readLine();
System.out.print("\n Enter id:");
int id=Integer.parseInt(ds.readLine());
System.out.print("\n Enter department:");
String  dept=ds.readLine();
System.out.print("\n Enter mark1:");
int m1=Integer.parseInt(ds.readLine());
System.out.print("\n Enter mark2:");
int m2=Integer.parseInt(ds.readLine());
System.out.print("\n Enter mark3:");
int m3=Integer.parseInt(ds.readLine());
Details d=new Details(name,id);
d.getid();
d.getname();
Marks m=new Marks(m1,m2,m3);
m.gettotal();
m.getaverage();
StudentDetails sd=new StudentDetails(m);
sd.getid();
sd.getname();
}
}
