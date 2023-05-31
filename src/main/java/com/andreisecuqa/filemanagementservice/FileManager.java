package com.andreisecuqa.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    //    createTheFileIdItDoesNotExist(File file).
    public static void createTheFileIfItDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file already exists");
        } else {
            System.out.println("The file does not exist, it has to be create");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception: " + e.getMessage());
            }
        }
    }

    //    informIfTheTheFileExists(File file).
    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file is present");
        } else {
            System.out.println("The file is not present");
        }
    }

    //    printTheFileName(File file).
    public static void printTheTheFileName(File file) {
        System.out.println("The file name is: " + file.getName());
    }

    //    printTheFileAbsolutePath(File file).
    public static void printTheFileAbsolutePath(File file) {
        System.out.println("The file absolute path: " + file.getAbsolutePath());
    }

    //    printIfTheFileIsADirectory(File file).
    public static void printIfTHeFileIsADirectory(File inputFile) {
        System.out.println("The file is a directory: " + inputFile.isDirectory());
//        if (inputFile.isDirectory()){
//            System.out.println("This is a directory");
//        } else {
//            System.out.println("This is a file");
//        }
    }

    //deleteTheFileIfExists(File file).
    public static void deleteTheFileIfExists(File inputFile) {
        if (inputFile.exists()) {
            if (inputFile.delete()) {
                System.out.println("The file was deleted");
            } else {
                System.out.println("The file exists, but was not deleted");
            }
        } else {
            System.out.println("The file does not exist");
        }
    }


}
