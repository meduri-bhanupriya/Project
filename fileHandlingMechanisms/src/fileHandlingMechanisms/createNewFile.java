package fileHandlingMechanisms;
import java.io.File;  
import java.io.IOException;  
public class createNewFile   
{  
public static void main(String[] args)   
{     
File file = new File("C:\\demo\\music.txt"); //initialize File object and passing path as argument  
boolean result;  
try   
{  
result = file.createNewFile();  //creates a new file  
if(result)      // test if successfully created a new file  
{  
System.out.println("file created "); //returns the path string  
}  
else  
{  
System.out.println("File already exists: ");  
}  
}   
catch (IOException e)   
{  
e.printStackTrace();    //prints exception if any  
}         
}  
}  