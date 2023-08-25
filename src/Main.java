// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many Quarters do you have?: ");
        float quarters = Float.parseFloat(scan.nextLine());

        System.out.println("How many Dimes do you have?: ");
        float dimes = Float.parseFloat(scan.nextLine());

        System.out.println("How many Nickels do you have?: ");
        float nickels = Float.parseFloat(scan.nextLine());

        System.out.println("How many Pennies do you have?: ");
        float pennies = Float.parseFloat(scan.nextLine());

        float total = (quarters*.25F + nickels*.05F + dimes*.1F + pennies*.01F);
        System.out.printf("%.2f",total);


    }

    private static float findLargest(float num1,  float num2, float num3){
        return Math.max(num1, Math.max(num2,num3));
    }

}