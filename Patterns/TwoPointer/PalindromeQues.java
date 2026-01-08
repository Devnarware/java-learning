import java.util.* ;

public class PalindromeQues {

    public static boolean isPalindrome(String str){
        int i = 0 ;
        int j = str.length()-1;

        while(i <= j){
            if(str.charAt(i) == str.charAt(j)){
                i++ ;
                j-- ;
            }else{
                break ;
            }
        }
        if(i >= j){
            return true ;
        }
        return false ;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a string: ");
        String str = sc.nextLine() ;


        if(isPalindrome(str)){
            System.out.println("the given string is a palindrome");
        }else{
            System.out.println("the given string is NOT a palindrome");
        }

    }
}