import java.util.ArrayList;
import java.util.Collections;
// import java.util.* ;
public class Sorting{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(13) ;
        list.add(19) ;
        list.add(1) ;
        list.add(17) ;
        list.add(13) ;
        System.out.println(list);

        // SORT USING COLLECTION CLASS ;
        Collections.sort(list) ;

        //SORT IN REVERSE ORDER USING COMPARITOR FUNTION
        Collections.sort(list , Collections.reverseOrder()) ;          
    }
} 