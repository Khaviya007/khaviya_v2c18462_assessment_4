package nestedtrycatch;
//import java.lang.*;
public class nsttryclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,c;
        try {
        	c=a/2;
        	System.out.println("value is: "+c);
        	System.out.println("No exception");
        	try {
        		int k[]=new int[5];
        		k[8]=9;
        		System.out.println("array is: "+k);
        	}catch(ArrayIndexOutOfBoundsException e1) {
        		System.out.println("ArrayIndexOutofBoundsException");
        	}
        }catch(ArithmeticException e) {
        	System.out.println("ArithmeticException");
        }
        
	}

}
