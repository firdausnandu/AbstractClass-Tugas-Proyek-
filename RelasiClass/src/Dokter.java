import java.util.Scanner;
public class Dokter {
    int id_dokter;
    String nama_dokter;
    String alamat_dokter;
    String notelp_dokter;
    String spesialis_dokter;


    final void isi_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA PETUGAS");
        System.out.println("Masukan ID Dokter        :");
        id_dokter=input.nextInt();
        System.out.println("Masukan Nama Dokter      :");
        nama_dokter= input.next();
        System.out.println("Masukan Alamat Dokter    :");
        alamat_dokter= input.next();
        System.out.println("Masukan Nomor Dokter     :");
        notelp_dokter= input.next();
        System.out.println("Masukan Spealis Dokter   :");
        spesialis_dokter= input.next();
    }
    void update_data(){

    }
}
