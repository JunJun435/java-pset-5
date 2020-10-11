import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter wage: ");
        double wage = input.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        double total;
        double extraHours;

        DecimalFormat df2 = new DecimalFormat("0.00");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);

        if (wage < 0.0) {
            System.out.println("\nYour wage must be greater than or equal to $0.00/hour.");
        } else if (hours  < 0.0) {
            System.out.println("\nYour hours must be greater than or equal to 0.0.");
        } else {
            if (hours > 40){
                extraHours = (hours - 40.0) * (wage * 1.5);
                total = wage * 40 + extraHours ;

            } else {
                total = wage * hours;

            }
            System.out.println("\nYou'll make $" + df2.format(total) + " this week.");
        }

        input.close();
    }
}
