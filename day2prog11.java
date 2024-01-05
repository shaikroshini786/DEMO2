//insertAREA OF RECTANGLE
class Rectangle
{
int length;
int breadth;
void insert(int l,int b)
{
length=l;
breadth=b;
}
void calculateArea()
{
System.out.println(length*breadth);
}
}
class TestRectangle1
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
r1.insert(11,5);
r1.calculateArea();
}
}




