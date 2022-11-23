package bookreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

    String result;
    String document;

    public FileReader(String reader) {
        this.document = reader;
    }

    public String readDocument() throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream(document);
        result = new BufferedReader(new InputStreamReader(inputStream))
                .lines().collect(Collectors.joining("\n"));

        return result;
    }

    public long quantityWords() {
        return Arrays.stream(result.replaceAll("\\d", "")
                .split("[.,\\s]+"))
                .count();
    }

    public long quantitySpace() {
        return result.chars().filter(c -> c == (int) ' ').count();
    }

    public String firsTwelveWord() {
        return String.valueOf(Arrays.stream(result.split(" "))
                .limit(12)
                .collect(Collectors.toList()));
    }

    public String sortedFirsTwelveWord() {
        return String.valueOf(Arrays.stream(result.split("\\s*(\\s|,|!|\\.)\\s*"))
                .limit(12)
                .sorted()
                .collect(Collectors.toList()));
    }

    public String findFirst() {
        return String.valueOf(Arrays.stream(result.split(" "))
                .findFirst());
    }

    public String findAny() {
        return String.valueOf(Arrays.stream(result.split("\\s*(\\s|,|!|\\.)\\s*"))
                .findAny());
    }

    public String findLast() {
        return Arrays.toString(result.substring(result.lastIndexOf(" ") + 1)
                .split("[-#$%^&!?{}@*()~`\\[\\],.0-9\\\\s]+"));
    }

    public String integer() {
        return result.replaceAll("\\D+", " ");
    }

    public boolean contains(String year) {
        return result.replaceAll("\\D+", " ")
                .contains(year);
    }

    public List<String> unique() {
        return Arrays.stream(result.split(" "))
                .distinct()
                .limit(30)
                .collect(Collectors.toList());
    }

}
