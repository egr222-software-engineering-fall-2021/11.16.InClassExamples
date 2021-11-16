import java.io.*;
import java.util.*;

// From Code Along 16-A
public class WordCountLinkedList {
    public static void main(String[] args) throws FileNotFoundException {
        // read file into a map of [word --> number of occurrences]
        List<String> words = new LinkedList<>();

        System.out.println("Reading the file...");
        Scanner input = new Scanner(new File("mobydick.txt"));
        readfile(input, words);

        System.out.println("Removing the words...");
        everyOther(words);  // remove every other word
//        while (!words.isEmpty()) {
//            words.remove(0);
//        }

        System.out.println("Done.");
    }

    public static void everyOther(List<String> words) {
//        for (int i = 0; i < words.size(); i++) {
//            words.remove(i);    // slow for a linked list - takes about 3-4 minutes
//        }

//      Using an iterator is very fast
        Iterator<String> itr = words.iterator();
        while (itr.hasNext()) {
            itr.next();
            if(itr.hasNext()) {
                itr.remove();
                itr.next();
            }
        }
    }

    public static void readfile(Scanner input, List<String> words) {
        while (input.hasNext()) {
            String word = input.next();
            words.add(word);
        }
    }
}