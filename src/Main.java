import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = input.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double ucret = mesafe * 0.10;

            if (yas < 12) {
                ucret -= ucret * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                ucret -= ucret * 0.10;
            } else if (yas >= 65) {
                ucret -= ucret * 0.30;
            }

            if (yolculukTipi == 2) {
                ucret *= 0.80;
            }

            System.out.println("Toplam Tutar = " + ucret + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}