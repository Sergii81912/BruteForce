package com.company;

public class Caesar {
    private String alphabetU = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private String alphabetL = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public String encrypt(String input, int key) {
        String shifrAplabetL = alphabetL.substring(key) + alphabetL.substring(0, key);
        String shifrAplabetU = alphabetU.substring(key) + alphabetU.substring(0, key);
        String spase = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)) && Character.isLowerCase(input.charAt(i))) {
                char symbol = input.charAt(i);
                int number = alphabetL.indexOf(symbol);
                spase = spase + shifrAplabetL.charAt(number);
            } else if (Character.isLetter(input.charAt(i)) && Character.isUpperCase(input.charAt(i))) {
                char symbol = input.charAt(i);
                int number = alphabetU.indexOf(symbol);
                spase = spase + shifrAplabetU.charAt(number);
            } else {
                spase = spase + input.charAt(i);
            }
        }
        return spase;
    }

    public void brut(String textPodbor, int key) {
        if(key < 0){
            System.out.println("Key cannot be less than zero");
        }
        else {
            String sTest = encrypt(textPodbor, key);
            System.out.println(sTest);
        }
    }
}
