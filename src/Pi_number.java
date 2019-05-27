import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pi_number {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Number:");
            int n = input.nextInt();

            BigDecimal decimal = new BigDecimal(Math.PI).setScale(n, RoundingMode.HALF_UP);

            System.out.printf("value: %s", decimal.toString());

        }

    }
}

