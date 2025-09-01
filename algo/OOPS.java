package algo ;
public class OOPS{
    public static void main(String args[]){
        Bear bear = new Bear() ;
        bear.what();
    }
}
interface Herbivore{
    boolean eatsV();
}
interface Carnivore{
    boolean eatsN();
}
class Bear implements Herbivore , Carnivore {
    public boolean eatsV(){
        // System.out.println("yes");
        return true ;
    }
    public boolean eatsN(){
        // System.out.println("yes");
        return true ;
    }
    public void what(){
       boolean veg = eatsV();
       boolean nonveg = eatsN();
        if (veg && nonveg == true) {
            System.out.println("Omnivores");
        }
    }
}