import java.util.Scanner;

public class PointValueFinding {

    public static void main(String[] args) {


    /*
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
     */

        Scanner entry = new Scanner(System.in);

        String message1;
        int number1,number2,number3,average,notZero;
        number2 = 0;
        number3 = 0;

        message1 = "Enter number : ";
        System.out.print(message1);
        number1 = entry.nextInt();

        for (int i = 0; i <= number1; i++) {
            if (i % 3 == 0) {
                if (i % 4 == 0) {
                        System.out.print(i + ",");
                        number2 += 1;
                        number3 += i;
                }
            }
        }

        System.out.println();
        notZero = number2 - 1;
        average = number3 / notZero;
        System.out.println("Number of elements : " + notZero + "\nAverage : " + average);
    }


}
