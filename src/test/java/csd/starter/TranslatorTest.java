package csd.starter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TranslatorTest {

    private int firstVowelPosition;

    @Test
    public void pig_latin_rules() {
        assertEquals("appleway", toPigLatin("apple"));
        assertEquals("ananabay", toPigLatin("banana"));
        assertEquals("Appleway", toPigLatin("Apple"));
        assertEquals("Ananabay", toPigLatin("Banana"));
    }

    String toPigLatin(String englishWord) {
        if (isVowel(englishWord, 0)) {
            return englishWord + "way";
        }

        int firstVowelPosition = getFirstVowelPosition(englishWord);

        String pigLatinWordHead = englishWord.substring(firstVowelPosition);
        String pigLatinWordTail = englishWord.substring(0, firstVowelPosition).toLowerCase();

        String pigLatinWord = pigLatinWordHead + pigLatinWordTail + "ay";

        if (Character.isUpperCase(englishWord.charAt(0))) {
            String word = pigLatinWord;
            Character ch = Character.toUpperCase(word.charAt(0));
            word = ch + word.substring(1);
            pigLatinWord = word;
        }

        return pigLatinWord;
    }

    private int getFirstVowelPosition(String englishWord) {
        for (int i = 0; i < englishWord.length(); i++) {
            if (isVowel(englishWord, i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isVowel(String input, int i) {
        return "aeiouyAEIOUY".contains(((Character) input.charAt(i)).toString());
    }
}
