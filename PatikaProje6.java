/* Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
 Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m) */

import java.util.Scanner;

public class PatikaProje6 {
    public static void main(String[] args){

        //Değişkenleri tanımlayalım
        double kg, m, vucutKitleIndeks;

        //Scanner sınıfını tanımlayalım
        Scanner deger = new Scanner(System.in);

        //Kullanıcıdan boy ve kilo değerlerini alalım
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kg = deger.nextDouble();

        System.out.print("Lütfen Boyunuzu (Metre Cinsinde) Giriniz : ");
        m = deger.nextDouble();

        //Vücut kitle indeksini hesaplayalım
        vucutKitleIndeks = kg / (m * m) ;
        System.out.print("Vücut Kitle İndeksiniz : " + vucutKitleIndeks);
    }
}
