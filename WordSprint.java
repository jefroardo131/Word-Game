package wordsprint;
import java.util.Scanner;
import java.util.Arrays;
public class WordSprint {

    public static void main(String[] args) {
        
        String[] easy = {"cat", "dog", "yuh", "rat", "boy"};
        String[] med = {"juju", "fuzz", "jock", "jinx", "tizz"};
        String[] hard = {"bezazz", "jazzbo", "pazazz", "zizzed", "whizzy"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a difficulty: \n1-easy \n2-medium \n3-hard");
        int difficulty = scanner.nextInt();
        int random = (int)(Math.random() * 4);
        StringBuilder hiddenWord = new StringBuilder();
        if(difficulty == 1) {
             hiddenWord = new StringBuilder(easy[random]);
        } else if(difficulty == 2) {
             hiddenWord = new StringBuilder(med[random]);
        } else if(difficulty == 3) {
             hiddenWord = new StringBuilder(hard[random]);
        } else {
            System.out.println("Invalid input");
        }
        
        StringBuilder board = new StringBuilder("");
        for(int i = 0; i < hiddenWord.length(); i++) {
            board.append("__ ");
        }
        StringBuilder guess = new StringBuilder();
        int count = 0;
        while(hiddenWord != guess) {
            System.out.println("Please guess the word");
            count++;
            System.out.println(board);
            guess = new StringBuilder(scanner.nextLine());
            if(count == 3) {
                System.out.println("Here's the first letter");
                System.out.println(hiddenWord.charAt(0));
                System.out.println(board);
            } else if(count == 6) {
                System.out.println("Here's the first two letters");
                System.out.print(hiddenWord.charAt(0) + "  ");
                System.out.println(hiddenWord.charAt(1));
                System.out.println(board);
            } else if(count == 9) {
                System.out.println("Here is the first three letters");
                System.out.print(hiddenWord.charAt(0) + "  ");
                System.out.print(hiddenWord.charAt(1) + "  ");
                System.out.println(hiddenWord.charAt(2));
                System.out.println(board);
            } else if(count == 10) {
                System.out.println("you failed m8");
                System.exit(0);
            }
            
        }
        System.out.println("Congrats bud");
    }
    
}
