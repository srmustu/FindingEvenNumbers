import java.util.Scanner;
public class FindEvenNumver {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int number;
        String message1;

        message1 = "Please enter the number : ";
        System.out.print(message1);
        number = entry.nextInt();


        for (int i = 0 ; i < number ; i++ ){
            if (i % 2 == 0){
                System.out.print(i + ",");
            }else {
                continue;
            }

        }
    }
}
