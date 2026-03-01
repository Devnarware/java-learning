import java.util.* ;
public class PrintAL{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(1) ;
        list.add(2) ;
        list.add(3) ;
        list.add(4) ;
        list.add(5) ;

        // PRINT ARRAY LIST USING LOOP

        // for (int i = 0; i <list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // } 


        // PRINT ARRAY LIST IN REVERSE ORDER

        // for (int i = list.size() - 1; i >= 0; i++) {
        //     System.out.print(list.get(i) + " ");
        // }

    //  MAXIMUM IN THE ARRAY LIST

        // if (list.size() == 0) {
        //     System.out.println("empty list");
        // }else{
        //     int max = list.get(0) ;
        //     for (int i = 1; i < list.size(); i++) {
        //         // if (list.get(i)>max) {
        //         //     max = list.get(i) ;
        //         // }
        //         max = Math.max(max, list.get(i)) ;
        //     }
        //     System.out.println(max);
        // }
        

        //SWAP TWO NUMBERS

        System.out.println(list);
        int idx1 =  2 ;
        int idx2 =  3 ;
        int temp = list.get(idx1) ;
        list.set(idx1, list.get(idx2)) ;
        list.set(idx2, temp) ;
        System.out.println(list);
    }

}