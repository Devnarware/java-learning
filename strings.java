
public class strings {
    public static void palindrome(String str){
            int i = 0 ;
            int j = str.length()-1;
            boolean isTrue = false ;
            while (i<=j){
                if (str.charAt(i)==str.charAt(j)) {
                    isTrue = true ;
                }else{
                    isTrue = false ;
                 }      
                i++;
                j--;
            }
            if(isTrue){
                System.out.println("palindrome");
            }else{
                System.out.println("not a palimdrome");
            }
        
        
    }
    public static void shortestPath(String str){
        int x = 0 ;
        int y = 0 ;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='N') {
                y++ ;
            }else if (str.charAt(i)=='S'){
                y--;
            }else if (str.charAt(i)=='W'){
                x--;
            }else if (str.charAt(i)=='E'){
                x++ ;
            }
        }
        int X = x*x ;
        int Y = y*y ;
        double sD = Math.sqrt(X + Y) ;
        System.out.println(sD);
    }
    public static void largestStr(String str[]){
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i] ;
            }
        }
        System.out.println(largest + " is the largest string");
    }
    public static int compress(char[] chars){
        int count = 1 ;
        int ans = 0 ;
        if(chars.length == 1){ return 1 ;}
        for (int i = 1; i < chars.length  ; i++) {
            if (i<chars.length-1) {
                if (chars[i]==chars[i-1]) {
                    count++ ;
                }else{
                    chars[ans] = chars[i-1] ;
                    ans++ ;
                    if (count>1) {
                        String cs = count + "" ;
                        for (int j = 0; j < cs.length(); j++) {
                            chars[ans]=cs.charAt(j) ;
                            ans++ ;
                        }
                        ans++ ;
                    }
                    count = 1 ;
                }
            }else{
                count++ ;
                ans++ ;
                String css = count + "" ;
                // chars[ans] = css.charAt(0) ;
                for (int j = 0; j < css.length(); j++) {
                    chars[ans]=css.charAt(j) ;
                    ans++ ;
                }
            }
        }
        for (int i = 0; i < ans; i++) {
            System.out.print(chars[i]);
        }
        System.out.println("");
        return ans ;
    }
    public static void main(String[] args) {
       char chars[] = {'a','b','b','b','b','b','b','b','b','b','b','b','b','c','c','c'} ;
       System.out.println(compress(chars)); ;
    //    OOPS.calc sc = new OOPS.calc() ;
    //    System.out.println(sc.sums(3,4)); 
        
    }
}

