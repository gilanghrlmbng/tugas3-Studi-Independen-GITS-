package tugas3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            Scanner san = new Scanner(System.in);
            Random acak = new Random();

            int bil;
            int []bil_acak= new int[10];
            for (int i = 0 ; i < bil_acak.length;i++){
                bil = acak.nextInt(10)+1;
                System.out.print(bil+" ");
                bil_acak[i] = bil;
            }
            Bilangan_acak bil_ganjil = new Bilangan_acak();
            Bilangan_acak bil_genap = new Bilangan_acak();
            System.out.println();
            System.out.print("Bilangan ganjil acak : ");
            bil_ganjil.ganjil(bil_acak);
            System.out.println();
            System.out.print("Bilangan genap acak : ");
            bil_genap.genap(bil_acak);
        }

}
