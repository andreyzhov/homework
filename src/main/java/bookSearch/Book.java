package bookSearch;

public class Book {
    public static void show() {
        Author author1 = new Author();
        Title title1 = new Title();
        Content content1 = new Content();
        author1.setAuthor("Ernest");
        String author = author1.getAuthor();
        title1.setTitle("The Old Man and the Sea");
        String title = title1.getTitle();
        content1.setContent("He published seven novels, six short-story collections, and two nonfiction works. Three of his novels, four short-story collections, and three nonfiction works were published posthumously.");
        String content = content1.getContent();
        System.out.println(author + " " + title + " " + content);
    }
}
