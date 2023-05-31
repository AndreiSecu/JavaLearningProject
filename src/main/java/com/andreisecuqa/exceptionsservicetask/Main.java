package com.andreisecuqa.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int result2 = ArithmeticOperationService.divideIntWithExceptionHandling(10, 0);
        System.out.println(result2);
        System.out.println("The program is running till the end");

        String stringValue = "Gheroghe";
        String stringValue2 = null;

        System.out.println(TextManager.getTheTextLengthWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTheTextLength(stringValue));
        System.out.println(TextManager.getTheTextLengthIfElse(stringValue2));

        String filePath = "src/main/java/com/andreisecuqa/exceptionsservicetask/te6st.txt";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("The file does not exist, the execution of the programme is not interrupted");
        } finally {
            System.out.println("This block is always executed");
        }
        System.out.println("The program is running");

        ReadDataManager.readDataFromFileWithTryAndCatch(filePath);

        System.out.println("The program is running");

    }
}
