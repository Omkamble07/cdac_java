package EX_01;
import java.util.*;

public class Check_Avg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = 0.0;
        double num2 = 0.0;

        System.out.println("Enter first number:");
        if(sc.hasNextDouble() && !sc.hasNextInt()){
            num1 = sc.nextDouble();
        }else{
            System.out.println("1st number is invlid , Enter valid number");
            sc.close();
            return;
        }

        System.out.println("Enter second number:");
        if(sc.hasNextDouble() && !sc.hasNextInt()){
            num2 = sc.nextDouble();
        }else{
            System.out.println("2nd number is invlid , Enter valid number");
            sc.close();
            return;
        }
        
        if(true){
            double avg = (num1+num2)/2;
            System.out.println("Avg of 2 numbers is :"+ avg);
        }
        
        sc.close();

    }
}