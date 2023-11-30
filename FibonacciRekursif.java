import java.util.Scanner;

public class FibonacciRekursif {
    static int hitungJumlahMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return hitungJumlahMarmut(bulan - 1) + hitungJumlahMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan ke: ");
        int bulan = sc.nextInt();

        int jumlahMarmut = hitungJumlahMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah " + jumlahMarmut);
    }
}