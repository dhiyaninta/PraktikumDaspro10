import java.util.Scanner;
public class StudiKasus210 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String namaMahasiswa, jenisKegiatan, Lainnya;
        boolean layakDapatDana;
        int statusPKM, juara, jumlahDokumen, kurang;

        System.out.print("Nama Mahasiswa: ");
        namaMahasiswa = input.nextLine();
        System.out.print("Jenis Kegiatan (BELMAWA/ BAKORMA/ Mandiri/ PKM/ LAINNYA): ");
        jenisKegiatan = input.nextLine().trim();
        System.out.print("Masukkan jumlah dokumen yang di upload: ");
        jumlahDokumen = input.nextInt();
        if (jumlahDokumen == 4) {
            if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Masukkan status PKM anda: ");
            statusPKM = input.nextInt();
                if(statusPKM == 1){
                    System.out.println("lolos");
                } else {
                    System.out.println("tidak lolos");
                } 
            }else { 
                if ((jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri") )){
                layakDapatDana = true;
                System.out.print("Peringkat Juara: ");
                juara = input.nextInt();

                    if (juara >= 1 && juara <=3) {
                        layakDapatDana = true;
                        System.out.println("Mendapat dana karena juara " + juara);
                    }else {
                        System.out.println("Tidak mendapat dana karena bukan juara peringkat 1, 2, atau 3.");
                    }

                } else{
                System.out.println("Tidak mendapat dana");
                }   
            }
        }else {
            kurang = 4 - jumlahDokumen;
            System.out.println("Dokumen kurang lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan");
        }
    }
}