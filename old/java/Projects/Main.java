import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // declare variables
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // welcome message
        System.out.println("**************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("**************");

        // game loop
        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine(); // clear newline after nextInt

            // verify bet > balance
            if (bet > balance) {
                System.out.println("Insufficient funds");
                continue;
            }
            // verify bet > 0
            else if (bet <= 0) {
                System.out.println("Bet must be greater than zero");
                continue;
            }

            // subtract bet
            balance -= bet;

            // spin row
            System.out.println("Spinning...");
            row = spinRow();

            // print row
            printRow(row);

            // get payout
            payout = getPayout(row, bet);
            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry you lost this round");
            }

            // play again?
            System.out.print("Do you want to play again");
            playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("Y")) {
                break;
            }
        }

        // exit message
        System.out.println("game over your final balance is $" + balance);

        scanner.close();
    }

    // returns a row of 3 random symbols
    static String[] spinRow() {
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    // prints the row with separators
    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    // computes payout based on matches
    static int getPayout(String[] row, int bet) {
        // all three match
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        // first two match
        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        // second and third match
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        // no matches
        return 0;
    }
}