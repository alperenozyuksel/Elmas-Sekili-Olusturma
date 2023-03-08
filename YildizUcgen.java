import java.util.Scanner;
public class YildizUcgen {
    public static void main(String[] args) {
        System.out.println("********Yildiz Olusturma********");

        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Sayi Tuslayiniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println();

            for (int j = 1; j <= (n - i + 1); j++) {

                System.out.print(" ");


            }

            for (int j = 1; j <= (2 * i) - 1; j++) {

                System.out.print("*");

            }




        }

         System.out.println();
        for (int i = n - 1; i >= 1; i--){

            for (int j = 1; j <= n - i+1; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        }


    }

