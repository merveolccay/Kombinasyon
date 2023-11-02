package java101;
import java.util.Scanner;

public class KombinasyonProgrami {

    public static long faktoriyel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long sonuc = 1;
        for (int i = 1; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static long kombinasyon(int n, int r) {
        long nFaktoriyel = faktoriyel(n);
        long rFaktoriyel = faktoriyel(r);
        long nMinusRFaktoriyel = faktoriyel(n - r);
        return nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n'i giriniz: ");
        int n = scanner.nextInt();
        System.out.print("r'yi giriniz: ");
        int r = scanner.nextInt();
        scanner.close();

        if (n < r) {
            System.out.println("Hatalı giriş. n, r'den büyük veya eşit olmalıdır.");
        } else {
            long kombinasyonSonucu = kombinasyon(n, r);
            System.out.println("C(" + n + ", " + r + ") = " + kombinasyonSonucu);
        }
    }
}
