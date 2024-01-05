//insertAREA OF circle
class Circle
int radius;
void insert(int r)
{
radius=r;
}
void calculateArea()
{
System.out.println(2*3.14*radius);
}
}
class TestCircle1
{
public static void main(String args[])
{
Circle c1=new  Circle();
c1.insert(11);
c1.calculateArea();
}
}




