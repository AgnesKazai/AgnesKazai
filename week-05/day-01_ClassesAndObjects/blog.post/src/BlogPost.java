public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public void printOut() {
        System.out.println("\"" + title + "\"" + " titled by " + authorName + " posted at " + "\"" + publicationDate + "\"\n\t" + text);
    }
}
