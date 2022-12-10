import java.util.Scanner;

public class Pasien {
    int id_pasien;
    String nama_pasien;
    String alamat_pasien;
    String notelp_pasien;

   final void isi_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA PASIEN");
        System.out.println("Masukan ID Pasien      :");
        id_pasien=input.nextInt();
        System.out.println("Masukan Nama Pasien    :");
        nama_pasien= input.next();
        System.out.println("Masukan Alamat Pasien  :");
        alamat_pasien= input.next();
        System.out.println("Masukan Nomor Pasien   :");
        notelp_pasien= input.next();

    }
    void update_data(){

    }
}
