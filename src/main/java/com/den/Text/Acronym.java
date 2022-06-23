package com.den.Text;


public class Acronym {
    private String input;

    public Acronym(String input) {
        String abbreviation = "";
        this.input = input + abbreviation;

        String noSpaceAtStartString = input.trim().toUpperCase();

        String[] words = noSpaceAtStartString.split("\\s");

        String acronym;

        for (int i = 0; i < words.length; i++) {
            acronym = words[i];
            char wordChars = acronym.charAt(0);
            abbreviation = Character.toString(wordChars);
            System.out.println(abbreviation);
        }

    }

    public String get() {
        return this.input;
    }

    @Override
    public String toString() {
        return "Acronym{" +
                "input='" + input + '\'' +
                '}';
    }
}
