package com.andreisecuqa.filemanagementservice;

import java.io.File;

public class FileExecutionService {
    public static void main(String[] args) {

        File demoFile = new File("src/main/java/com/andreisecuqa/filemanagementservice/test.txt");

        FileManager.createTheFileIfItDoesNotExist(demoFile);
        FileManager.informIfTheFileExists(demoFile);
        FileManager.printIfTHeFileIsADirectory(demoFile);
        FileManager.printTheTheFileName(demoFile);
        FileManager.printTheFileAbsolutePath(demoFile);
        FileManager.deleteTheFileIfExists(demoFile);

        InputFileReaderManager.readDataFromATextFile(demoFile);
        InputFileReaderManager.readDataFromATextFileUsingFileReader(demoFile);
        System.out.println();
        InputFileReaderManager.readDataFromATextFileUsingBufferedReader(demoFile);

        String contentForTheFile = "New Content for big bosses \n another line";
        OutputFileWriterManager.writeDataIntoFileWithFileWriter(demoFile, contentForTheFile);
        OutputFileWriterManager.writeDataIntoFileWithBufferedWriter(demoFile, "Another Text");

        InputFileReaderManager.readDataFromATextFile(demoFile);


    }
}