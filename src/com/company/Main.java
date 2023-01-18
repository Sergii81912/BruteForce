package com.company;

public class Main {

    public static void main(String[] args) {
        String text = "Ебвощ кэтлбёпоь лфвкщ яэдкшж пвзоп!!!";
        Caesar test = new Caesar();
        for (int i = 1; i <= 33; i++) {
            System.out.printf("Ключ дешифровки = %s - ", i);
            test.brut(text, i);
        }
    }
}
