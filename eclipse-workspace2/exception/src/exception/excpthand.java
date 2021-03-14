package exception;
import java.util.Scanner;
//import java.util.Scanner;
public class excpthand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers :");
		
Scanner sc= new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
String s=null;
int op;
System.out.println("Enter the option:");
op=sc.nextInt();

switch(op)
{
case 1:
	  try {
	  c=a/b;
	   System.out.println("The value of c is :" +c);
      }
      catch(ArithmeticException e) {
	   System.out.println("Error in arithmetic");
       }
       break;
case 2:
	   try {
	   System.out.println("String is: "+ s.charAt(0));
       }
       catch(NullPointerException e) {
    	System.out.println("nullptrexception");
       }
       break;
case 3:
	 try {
	    int k= Integer.parseInt ("anil") ;
	    System.out.println("name is :"+k);
        }
      catch(NumberFormatException e) {
	      System.out.println("numexception");
          }
       break;
case 4:
	try {
	String k="khaviya";
	System.out.println("The char is:"+k.charAt(7));
     }
    catch(StringIndexOutOfBoundsException e){
    System.out.println ("String Index is Out Of Bounds");
     }
      break;
case 5:
	    try {
            int y[] = new int[5];
            y[6] = 9; 
	       }
	     catch(ArrayIndexOutOfBoundsException e){
	      System.out.println ("Array Index is Out Of Bounds");
	     }
          break;
default:
	System.out.println("invalid");
	break;
}
	}

}
