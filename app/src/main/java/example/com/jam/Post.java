package example.com.jam;

import java.util.UUID;

/**
 * Created by ninjo on 10/22/2016.
 */

public class Post {
    private String title;
    private String body;
    private int karma;
    private String user;

    public Post() {}

    public Post(String titleIn, String bodyIn, String userIn) {
        this.title = titleIn;
        this.body = bodyIn;
        this.karma = 0;
        this.user = userIn;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
