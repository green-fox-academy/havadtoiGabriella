import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
  /*Write a function that receives a sentence (string) as a parameter and returns the most frequent word of that sentence. If there is more than one such word return any one of them.
   */
  public static void main(String[] args) {
    String example =
        "But then they were married (she felt awful about being pregnant before but\n" +
            "Harry had been talking about marriage for a while and anyway laughed when\n" +
            "she told him in early February about missing her period and said Great she\n" +
            "was terribly frightened and he said Great and lifted her put his arms around\n" +
            "under her bottom and lifted her like you would a child he could be so\n" +
            "wonderful when you didn’t expect it in a way it seemed important that you\n" +
            "didn’t expect it there was so much nice in him she couldn’t explain to\n" +
            "anybody she had been so frightened about being pregnant and he made her\n" +
            "be proud) they were married after her missing her second period in March\n" +
            "and she was still little clumsy dark-complected Janice Springer and her\n" +
            "husband was a conceited lunk who wasn’t good for anything in the world Daddy\n" +
            "said and the feeling of being alone would melt a little with a little drink.";
    mostFrequentWord(example);
  }

  public static void mostFrequentWord(String sentence) {
    String[] sentenceArray = sentence.split(" ");
    Map<String, Integer> wordMap = new HashMap<>();
    for (int i = 1; i < sentenceArray.length; i++) {
      if (!wordMap.containsKey(sentenceArray[i])) {
        wordMap.put(sentenceArray[i], 1);
      } else {
        wordMap.put(sentenceArray[i], wordMap.get(sentenceArray[i]) + 1);
      }
    }
    int max = Integer.MIN_VALUE;
    String theMostFrequent = "";
    for (Map.Entry word : wordMap.entrySet()) {
      if ((int) word.getValue() > max) {
        max = (int) word.getValue();
        theMostFrequent = (String) word.getKey();
      }
    }
    System.out.println(theMostFrequent);
  }
}

