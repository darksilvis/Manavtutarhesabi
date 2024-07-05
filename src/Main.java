import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float Hesap;
        float Armut = 32.14f;
        float Elma = 30.67f;
        float Domates = 21.11f;
        float Muz = 69.95f;
        float Patlican = 25.00f;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç kilo armut aldınız: ");
        float armutKilo = input.nextFloat();

        System.out.println("Kaç kilo elma aldınız: ");
        float elmaKilo = input.nextFloat();

        System.out.println("Kaç kilo domates aldınız: ");
        float domatesKilo = input.nextFloat();

        System.out.println("Kaç kilo muz aldınız: ");
        float muzKilo = input.nextFloat();

        System.out.println("Kaç kilo patlıcan aldınız: ");
        float patlicanKilo = input.nextFloat();

        Hesap = armutKilo * Armut + elmaKilo * Elma + domatesKilo * Domates + muzKilo * Muz + patlicanKilo * Patlican;

        System.out.println("Toplam Tutar: " + Hesap + " TL");
    }
}
