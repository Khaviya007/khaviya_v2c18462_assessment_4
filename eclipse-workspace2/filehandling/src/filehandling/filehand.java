package filehandling;
import java.io.File;  
import java.io.FileWriter; 
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;  
public class filehand {

	public static void main(String[] args) {
		
		    try {
		      File myObj = new File("filename.txt");
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
		        FileWriter myWriter = new FileWriter("filename.txt");
		        myWriter.write("i am in java training");
		        myWriter.close();
		        System.out.println("Successfully wrote to the file.");
		      } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
	
		    try {
		        File myObj = new File("filename.txt");
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
		    
		    
	
	
	}
		}
	


