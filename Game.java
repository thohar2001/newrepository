import java.io.Console;

public class Game {
    public static void main(String[] args) {
	int total = 0;
	int correct = 0;
	

        System.out.println("Welcome to the Countries game.");
	Console console = System.console();
	String answer = console.readLine("Which continent does Sweden belong to? ");
        String continent = "Europe";

        while(total < 10) {
            
            total++;

	if (answer.equals(continent)) {
    		System.out.println("Correct!");
		correct++;
	} else {
   		System.out.println("No, the answer is " + continent);
        }
    } }
}
