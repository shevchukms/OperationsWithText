import java.util.ArrayList;

public class Sentence {

    ArrayList<String> words=new ArrayList<String>();

    public ArrayList<String> getWords() {
        return words;
    }

    /*   public String[] findUniqueWord(String[] source) {
            String[] sentenceHolder = source.split("[\\.]|[\\!]|[\\?]");
            return sentenceHolder;
        }
     */
 public String[] divideInSetences(String source) {
        String[] sentenceHolder = source.split("[\\.]|[\\!]|[\\?]");
        return sentenceHolder;
    }


}
