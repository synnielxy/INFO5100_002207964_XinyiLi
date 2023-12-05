import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Parse XML and JSON files
        String xmlData = readFromFile("src/data.xml");
        String jsonData = readFromFile("src/data.json");

        // Parse XML data
        JSONObject xmlJsonObj = XML.toJSONObject(xmlData);
        System.out.println("Parsed XML Data:");
        System.out.println(xmlJsonObj.toString(4));

        // Parse JSON data
        JSONObject jsonObj = new JSONObject(jsonData);
        System.out.println("\nParsed JSON Data:");
        System.out.println(jsonObj.toString(4));

        // Add a new book programmatically to JSON data
        JSONObject newBook = new JSONObject();
        newBook.put("title", "Anne of Green Gables");
        newBook.put("publishedYear", 1908);
        newBook.put("numberOfPages", 250);

        JSONArray authorsArray = new JSONArray();
        authorsArray.put("L. M. Montgomery");

        newBook.put("authors", authorsArray);

        JSONArray bookArray = jsonObj.getJSONObject("BookShelf").getJSONArray("Book");
        bookArray.put(newBook);

        // Print updated JSON data
        System.out.println("\nUpdated JSON Data with a New Book:");
        System.out.println(jsonObj.toString(4));

        // Convert JSON back to XML
        String updatedXmlData = XML.toString(jsonObj);
        System.out.println("\nUpdated XML Data after Adding a New Book:");
        System.out.println(updatedXmlData);
    }

    // Read data from an external file
    private static String readFromFile(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}