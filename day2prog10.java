//FOR EMPLOYEE
//INITIALIZATION THROUGH METHOD
class Employee
{
int no;
String name;
String dep;
void insertRecord(int r,String n,String p)
{
no=r;
name=n;
dep=p;
}
void displayInformation()
{
System.out.println(no+" "+name+" "+dep);
}
}
class TestEmployee4
{
public static void main(String args[])
{
Employee e1=new  Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(111,"roshini","indigo");
e2.insertRecord(112,"rihana","infosys");
e3.insertRecord(113,"Arbeena","mahendra tech"); 
e1.displayInformation();
e2.displayInformation();
e3.displayInformation();
}
}




 
