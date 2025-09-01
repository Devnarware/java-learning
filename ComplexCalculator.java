class complex{
    //declaring the varible 
    int real ;
    int imaginary ;

    //make a constructor
    public complex(int r , int img){
        this.real = r ;
        this.imaginary = img ;
    }

    //addition method
    public complex add(complex onum) {
        int newR = this.real + onum.real ;
        int newImg = this.imaginary + onum.imaginary ;
        return new complex(newR , newImg) ;
    }

    //subtraction method
    public complex sub(complex onum){
         int newR = this.real - onum.real ;
         int newImg =  this.imaginary - onum.imaginary ;
         return new complex(newR , newImg) ;
    }
    
    //multiplication method
    public complex mul(complex onum){
        int newR = (this.real * onum.real) -(this.imaginary * onum.imaginary) ;
         int newImg =  (this.imaginary * onum.real) + (this.real * onum.imaginary) ;
        return  new complex(newR , newImg) ;
    }

    //print method
    public void print(){
        System.out.println(this.real + "+" + this.imaginary + "i");
    }
}
public class ComplexCalculator{
    public static void main(String[] args) {
        Complex num = new Complex(4, 5);
        Complex num2 = new Complex(2, 3);

        Complex sum = num.add(num2);
        sum.print() ;

        Complex sub = num.sub(num2);
        sub.print() ;
        Complex mul = num.mul(num2);
        mul.print() ;
    }
}
