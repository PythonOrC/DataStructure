import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("reverse.txt"));
        ArrayList<String> words = new ArrayList();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        scanner.close();

        // Task 1: Print the words in reverse order
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.print(words.get(i) + " ");
        }
        System.out.println();

        // Task 2: Print words all plural caplitalzied
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.endsWith("s")) {
                System.out.print(word.toUpperCase());
            } else {
                System.out.print(word);
            }
            System.out.print(" ");

        }
        System.out.println();

        // Task 3: print with all plural words removed
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (!word.endsWith("s")) {
                System.out.print(word + " ");
            }
        }
    }

}