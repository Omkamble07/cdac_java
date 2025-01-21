package EX_01;
import java.util.*;

public class Complex {

    private int real ;
    private int img ;

    public void setReal(int real){
        this.real = real;
    }

    public int getReal(){
        return real;
    }

    public void setImg(int img){
        this.img = img;
    }

    public int getImg(){
        return img;
    }

    public void displayComplex(){
        System.out.println("complex number is :"+ real +"+"+ img +"i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter real part:");
        int real = sc.nextInt();
        System.out.print("enter imaginary part:");
        int img = sc.nextInt();

        Complex c = new Complex();
        c.setReal(real);
        c.setImg(img);
        c.displayComplex();

        sc.close();
    }
}