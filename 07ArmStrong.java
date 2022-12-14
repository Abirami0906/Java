import java.util.*;
public class Armstrong {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);

        int number , originalNumber, remainder, result = 0, n = 0;
        number = sc.nextInt();

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
