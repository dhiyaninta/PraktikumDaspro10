import java.util.Scanner;
public class StudiKasus210 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
     
        String namaMahasiswa, jenisKegiatan, alasan;
        boolean layakDapatDana;
        int statusPKM, juara, jumlahDokumen, kurang;

        System.out.print("Nama Mahasiswa: ");
        namaMahasiswa = input.nextLine();
        System.out.print("Jenis Kegiatan (BELMAWA/ BAKORMA/ Mandiri/ PKM): ");
        jenisKegiatan = input.nextLine().trim();
        System.out.print("Masukkan jumlah dokumen yang di upload: ");
        jumlahDokumen = input.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Masukkan status PKM anda: ");
            statusPKM = input.nextInt();
            if(statusPKM == 1){
                if (jumlahDokumen == 4) {
                    System.out.println("Memenuhi syarat. Dana penghargaan diberikan");
                } else {
                    kurang = 4 - jumlahDokumen;
                    System.out.println("Dokumen kurang lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan");
                } 
            }else{
                System.out.println("Dana penghargaan tidak diberikan");
            }
        } else if ((jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri"))){
            layakDapatDana = true;
            System.out.print("Peringkat Juara: ");
            juara = input.nextInt();
            
            if (juara >= 1 && juara <=3) {
            layakDapatDana = true;
            } else {
            System.out.println("Bukan peraih juara 1, 2, atau 3");
            }
        if (layakDapatDana = true) {
            if ( jumlahDokumen == 4){
             System.out.println("Dokumen lengkap. Dana penghargaan diberikan.");
            } else if (jumlahDokumen == 0 && jumlahDokumen < 4) {
            kurang = 4 - jumlahDokumen;
            System.out.println("Dokumen tidak lengkap (Kurang " + kurang +" dokumen). Dana penghargaan tidak diberikan.");
        } else {
        System.out.println("Dokumen tidak valid dan dana tidak diberikan");
        }
    }
}
    }
}