import java.util.Scanner;
public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;

        System.out.println("Matematik notunu giriniz:");
        Matematik = input.nextInt();

        System.out.println("Fizik notunu giriniz:");
        Fizik = input.nextInt();

        System.out.println("Kimya notunu giriniz:");
        Kimya = input.nextInt();

        System.out.println("Türkçe notunu giriniz:");
        Turkce = input.nextInt();

        System.out.println("Tarih notunu giriniz:");
        Tarih = input.nextInt();

        System.out.println("Müzik notunu giriniz:");
        Muzik = input.nextInt();

        double sonuc = (Matematik+Fizik+Kimya+Turkce+Tarih+Muzik)/6;
        System.out.println("Not ortalaması:" + sonuc);

        String str = (sonuc>60) ? "Sınıfı geçti." : "Sınıfta kaldı.";
        System.out.println(str);
    }
}
