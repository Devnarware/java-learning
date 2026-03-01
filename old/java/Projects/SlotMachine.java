import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        //variable

        int balance = 10;
        int bet = 0;
        String[] row;
        int payOut = 0;
        String playAgain = "Y";

        //machine interface

        System.out.println("___________________________");
        System.out.println("Welcome to the Slot Machine");
        System.out.println("Symbols: 🔔 ⭐ ❤️ 💥 💣");
        System.out.println("---------------------------");


        //working


        while (playAgain.equals("Y") ) {
                System.out.println(" ");
                System.out.println("Your current balance is: " + balance);
                if (balance>0){
                    System.out.print("Place your bet: ");
                    bet = scanner.nextInt();
                    scanner.nextLine(); //don't understand why but without this line code is not working


                    //spin


                    if (bet<=0){
                        System.out.println("Bet can't be Negative");
                    }
                    else if(balance>=bet){
                        System.out.println(" ");
                        System.out.println("Spinning........");
                        balance -= bet ;
                        row = spin() ;

                        //show result

                        print(row) ;
                        System.out.println(" ");


                        //price system

                        payOut = isWin(bet , row) ;
                        if (payOut>0){
                            System.out.println("Congrats!!! You won " + payOut);
                            balance += payOut ;
                        }
                        else {
                            System.out.println("Sorry better luck next time");
                        }
                    }
                    else {
                        System.out.println("Your Bet is greater than your Balance");
                    }
                    System.out.println(" ");
                    System.out.print("Want to play more(Y/N): ");
                    playAgain = scanner.nextLine().toUpperCase();
                }
                else {
                    System.out.println("Sorry you are out of fund ");
                    break ;
                }
        }


        System.out.println("******************************************");
        System.out.println("  Game over your final Balance is:" + balance);
        System.out.println("******************************************");


        scanner.close();

    }

    public static String[] spin(){
        String[] symbol = {"🔔", "⭐", "❤️", "💥", "💣"} ;
        String[] row = new String[3] ;
        Random random = new Random() ;
        for(int i = 0 ; i<3 ; i++){
            row[i] = symbol[random.nextInt(symbol.length)] ;
        }
        return row ;
    }
    public static void print(String[] row){
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println(" "+String.join(" | ", row));
        System.out.println("~~~~~~~~~~~~~~~");
    }
    public static int isWin(int bet , String[] row){
        //all three are equals
        if( (row[0].equals(row[1]))&&(row[1].equals(row[2])) ) {
            return switch (row[0]) {
                case "❤️" -> bet = bet * 3;
                case "🔔" -> bet = bet * 4;
                case "⭐" -> bet = bet * 5;
                case "💣" -> bet = bet * 10;
                case "💥" -> bet = bet * 20;
                default -> 0 ;
            } ;
        }
        //first two are equals
        else if( row[0].equals(row[1]) ){
            return switch(row[1]){
                case "❤️" -> bet = bet*2 ;
                case "🔔" -> bet = bet*3 ;
                case "⭐" -> bet = bet*4 ;
                case "💣" -> bet = bet*5 ;
                case "💥" -> bet = bet*10 ;
                default -> 0 ;
            } ;
        }
        //last two are equals
        else if( row[1].equals(row[2]) ){
            return switch(row[1]){
                case "❤️" -> bet = bet*2 ;
                case "🔔" -> bet = bet*2 ;
                case "⭐" -> bet = bet*3 ;
                case "💣" -> bet = bet*4 ;
                case "💥" -> bet = bet*8 ;
                default -> 0 ;
            } ;
        }

        return 0 ;
    }
}
