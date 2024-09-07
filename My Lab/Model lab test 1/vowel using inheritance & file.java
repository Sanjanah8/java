import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class StringProcessor {
    protected String text;

    public StringProcessor(String text) {
        this.text = text;
    }

    public String findVowels() {
        StringBuilder vowels = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (isVowel(c)) {
                vowels.append(c).append(" ");
            }
        }
        return vowels.toString();
    }

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}

class VowelFinder extends StringProcessor {

    public VowelFinder(String text) {
        super(text);
    }

    public void writeVowelsToFile(String filePath) {
        String vowels = findVowels();
        try (PrintWriter out = new PrintWriter(new FileWriter(filePath))) {
            out.println("Vowels in the given string: ");
            out.println(vowels);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        VowelFinder vowelFinder = new VowelFinder("Hello World! This is a test string.");
        vowelFinder.writeVowelsToFile("vowels.txt");
    }
}
