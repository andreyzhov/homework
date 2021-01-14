package homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String accessLevel = reader.readLine();
        showPossibleActions(accessLevel);
    }

    private static void showPossibleActions(String accessLevel) {
        if (accessLevel.equals("pro")){
            ProDocumentWorker pro = new ProDocumentWorker();
            pro.openDocument();
            pro.editDocument();
            pro.saveDocument();
        }
        else if (accessLevel.equals("exp")){
            ExpertDocumentWorker exp = new ExpertDocumentWorker();
            exp.openDocument();
            exp.editDocument();
            exp.saveDocument();
        }
        else {
            DocumentWorker def = new DocumentWorker();
            def.openDocument();
            def.editDocument();
            def.saveDocument();
        }
    }
}
