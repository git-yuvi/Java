import java.io.*;
interface Prototype
{
public Prototype getClone();
}
class StudentRecord implements Prototype
{
String name,dept;
int id,m1,m2,m3,tot;
float avg;
StudentRecord()
{
System.out.println("\tname\tid\tdept\tm1\tm2\tm3\ttotal\taverage");
}
StudentRecord(String name,int id,String  dept,int m1,int m2,int m3)
{
this();
this.name=name;
this.id=id;
this.dept=dept;
this.m1=m1;
this.m2=m2;
this.m3=m3;
}
void showRecord()
{
tot=m1+m2+m3;
avg=tot/3;
System.out.println("\t"+name+"\t"+id+"\t"+dept+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+tot+"\t"+avg);
}
public Prototype getClone()
{
return new StudentRecord(name,id,dept,m1,m2,m3);
}
}
class PrototypeDesign1
{
public static void main(String args[])throws IOException
{
DataInputStream ds=new DataInputStream(System.in);
System.out.println("\n\t PROTOTYPE DESIGN PATTERN");
System.out.println("\n\t ***********************");
System.out.println("STUDENT DETAILS");
System.out.print("Enter the name:");
String  name=ds.readLine();
System.out.print("Enter id:");
int id=Integer.parseInt(ds.readLine());
System.out.print("Enter department:");
String  dept=ds.readLine();
System.out.print("Enter mark1:");
int m1=Integer.parseInt(ds.readLine());
System.out.print("Enter mark2:");
int m2=Integer.parseInt(ds.readLine());
System.out.print("Enter mark3:");
int m3=Integer.parseInt(ds.readLine());
StudentRecord s=new StudentRecord(name,id,dept,m1,m2,m3);
StudentRecord s1=(StudentRecord)s.getClone();
s.showRecord();
}
}
