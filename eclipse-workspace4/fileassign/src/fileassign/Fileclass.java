package fileassign;
import java.io.*;
import java.util.Scanner;
public class Fileclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    try {
	      File myObj = new File("C:\\Users\\khav2c18462\\eclipse-workspace4\\filename1");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	    
	    try {
	        FileWriter myWriter = new FileWriter("C:\\Users\\khav2c18462\\eclipse-workspace4\\filename1");
	        myWriter.write("i am in java training\nThey taught me filehandling concept\nAnd also exception concept ");
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	 
	    try {
	        File myObj = new File("C:\\Users\\khav2c18462\\eclipse-workspace4\\filename1");
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    
	  
	
	 //////// 
	    try
		{
			FileWriter fw = new FileWriter("C:\\Users\\khav2c18462\\eclipse-workspace4\\filename1");
			fw.write("i am in java training\nThey taught me filehandling rewrite concept\nAnd also exception concept ");
			fw.close();
			
			System.out.println("File has been Successfully Rewritten");
		}
		catch(IOException e)
		{
			System.out.println("Error occured");
		}
	   /* try {
	        File myObj = new File("C:\\Users\\khav2c18462\\eclipse-workspace4\\filename1");
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }*/
	    
	    try{
			File ef= new File("Emptyfile.txt");
		ef.createNewFile();
		if(ef.length()==0) {
			ef.delete();
			System.out.println("sucessfully deleted");
		}else
		{
			System.out.println("failed");
		}
		}
		catch(IOException e) 
		{
			System.out.println(e);
		}
		
	File d= new File("Document\\Emptyfile.txt");
		if(d.exists()) {
			System.out.println("file is exist in correct path");
		}else {
			System.out.println("Wrong path");
             }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	 
	    
	}

}
