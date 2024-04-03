package service;

import java.util.Set;

public class LongestWord {
    public String getLongestWord(Set<String> words){
        int count=0;
        String longestWord="";
        for (String word : words) {
            if (word.length()>count){
                count=word.length();
                longestWord=word;
            }
        }
        return  longestWord;
    }
}
