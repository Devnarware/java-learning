import java.util.Scanner ;
public class BankingProgram {

    static Scanner sc = new Scanner(System.in) ;
       static double balance = 0;

    public static void main(String[] args) {
        boolean isRunning = true ;
        int choice ;
        System.out.println("\n-----Welcome to the Java Banking Program------");
        while(isRunning){
            System.out.println(" ");
            System.out.println("Available Services:-");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit the Program");
            System.out.println(" ");
            System.out.print("Choose your option between(1-4): ");
            choice = sc.nextInt() ;

            switch(choice){
                case 1 -> printBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }
        System.out.println("\n-----Thanks for using our Service-----");
        sc.close();
    }

    public static void printBalance(){
        System.out.printf("Your Current Balance is ₹%.2f \n", balance);

    }
    public static void deposit(){
        double amount ;
        System.out.print("Enter the amount you want to deposit: ");
        amount = sc.nextDouble() ;
        if (amount<=0){
            System.out.println("Amount can't be Negative or Zero") ;
        }
        else{
            balance += amount ;
            System.out.printf("\nYour New Balance is ₹%.2f \n", balance);
        }

    }
    public static void withdraw(){
        double amount ;
        System.out.print("Enter the amount you want to withdraw: ");
        amount = sc.nextDouble() ;
        if (amount<=0){
            System.out.println("Amount can't be Negative or Zero") ;
        }else if (amount>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance -= amount ;
            System.out.printf("\nYour New Balance is ₹%.2f \n", balance);
        }

    }
}
