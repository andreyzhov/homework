package bookreader;

import java.io.IOException;

public class Reader {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/JavaHistory.rtf");
        System.out.println(fileReader.readDocument());
        System.out.println(fileReader.quantityWords());
        System.out.println(fileReader.quantitySpace());
        System.out.println(fileReader.firsTwelveWord());
        System.out.println(fileReader.sortedFirsTwelveWord());
        System.out.println(fileReader.findFirst());
        System.out.println(fileReader.findAny());
        System.out.println(fileReader.findLast());
        System.out.println(fileReader.integer());
        System.out.println(fileReader.contains("2006"));
        System.out.println(fileReader.unique());
    }
}
