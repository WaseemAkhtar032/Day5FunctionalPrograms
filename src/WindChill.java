/*
Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:

Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).
 */
import java.util.Scanner;

public class WindChill {
    static double t=0 , v=0;
    public void windChill(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\tEnter the Temprature ");
        t = sc.nextFloat();
        System.out.println("\tEnter the Wind Speed ");
        v = sc.nextFloat();
        if (t <= 50 && v >= 3 && v <= 120 ){

            double WindChill1 = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
            System.out.println("\tTEMPRATURE IS : "+t);
            System.out.println("\tWIND SPEED IS : "+v);
            System.out.println("\tWIND CHILL IS : "+WindChill1);
        }
        else {
            System.out.println("\tEnter Valid Entry ");
        }
    }

    public static void main(String[] args) {
        WindChill w = new WindChill();
        w.windChill();
    }
}
