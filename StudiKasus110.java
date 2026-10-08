import java.util.Scanner;
public class StudiKasus110{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Harga per cup = 15000 + (10 mod 6) * 1000 = 19000
        Syarat minimal belanja untuk diskon = 80000 + (10 mod 5) * 10000 = 80000
        Persentase diskon = 5 + (10 mod 6) % = 9%
         */
        int hargaPerCup = 19000, jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan jumlah uang bayar: Rp ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
    if (totalHarga >= 80000) {
        diskon = totalHarga * 9 / 100;
        }
        totalBayar = totalHarga - diskon;
        System.out.println("Total harga: Rp "+ totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total bayar: Rp " + totalBayar);
    if (uangBayar >= totalBayar ){
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: Rp "+ kembalian);
    }else { 
    kurang = totalBayar - uangBayar;
    System.out.println("Uang todak cukup, kurang: Rp ");
    }
}
}