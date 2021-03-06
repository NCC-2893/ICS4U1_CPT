/**
 * Marcus Moreira
 * 11/10/2021
 * CreateFile.java
 */

import java.io.File;  
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {    
    // Create a CSV file with calculated resualts to intercept object 

    public void createFile(Velocity[] arr) throws IOException {          
        // If createNewFile is true, print "File created.", otherwise print "The file already exists."
        
        String fileName = "Solution.csv";              
        File myFile = new File(fileName);

        if (myFile.createNewFile()) {
            System.out.println("File created.");
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write("ConstantSpeed, Acceleration, TimeAtIntercept, DistanceToIntercept, SpeedAtIntercept\r\n");
            for (Velocity v: arr){
                myWriter.write(v.toString());
            }
            myWriter.close();
        } else {
            System.out.println("The file already exists.");
        }

        System.out.println();           
    }
}
