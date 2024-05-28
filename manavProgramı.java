import java.util.Scanner;
public class manavProgramı {
    public static void main(String[] args) {

//Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
//Meyveler ve KG Fiyatları
//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        Scanner input = new Scanner(System.in);


        System.out.print("Kac kg armut alindi? : " );
        armutKg = input.nextInt();

        System.out.print("Kac kg elma alindi? : " );
        elmaKg = input.nextInt();

        System.out.print("Kac kg domates alindi? : " );
        domatesKg = input.nextInt();

        System.out.print("Kac kg muz alindi? : " );
        muzKg = input.nextInt();

        System.out.print("Kac kg patlican alindi? : " );
        patlicanKg = input.nextInt();


        double toplamTutar = (armutKg*armutFiyat) + (elmaKg*elmaFiyat) + (domatesKg*domatesFiyat) + (muzKg*muzFiyat) + (patlicanKg*patlicanFiyat);
        System.out.println("Toplam tutar : " +toplamTutar);







    }
}