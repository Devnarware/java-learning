package com.OOPS.Comparable;

public class Students implements Comparable<Students>{

    float mark ;
    int roll ;

    public Students(float mark , int roll ){
        this.mark = mark ;
        this.roll = roll ;
    }

    @Override
    public String toString() {
        return this.mark + "";
    }

    @Override
    public int compareTo(Students o) {
       int diff = (int)(this.mark - o.mark) ;
       return diff ;
    }
}
