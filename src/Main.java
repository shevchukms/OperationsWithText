import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();

        String source = br.readLine();
      //  String[] sentenceHolder = source.split("[\\.]|[\\!]|[\\?]");
        // String[] sentenceHolder = source.split("[\\' ']");
Text sentenceHolder=new Text();
sentenceHolder.divideOnSentences(source);



        writeSentenses(sentenceHolder.sentences);
        System.out.println();
        writeSentensesFromText(sentenceHolder.getSentences());


   /*     List<String> matchList = new ArrayList<String>();
        Pattern regex = Pattern.compile("[^\\s\"']+|\"([^\"]*)\"|'([^']*)'");
        Matcher regexMatcher = regex.matcher(source);
        while (regexMatcher.find()) {
            if (regexMatcher.group(1) != null) {
                // Add double-quoted string without the quotes
                matchList.add(regexMatcher.group(1));
            } else if (regexMatcher.group(2) != null) {
                // Add single-quoted string without the quotes
                matchList.add(regexMatcher.group(2));
            } else {
                // Add unquoted word
                matchList.add(regexMatcher.group());
            }
        }*/
        //  writeSentenses((ArrayList) matchList);

/*        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        iterator.setText(source);
        int start = iterator.first();
        for (int end = iterator.next();
             end != BreakIterator.DONE;
             start = end, end = iterator.next()) {
            System.out.println(source.substring(start,end));
        }*/
    }

    public static void writeSentenses(ArrayList<String> arrayList) {
        for (Object s : arrayList) {
            System.out.println(s);
        }
    }


    public static void writeSentensesFromText( ArrayList<Sentence> sentences) {
        ArrayList<String> sentenceInWords=new ArrayList<String> ();
        for (Sentence s : sentences) {
          sentenceInWords= s.getWords();
            writeSentenses(sentenceInWords);
        }
    }

}
