package bookreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {

    String result;
    String document;
    final String REGEX = "\\s*(\\s|,|!|\\.)\\s*";

    public FileReader(String reader) {
        document = reader;
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
        return Arrays.stream(result.replaceAll(REGEX, " ")
                .split(" "))
                .count();
    }

    public String firsTwelveWord() {
        return String.valueOf(Arrays.stream(result.split(REGEX))
                .limit(12)
                .collect(Collectors.toList()));
    }

    public String sortedFirsTwelveWord() {
        return String.valueOf(Arrays.stream(result.split(REGEX))
                .limit(12)
                .sorted()
                .collect(Collectors.toList()));
    }

    public String findFirstWord() {
        return String.valueOf(splitDocument()
                .findFirst());
    }

    public String findAnyWord() {
        return String.valueOf(splitDocument()
                .findAny());
    }

    public String findLastWord() {
        return Arrays.toString(result.substring(result.lastIndexOf(" ") + 1)
                .split(REGEX));
    }

    public String onlyNumber() {
        return result.replaceAll("\\D+", " ");
    }

    public boolean contains(String year) {
        return result.replaceAll("\\D+", " ")
                .contains(year);
    }

    public List<String> unique() {
        return splitDocument()
                .distinct()
                .limit(30)
                .collect(Collectors.toList());
    }

    private Stream<String> splitDocument() {
        return Arrays.stream(result.split(" "));
    }

}
