/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author mateo
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.io.PrintWriter;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String fileName;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.fileName = file;
    }

    public boolean load() {
        try ( Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] wordAndTranslate = line.split(":");
                String word = wordAndTranslate[0];
                String translation = wordAndTranslate[1];
                add(word, translation);
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error of load: " + e.getMessage());
            return false;
        }

    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return null;
    }

    public void delete(String word) {
        this.dictionary.remove(dictionary.get(word));
        this.dictionary.remove(word);
    }

    public boolean save() {
        ArrayList<String> alreadyAdded = new ArrayList<>();
        try {
            PrintWriter writer = new PrintWriter(fileName);
            for (String key : this.dictionary.keySet()) {
                if (alreadyAdded.contains(key)) {
                    writer.println(key + ":" + dictionary.get(key));
                }
                alreadyAdded.add(key);
                alreadyAdded.add(dictionary.get(key));

            }
            writer.close();
            return true;

        } catch (IOException e) {

            return false;
        }
    }
}
