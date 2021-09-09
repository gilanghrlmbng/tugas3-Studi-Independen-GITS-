package tugas3;

public class Bilangan_acak extends Kelompok_bilangan {

        void ganjil(int[] bil){
            for (int j : bil) {
                if (j % 2 == 1) {
                    System.out.print(j + ",");
                }
            }
        }
        void genap(int []bil){
            for (int j : bil) {
                if (j % 2 == 0) {
                    System.out.print(j + ",");
                }
            }
        }
}
