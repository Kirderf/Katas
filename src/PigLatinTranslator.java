import java.util.ArrayList;
import java.util.List;

public class PigLatinTranslator {
    public static void main(String[] args) {
        System.out.println(translateSentence("I like to eat honey waffles."));
    }

    public static String translate(String word) {

        ArrayList<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder stringBuilder = new StringBuilder();
        char saved = 0;
        boolean firstLetterUppercase = false;

        // check if last char is a special char, saves it and removes it.
        if (!Character.isAlphabetic(word.charAt(word.length() - 1)) && !Character.isDigit(word.charAt(word.length() - 1))) {
            saved = word.charAt(word.length() - 1);
            word = word.replace(saved, ' ').trim();
        }

        // check if word has an uppercase letter
        if (Character.isUpperCase(word.charAt(0))){
            firstLetterUppercase = true;
        }

        // adding ay or yay
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                stringBuilder.append(word.replace(word.substring(0, i), "").concat(word.substring(0, i)).toLowerCase());
                if (i == 0) {
                    stringBuilder.append(("yay"));
                } else {
                    stringBuilder.append("ay");
                }
                break;
            }
        }
        // checks if there is a saved char (special char)
        if (saved != 0) {
            stringBuilder.append(saved);
        }
        // check if word has an uppercase letter and replaces the first letter to an uppercase version
        if (firstLetterUppercase){
            stringBuilder.replace(0,1, String.valueOf(stringBuilder.charAt(0)).toUpperCase());
        }
        return stringBuilder.toString();
    }

    public static String translateSentence(String sentence) {
        StringBuilder sb = new StringBuilder();
        for (String word :
                sentence.split(" ")) {
            sb.append(translate(word)).append(" ");
        }
        return sb.toString();
    }
}
