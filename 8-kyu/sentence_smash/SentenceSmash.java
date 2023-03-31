package sentence_smash;

public class SentenceSmash {
    public static String smash(String... words) {
        String word = "";
        for(int i = 0; i < words.length; i++){
            word += words[i];
            if(i != words.length-1)
                word += " ";
        }
        return word;
    }
}
