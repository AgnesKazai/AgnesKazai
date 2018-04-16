// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crutial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!

public class Strings_UrlFixer_II {
    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots", "odds");
        url = url.replace("https", "https:" );
        System.out.println(url);

        //Solution 2

        /*String url = "https//www.reddit.com/r/nevertellmethebots";
        url.replaceAll("https//www.reddit.com/r/nevertellmethebots", "https://www.reddit.com/r/nevertellmethebots" );
        System.out.println(url);*/


        //Solution 3   /with StringBuilder
        /*String url = "https//www.reddit.com/r/nevertellmethebots";
        StringBuilder sb = new StringBuilder(url);
        //System.out.println(url.indexOf("s"));
        sb.insert(5, ":");
        url = sb.toString();
        System.out.println(url);*/









    }
}
