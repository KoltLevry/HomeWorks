package homework_42.test_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SynonymDictionary {
    private Map<String, List<String>> dictionary = new HashMap<>();

    public SynonymDictionary() {
        dictionary.put("Happy", new ArrayList<>(List.of("Joyful", "Cheerful", "Content")));
        dictionary.put("Fast", new ArrayList<>(List.of("Quick", "Swift", "Speedy")));
        dictionary.put("Beautiful", new ArrayList<>(List.of("Gorgeous", "Stunning", "Attractive")));
        dictionary.put("Smart", new ArrayList<>(List.of("Intelligent", "Clever", "Bright")));
        dictionary.put("Strong", new ArrayList<>(List.of("Powerful", "Sturdy", "Resilient")));
    }

    public void addSynonym(String word, String synonym) {
        dictionary.computeIfAbsent(word, k -> new ArrayList<>()).add(synonym);
    }

    public List<String> getSynonyms(String word) {
        return dictionary.getOrDefault(word, new ArrayList<>());
    }

    public void updateSynonyms(String word, List<String> synonyms) {
        dictionary.put(word, new ArrayList<>(synonyms));
    }

    public void removeSynonym(String word, String synonym) {
        List<String> synonyms = dictionary.get(word);
        if (synonyms != null) {
            synonyms.remove(synonym);
            if (synonyms.isEmpty()) {
                dictionary.remove(word);
            }
        }
    }

    public void removeWord(String word) {
        dictionary.remove(word);
    }

    public void displayDictionary() {
        dictionary.forEach((word, synonyms) ->
                System.out.println("Word: " + word + " - Synonyms: " + synonyms));
    }

    public static void main(String[] args) {
        SynonymDictionary dict = new SynonymDictionary();

        System.out.println("Initial Dictionary:");
        dict.displayDictionary();

        System.out.println("\nAdd synonym 'Freedom' to 'Happy':");
        dict.addSynonym("Happy", "Freedom");
        dict.displayDictionary();

        System.out.println("\nGet synonyms for 'Happy': " + dict.getSynonyms("Happy"));

        System.out.println("\nUpdate synonyms for 'Smart':");
        dict.updateSynonyms("Smart", List.of("Wise", "Knowledgeable"));
        dict.displayDictionary();

        System.out.println("\nRemove synonym 'Joyful' from 'Happy':");
        dict.removeSynonym("Happy", "Joyful");
        dict.displayDictionary();

        System.out.println("\nRemove the word 'Fast':");
        dict.removeWord("Fast");
        dict.displayDictionary();
    }
}
