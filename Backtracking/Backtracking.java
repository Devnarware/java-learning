public class Backtracking {
    public static void findPermutaion( String str , String ans){
        if(str.length() == 0 ){
            System.out.println(ans); 
            return ;
        }
        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i) ;
            String newStr = str.substring(0, i) + str.substring(i+1) ;
            findPermutaion(newStr, ans+str.charAt(i));
        }
    }
    public static void findSubset(String str , String ans , int i){
        //base case
        if(i == str.length()){
            System.out.println(ans);
            return ;
        }
        //yes choice 
        findSubset(str, ans+str.charAt(i), i+1);
        //no choice
        findSubset(str, ans, i+1);


    }
    public static void main(String[] args) {
        String str = "abc" ;
        
        // findSubset(str, "", 0);
        findPermutaion(str, "");
    }
}
    