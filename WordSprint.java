package wordgame;

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
        int random = RandomNum();
        scanner.nextLine();
        String hiddenWord = new String();
        switch (difficulty) {
            case 1:
                hiddenWord = easy[random];
                break;
            case 2:
                hiddenWord = med[random];
                break;
            case 3:
                hiddenWord = hard[random];
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        StringBuilder board = new StringBuilder("");
        for (int i = 0; i < hiddenWord.length(); i++) {
            board.append("_ ");
        }
        StringBuilder guess = new StringBuilder();
        String input = "";
        int count = 0;
        while (!(hiddenWord.equals(input))) {
            System.out.println("Please guess the word");
            count++;
            System.out.println(board);
            input = scanner.nextLine();
            guess = new StringBuilder(input);
            // System.out.println(guess +  " " + hiddenWord);
            switch (count) {
                case 3: {
                    System.out.println("Here's the first hint");
              
                    char hint1 = hiddenWord.charAt(0);
                    String hintString = Character.toString(hint1);
                    board.replace(0,1,(hintString+" "));
                    System.out.println();
                    System.out.println(board);
                    break;
                }
                case 6: {
                    System.out.println("Here's the next hint");
                    int index = (int) (Math.random() * hiddenWord.length());
                    char hint2 = hiddenWord.charAt(1);
                    String hintString = Character.toString(hint2);
                    board.replace(1,2, (hintString+" "));
                    System.out.println();
                    System.out.println(board);
                    break;
                }

                case 9: {
                    System.out.println("Here's the next hint");
                    int index = (int) (Math.random() * hiddenWord.length());
                  
                   
                       char hint3 = hiddenWord.charAt(2);
                    
                    String hintString = Character.toString(hint3);
                    board.replace(2,3,(hintString+" "));
                    System.out.println();
                    System.out.println(board);
                    break;
                }
                default:
                    break;

            }

        }
        System.out.println("Congrats Bud");
    }

    public static int RandomNum() {
        int random = (int) (Math.random() * 4);
        return random;
    }

}
