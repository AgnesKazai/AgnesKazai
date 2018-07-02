package com.greenfoxacademy.restbackend.models;

import java.util.Random;

public class SithReverse {

    private String sith_text;

    public SithReverse() {
    }

    public SithReverse(String text) {
        this.sith_text = sithReverser(text);
    }

    public void setSith_text(String sith_text) {
        this.sith_text = sith_text;
    }

    public String getSith_text() {
        return sith_text;
    }

    private String sithReverser(String originalSithText) {
        String[] randomThings = {"Arrgh. Uhm.", "Arrghh.", "Uhm...", "Err..err.err"};
        Random rnd = new Random();
        String newSithSentence = "";
        for (String sentence : originalSithText.split("[.]")) {
            newSithSentence += sentenceReverser(sentence.trim()).trim() + ". " + randomThings[rnd.nextInt(randomThings.length)] + " ";
        }
        return newSithSentence;
    }

    private String sentenceReverser(String sentence) {
        String[] words = sentence.toLowerCase().split(" ");
        String reversedText = "";
        for(int i = 0; i < words.length - (words.length % 2); i+=2) {
            reversedText += words[i + 1] + " " + words[i] + " ";
        }
        if(words.length % 2 == 1) {
            reversedText += words[words.length - 1];
        }
        return reversedText.substring(0,1).toUpperCase() + reversedText.substring(1);
    }


}
