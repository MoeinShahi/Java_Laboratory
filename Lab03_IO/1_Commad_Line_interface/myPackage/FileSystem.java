package myPackage;

import java.io.File;
import java.util.Scanner;

public class FileSystem {
    private static String currentPath = System.getProperty("user.dir");

    public void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a command ");
                String userInput = scanner.nextLine();

                String[] tokens = userInput.split("\\s+");
                if (tokens.length == 0) {
                    System.out.println("no commands");
                    continue;
                }
                String command = tokens[0];

                String argument = null;

                if (tokens.length > 1) {
                    argument = tokens[1];
                }
                String newDirecoryPath = currentPath + File.separator + argument;
                File newDirectory = new File(newDirecoryPath);

                switch (command) {
                    case "cd":
                        if (newDirectory.exists() && newDirectory.isDirectory()) {
                            currentPath = newDirecoryPath;
                        } else
                            System.out.println("Directory did not found! ");
                        break;
                    case "ls":
                        File currentDirectory = new File(currentPath);
                        File[] files = currentDirectory.listFiles();
                        if (files != null) {
                            for (File file : files)
                                System.out.println(file.getName());
                        }
                        break;
                    case "pwd":
                        System.out.println("Current directory: " + currentPath);
                        break;
                    case "help":
                        System.out.println("Availble commands:cd\npwd\nls");
                    default:
                        System.out.println("Unknown command: " + command);
                        System.out.println("Type help for list the commands");
                        break;
                }

            }
        }
    }
}