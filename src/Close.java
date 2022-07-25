import java.util.Scanner;
import java.util.Arrays;

public class Close {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen sayı giriniz");

        int close= input.nextInt();
        int min=0;
        int max=0;

        int[] dizi = {5,13,67,73,62,27,90,-43,56,356,-98} ;



            min =Math.abs(close-dizi[0]);

            max=Math.abs(dizi[0]-close);




        for(int i =0; i<dizi.length ; i++) {

            if (dizi[i] < close) {

                int x = close - dizi[i];

                if (x <= min) {

                    min = x;
                }
            }

            else if(close<dizi[i]){

                int x = dizi[i] - close;

                if (x <= max) {

                    max = x;
                }
            }
        }

        int close_smaller= close-min;
        int close_bigger=close+max;

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + close_smaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+ close_bigger );

    }
   }

