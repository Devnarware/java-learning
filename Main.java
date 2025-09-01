// Complex.java


class Complex {
    // Attributes (Properties)
    private int real;
    private int imaginary;

    // Constructor to initialize complex number
    public Complex(int r, int img) {
        this.real = r;
        this.imaginary = img;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        int newReal = this.real + other.real;
        int newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Method to subtract two complex numbers
    public Complex sub(Complex other) {
        int newReal = this.real - other.real;
        int newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Method to multiply two complex numbers
    public Complex mul(Complex other) {
        int newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        int newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    public void print() {
    }


}
// Main.java

public class Main {
    public static void main(String[] args) {
        // Create two complex numbers
        Complex c1 = new Complex(4, 5);   // 4 + 5i
        Complex c2 = new Complex(2, 3);   // 2 + 3i

        // Add
        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        // Subtract
        Complex diff = c1.sub(c2);
        System.out.print("Difference: ");
        diff.display();

        // Multiply
        Complex product = c1.mul(c2);
        System.out.print("Product: ");
        product.display();
    }
}


                    