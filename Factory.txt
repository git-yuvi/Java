import java.io.*;
abstract class EBBill
{
protected double rate;
abstract void getrate();
public void calculateBill(int units)
{
System.out.println(units*rate);
}
}
class Domestic extends EBBill
{
public void getrate()
{
rate=3.50;
}
}
class Institutional extends EBBill
{
public void getrate()
{
rate=5.50;
}
}
class Commercial extends EBBill
{
public void getrate()
{
rate=7.50;
}
}
class GetPlanFactory
{
public EBBill getPlan(String plantype)
{
if(plantype==null)
{
return null;
}
if(plantype.equalsIgnoreCase("Domestic"))
{
return new Domestic();
}
else if(plantype.equalsIgnoreCase("Institutional"))
{
return new Institutional();
}
else if(plantype.equalsIgnoreCase("Commercial"))
{
return new Commercial();
}
return null;
}
}
class Factory
{
public static void main(String args[])throws IOException
{
GetPlanFactory p=new GetPlanFactory();
DataInputStream ds=new DataInputStream(System.in);
System.out.println("\n\t FACTORY DESIGN PATTERN");
System.out.println("\n\t ******** ******* ******");
System.out.print("Enter the planname:");
String planname=ds.readLine();
System.out.print("Enter the units:");
int units=Integer.parseInt( ds.readLine());
EBBill p1=p.getPlan(planname);
System.out.print("Bill amount for " +planname+" is ");
p1.getrate();
p1.calculateBill(units);
}
}
