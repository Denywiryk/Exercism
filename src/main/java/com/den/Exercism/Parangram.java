package com.den.Exercism;


public class Parangram {


    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(s));
    }

    static boolean isPangram(String inputStringsOfCharacters) throws UnsupportedOperationException {
        String stringToLowerCase = inputStringsOfCharacters.toLowerCase();
        int totalNumberOfAlphabets = 26;
        if (stringToLowerCase.length() < totalNumberOfAlphabets) {
            return false;
        } else {
            for (char letters = 'a'; letters <= 'z'; letters++) {
                if (stringToLowerCase.indexOf(letters) < 0) {

                   return false;
                }
            }

        }

        return true;
    }


}


