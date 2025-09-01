class Solution {
    public static boolean checkA(String s){
        int posA = 0 ;
        int posB = Integer.MAX_VALUE ;
        for(int i = 0 ; i<s.length() ;i++){
            if(s.charAt(i)=='a'){
                posA = i ;
            }else if(s.charAt(i)=='b'){
                posB = i ;
            }
        }
        System.out.println(posA);
        System.out.println(posB);
        if(posB>posA){
            return true ;
        }
        return false ;
    }
    public static void rev(int x){
        long revX = 0 ;
        for (int i = x; i > 0 ;) {
            revX = revX*10 + i%10 ;
            // System.out.println(revX);
            i=i/10 ;
        }
        System.out.println(revX);
    }
    public static void main(String[] args) {
        
     
    }
    public static void n(){
        int a =10;
        int b =9;
        int c =1;

        int count = 0 ;

        int d = (a+b)^c ;
        if(a==b){
            
        }
       
        while(d>0){
                d = d&(d-1) ;
                count++ ;
           }
       System.out.println(count);
    }
    public static void increasingTriplet(int[] nums) {
        for(int i = 0 ; i<=nums.length-1 ; i++){
            int count = 0 ; 
            for(int j = i+1 ; j<nums.length ; j++){
                if(nums[i]<nums[j]){
                    count++ ;
                    System.out.print(nums[j]);
                    i=j ;
                }
            }
            if(count>=2){
                System.out.println(true);
                break ;
            }
        }
        System.out.println(false);
        
    }

}
    
 