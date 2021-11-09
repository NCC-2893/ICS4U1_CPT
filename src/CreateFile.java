import java.io.File;  
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {        
    public static void createFile(String args[]) throws IOException {          
        // Create file
        // If createNewFile is true, print "File created.", otherwise print "The file already exists."
        String fileName = "Solution";              
        File myFile = new File(fileName);
        if (myFile.createNewFile()) {
            System.out.println("File created.");
            // Write to file
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write("Solution");
            myWriter.close();
        } else {
            System.out.println("The file already exists.");
        }
        System.out.println();           
    }
}