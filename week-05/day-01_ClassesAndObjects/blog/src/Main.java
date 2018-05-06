//Reuse your BlogPost class
//Create a Blog class which can
//        store a list of BlogPosts
//        add BlogPosts to the list
//        delete(int) one item at given index
//        update(int, BlogPost) one item at the given index and update it with another BlogPost
public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();

        BlogPost blogPost1 = new BlogPost();
        blogPost1.title = "Lorem Ipsum";
        blogPost1.authorName = "John Doe";
        blogPost1.publicationDate = "2000.05.04.";
        blogPost1.text = "Lorem ipsum dolor sit amet.";
        blog.blogPosts.add(blogPost1);
/*
        for (int i = 0; i < 3; i++) {
            blog.blogPosts.add(new BlogPost());
        }
        blog.blogPosts.get(0).title = "Lorem Ipsum";
        blog.blogPosts.get(0).authorName = "John Doe";
        blog.blogPosts.get(0).publicationDate = "2000.05.04.";
        blog.blogPosts.get(0).text = "Lorem ipsum dolor sit amet.";
*/
        BlogPost blogPost2 = new BlogPost();
        blogPost2.title = "Wait but why";
        blogPost2.authorName = "Tim Urban";
        blogPost2.publicationDate = "2010.10.10.";
        blogPost2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        blog.blogPosts.add(blogPost2);

        BlogPost blogPost3 = new BlogPost();
        blogPost3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blogPost3.authorName = "William Turton";
        blogPost3.publicationDate = "2017.03.28.";
        blogPost3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                "When I asked to take\n \this picture outside one of IBM’s New York City offices," +
                " he told me that he wasn’t really into the whole organizer\n \tprofile thing.";
        blog.blogPosts.add(blogPost3);

        for (BlogPost item : blog.blogPosts) {
            item.printOut();
        }
        System.out.println("-----------------------------------------------------------------------------");
        blog.delete(1);
        for (BlogPost item : blog.blogPosts) {
            item.printOut();
        }
        System.out.println("-----------------------------------------------------------------------------");
        blog.update(0, blogPost2);
        for (BlogPost item : blog.blogPosts) {
            item.printOut();
        }
    }
}
