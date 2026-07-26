package Hashing;

import java.util.* ;

public class Main {

    static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>() ;
        HashSet<Integer> sets = new HashSet<>() ;


        map.put("dev" , 89) ;
        map.put("Kunal" , 99) ;
        map.put("Anu" , 79) ;
        map.put("Mayank" , 59) ;


//        System.out.println(map.containsKey("dev")) ;


        sets.add(1) ;
        sets.add(2) ;
        sets.add(3) ;
        sets.add(4) ;
        sets.add(5) ;


        System.out.println(sets.isEmpty());
    }

}
