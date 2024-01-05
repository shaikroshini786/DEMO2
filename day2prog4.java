//  input character is yes or not and vowel or consonents
import java.util.Scanner;
class Test2
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if((c>='A' && c<='Z')||(c>='a' && c<='z'))
System.out.println("yes it a character");
else
System.out.println("it is spectial character or number");
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'|| c=='E'|| c=='I'|| c=='O'||c=='U')
System.out.println("voewl");
else
System.out.println("consonents");
 
System.out.println("No");
}
}