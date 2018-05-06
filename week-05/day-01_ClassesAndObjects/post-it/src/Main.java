//Create a PostIt class that has
//        a backgroundColor
//        a text on it
//        a textColor
//        Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"
public class Main {
    public static void main(String[] args) {
        PostIt post1 = new PostIt();
        post1.backgroundColor = "orange";
        post1.textColor = "blue";
        post1.text = "Idea 1";
        post1.printMyPostIt();

        PostIt post2 = new PostIt();
        post2.backgroundColor = "pink";
        post2.textColor = "black";
        post2.text = "Awesome";
        post2.printMyPostIt();

        PostIt post3 = new PostIt();
        post3.backgroundColor = "yellow";
        post3.textColor = "green";
        post3.text = "Superb!";
        post3.printMyPostIt();
    }
}
