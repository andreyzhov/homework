package bookSearch;

public class Content {
    private String content;
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void show() {
        System.out.println("Content: " + content);
    }
}
