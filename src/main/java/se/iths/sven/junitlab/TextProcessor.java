package se.iths.sven.junitlab;

public class TextProcessor {

    public String lowerLetters(String text){
        return text.toLowerCase();
    }

    public String upperLetters(String text){
        return text.toUpperCase();
    }

    public String reverseLetters(String text){
        StringBuilder str = new StringBuilder(text);
        StringBuilder tillf = str.reverse();
        String nytext = tillf.toString();
        return nytext;

    }

}
