import java.util.Scanner;
public class KaryawanAdministrasi {
    int id_karyawan;
    String nama_karyawan;
    String alamat_karyawan;
    String notelp_karyawan;
    String tugas_karyawan;

    final void isi_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA KARYAWAN");
        System.out.println("Masukan ID Karyawan    : ");
        id_karyawan=input.nextInt();
        System.out.println("Masukan Nama Karyawan   :");
        nama_karyawan= input.next();
        System.out.println("Masukan Alamat Karyawan :");
        alamat_karyawan= input.next();
        System.out.println("Masukan Nomor Karyawan  :");
        notelp_karyawan= input.next();
        System.out.println("Masukan Tugas Karyawan  :");
        tugas_karyawan= input.next();
    }
    void update_data(){

    }
}