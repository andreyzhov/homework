package bookSearch;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        author.setAuthor("Ernest Hemingway");
        author.show();
        Title title = new Title();
        title.setTitle("Old man and the Sea");
        title.show();
        Content content = new Content();
        content.setContent("The Old Man and the Sea tells the story of a battle between an aging, experienced fisherman, Santiago, and a large marlin.");
        content.show();
    }
}
