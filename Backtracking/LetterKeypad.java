import java.util.ArrayList;

public class LetterKeypad {


    public static void keypad(String str , String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return ;
        }
        int digit = str.charAt(0) - '0' ;
        for (int i = (digit - 1)*3; i < digit*3 ; i++) {
            keypad(str.substring(1) , ans + (char)('a' + i)) ;
        }
    }

    public static ArrayList<String> keypadList(String str , String ans  ){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(ans) ;
            return list ;
        }
        int digit = str.charAt(0) - '0' ;
        ArrayList<String> list = new ArrayList<>() ;
        if (digit == 9){
            for (int i = (digit - 1)*3; i < (digit*3) - 1 ; i++) {
                list.addAll(keypadList(str.substring(1) , ans + (char)('a' + i))) ;
            }
        }else{
            for (int i = (digit - 1)*3; i < digit*3 ; i++) {
                list.addAll(keypadList(str.substring(1) , ans + (char)('a' + i))) ;
            }
        }
        return list ;
    }

    public static void main(String[] args) {
        System.out.println(keypadList("19" , ""));


    }
}
