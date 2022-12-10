import java.util.Scanner;

public class Berobat {
    int id_transaksi;
    int id_pasien;
    String tanggal_berobat;
    String deskripsi_keluhan;
    int total_pembayaran;

    final void isi_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA TRANSAKSI");
        System.out.println("Masukan ID Transaksi       :");
        id_transaksi=input.nextInt();
        System.out.println("Masukan ID Pasien          :");
        id_pasien= input.nextInt();
        System.out.println("Masukan Tanggal Berobat    :");
        tanggal_berobat= input.next();
        System.out.println("Masukan Deskripsi Keluhan  :");
        deskripsi_keluhan= input.next();
    }

    void lihat_data(){

    }
    void update_data(){

    }

}
