/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        if (this.dictionary.keySet().contains(word)) {
            this.dictionary.get(word).add(translation);
        } else {
            this.dictionary.put(word, new ArrayList<>());
            this.dictionary.get(word).add(translation);
        }
    }
    
    public ArrayList<String> translate(String word) {
        if (!dictionary.keySet().contains(word)) {
            return new ArrayList();
        }
        return dictionary.get(word);
    }
    
    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
