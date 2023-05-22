package com.andreisecuqa.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private static Random random = new Random();

    public static int getRandomInt(int min, int max) {
        int randomInt = random.nextInt(max - min + 1) + min;
        return randomInt;
    }

    public static int getRandomInt(int max) {
        int randomInt = random.nextInt(max);
        return randomInt;
    }

    public static double getRandomDouble(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }

    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    public static String generateRandomEmail() {
        String uuid = UUID.randomUUID().toString();
        return uuid + "@example.com";
    }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stringBuilderObject = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = getRandomInt(0, characters.length());
            stringBuilderObject.append(characters.charAt(randomIndex));
        }
        return stringBuilderObject.toString();
    }
}
