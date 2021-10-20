import java.util.*;
import java.util.stream.IntStream;

public class TextManipulator {
    public final String text = "A Lion lay asleep in the forest, his great head resting on his paws. A timid little Mouse came upon him unexpectedly, and in her fright and haste to get away, ran across the Lion's nose. Roused from his nap, the Lion laid his huge paw angrily on the tiny creature to kill her. \"Spare me!\" begged the poor Mouse. \"Please let me go and some day I will surely repay you. \"The Lion was much amused to think that a Mouse could ever help him. But he was generous and finally let the Mouse go. Some days later, while stalking his prey in the forest, the Lion was caught in the toils of a hunter's net. Unable to free himself, he filled the forest with his angry roaring. The Mouse knew the voice and quickly found the Lion struggling in the net. Running to one of the great ropes that bound him, she gnawed it until it parted, and soon the Lion was free. \"You laughed when I said I would repay you,\" said the Mouse. \"Now you see that even a Mouse can help a Lion.\"";
    public String[] words;
    public int numberOfSentences = 0;
    public int numberOfVowels = 0;
    public int numberOfConsonants = 0;
    public int numberOfLetters = 0;
    public int numberOfSymbols = 0;
    public String longestWord;
    Map<String, Integer> wordsByFrequency = new HashMap<>();
    int[] consonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'};

    public TextManipulator(){
        getAllWords();
        countSymbols();
        System.out.println("Number of letters: " + numberOfLetters);
        System.out.println("Number of consonants: " + numberOfConsonants);
        System.out.println("Number of vowels: " + numberOfVowels);
        System.out.println("Number of symbols: " + numberOfSymbols);
        System.out.println("Number of words: " + words.length);

            getTop5MostUsedWords();

        System.out.println("Longest word: " + longestWord);

    }
    public void countSymbols(){
        for (int i = 0; i < text.length();i++){
            if (!(((int)text.charAt(i) >= 65 && (int)text.charAt(i) <= 90) || ((int)text.charAt(i) >= 97 && (int)text.charAt(i) <= 122))){
                numberOfSymbols++;
            }
        }
    }
    public void getAllWords(){
        words = text.split(" ");
        int maxLength = 0;
        int indexOfLongestWord = 0;
        for(int i = 0; i < words.length;i++){
            words[i] = words[i].toUpperCase();
            checkForChar(words[i],i);
            countConsonantsAndVowels(words[i]);
            if (maxLength < words[i].length()) {
                maxLength = words[i].length();
                indexOfLongestWord = i;
            }
            if (wordsByFrequency.containsKey(words[i])){
                wordsByFrequency.put(words[i], wordsByFrequency.get(words[i]) + 1);
            }
            else {
                wordsByFrequency.put(words[i],1);
            }
        }
        longestWord = words[indexOfLongestWord];

    }
    public void getTop5MostUsedWords(){
        int maxFrequency = 0;
        String maxEntry = null;
        String test = null;
        Collection<Integer> values = wordsByFrequency.values();
        Integer[] array = values.toArray(new Integer[values.size()]);
        Arrays.sort(array,Collections.reverseOrder());
        Set<Integer> setNoDupes = new LinkedHashSet<Integer>(Arrays.asList(array));
        Object[] noDup = setNoDupes.toArray();

        System.out.println("Top 5 used words: ");
        String display = "";
        for (int j = 0, count = 0; j < noDup.length;j++){
            for (String i : wordsByFrequency.keySet()){
                if (wordsByFrequency.get(i) == noDup[j] && count < 5){
                    count++;
                    display = (count) + ")" + i + " - Frequency = " + noDup[j];
                    System.out.println(display);
                }
            }
        }

    }
    public void checkForChar(String word,int index){
        for(int i = 0; i < word.length(); i++){
            if (!(((int)word.charAt(i) >= 65 && (int)word.charAt(i) <= 90) || ((int)word.charAt(i) >= 97 && (int)word.charAt(i) <= 122))){
                if ((int)word.charAt(i) == 33 || (int)word.charAt(i) == 63 || (int)word.charAt(i) == 46) numberOfSentences++;
                StringBuilder wordWithoutSymbols = new StringBuilder(words[index]);
                wordWithoutSymbols.deleteCharAt(i);
                i = i-1;
                words[index] = wordWithoutSymbols.toString();
                word = wordWithoutSymbols.toString();
            }

        }
    }
    public void countConsonantsAndVowels(String word){
        for (int i = 0; i < word.length();i++){
            int value = word.charAt(i);
            if(IntStream.of(consonants).anyMatch(x -> x == value)) numberOfConsonants++;
            else{
                numberOfVowels++;
            }
        }
        numberOfLetters = numberOfConsonants + numberOfVowels;
    }
}
