import java.util.Scanner;

public class CekPrimaRekursif {

    static String cekPrimaRekursif(int n, int i) {
        if (i == n) {
            return "prima";
        }
        if (n % i == 0) {
            return "bukan prima";
        }
        return cekPrimaRekursif(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();

        String hasil = cekPrimaRekursif(n, 2);

        System.out.println(n + " adalah bilangan " + hasil);
    }
}