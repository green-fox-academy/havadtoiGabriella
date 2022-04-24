public class UrlFixer {
  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it in more than one way using different String functions!

    // FIRST ATTEMPT
//    url = url.replace("bots", "odds");
//    String subString = url.substring(5);
//    url = "https:" + subString;
//    System.out.println(url);

    // SECOND ATTEMPT
    int index = url.indexOf("bots");
    String subString = url.substring(0, index);
    url = subString + "odds";
    if(!url.contains(":")){
      url = url.replace("https", "https:");
    }
    System.out.println(url);
  }
}
