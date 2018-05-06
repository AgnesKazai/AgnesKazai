import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogPosts;

    public Blog(){
        this.blogPosts = new ArrayList<>();
    }
    public void delete(int i){
        blogPosts.remove(i);
    }
    public void update(int i , BlogPost post){
        blogPosts.set(i, post);
    }
}
