import java.util.Scanner;

public class Perawat {
    int id_perawat;
    String nama_perawat;
    String alamat_perawat;
    String notelp_perawat;
    String tugas_perawat;

    final void isi_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA PERAWAT");
        System.out.println("Masukan ID Perawat      :");
        id_perawat=input.nextInt();
        System.out.println("Masukan Nama Perawat    :");
        nama_perawat= input.next();
        System.out.println("Masukan Alamat Perawat  :");
        alamat_perawat= input.next();
        System.out.println("Masukan Nomor Perawat   :");
        notelp_perawat= input.next();
        System.out.println("Masukan Tugas Perawat   :");
        tugas_perawat= input.next();

    }
    void update_data(){

    }
}
