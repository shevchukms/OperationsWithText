
import java.util.ArrayList;
import java.util.Arrays;

public class Text {
    ArrayList<Sentence> sentences=new ArrayList<Sentence>();

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    public void divideOnSentences(String source){


        String[] sentenceHolder = source.split("[\\.]|[\\!]|[\\?]");
        for (String s:sentenceHolder) {
            Sentence sentence=new Sentence();
            String[] words =s.split("[\\' ']");
            sentence.words=convertFromArrayToArrayList(words);
            sentences.add(sentence);
        }
    }


    public ArrayList convertFromArrayToArrayList(String [] strings){
    ArrayList arrayList=new ArrayList();
        for (String s: strings
             ) {
            arrayList.add(s);

        }
    return arrayList;
    }

}
