import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] responses = {
            "Yes, absolutely! ✅",
            "No way! ❌",
            "Maybe... 🤔",
            "Ask again later. ⏳",
            "It is certain. 🌟",
            "Very doubtful. 🚫",
            "Most likely. 👍",
            "Don't count on it. ❎"
        };

        System.out.println("🎱 Welcome to the Magic 8-Ball!");
        System.out.print("Ask a YES/NO question: ");
        scanner.nextLine(); // Read the user's question (but ignore it)

        int randomIndex = random.nextInt(responses.length);
        System.out.println("Magic 8-Ball says: " + responses[randomIndex]);

        scanner.close();
    }
}
