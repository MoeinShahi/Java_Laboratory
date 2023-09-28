import java.io.*;
import java.util.*;

public class FileSystem{
    public static void main(String[] args){
        String currentDir = System.getProperty("user.dir");

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter a command");
            String userInput=scanner.nextLine();

            String[] tokens = userInput.split("\\s+");
            if(tokens.length== 0){
                System.out.println("no commands");
                continue;
            }
            String command = tokens[0];

            String argument = null;

            if(tokens.length > 1){
                argument = tokens[1];
            }

            switch(command){
                

            }


        }
        

    }
}