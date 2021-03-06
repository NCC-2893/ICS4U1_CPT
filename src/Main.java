/**
 * Marcus Moreira
 * 11/10/2021
 * Main.java
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Velocity[] vel = new Velocity[5];
        
        vel[0] = new Velocity(80,3.6);
        vel[1] = new Velocity(100,3.6);
        vel[2] = new Velocity(90,3.6);
        vel[3] = new Velocity(130,3.6);
        vel[4] = new Velocity(50,3.6);

        // Sort the array using Bubble Sort based on the constant speed
        System.out.println();
        SortArray sort = new SortArray();
        sort.bubbleSort(vel);
        
        // Create a CSV file with calculated resualts to intercept object
        CreateFile DataFile = new CreateFile();
        DataFile.createFile(vel);
    }
}
