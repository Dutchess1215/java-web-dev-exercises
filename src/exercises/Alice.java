package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String raw = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        String lowerRaw = raw.toLowerCase();
        System.out.println("Enter a string to search for:");
        String searchTerm = input.nextLine().toLowerCase();

        Boolean result = lowerRaw.contains(searchTerm);
        System.out.println("The sentence contains your Search term: " + result);

        //problem 5
        Integer index = lowerRaw.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("your search term is at index " + index + " your term is " + length +" characters long");
        String modifiedSentence = lowerRaw.replace(searchTerm, "");
        System.out.println(modifiedSentence);

    }
}
