public class ValidWordAbbreviation {

    public static boolean validWordAbbreviation(String word, String abbr) {

        int i = 0 ;
        int j = 0 ;

        while(i<word.length() && j<abbr.length()){

            char abbChar = abbr.charAt(j) ;
            char wordChar = word.charAt(i) ;

            if(Character.isDigit(abbChar)){
                if(abbChar == '0'){
                    return false ;
                }

                int curr = 0 ;
                while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                    curr = (curr*10) + (abbr.charAt(j) - '0') ;
                    j++ ;
                }
                i += curr ;
            }else{
                if(wordChar != abbChar){
                    return false ;
                }
                i++ ;
                j++ ;
            }
        }

        return true ;

    }

    static void main() {
        System.out.println(validWordAbbreviation("substitution" , "s55n"));
    }
}
