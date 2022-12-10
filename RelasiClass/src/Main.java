import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("=======APLIKASI KLIKIK BROTOMULYO========");
        System.out.println("=========================================");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int pilih,biaya;

        KlinikBrotomulyo klinik = new KlinikBrotomulyo(1121,"KLINIK BROTOMULYO");
        System.out.println("NAMA KLINIK : "+klinik.nama_klinik);
        System.out.println("ID KLINIK   : "+klinik.id_klinik);
        System.out.println("DESKRIPSI   : "+klinik.deskripsi());
        System.out.println("JADWAL      : "+klinik.jadwal());
        System.out.println();
        System.out.println("==============DAFTAR KLINIK===============");
        PoliGigi gigi = new PoliGigi(100,"POLI GIGI");
        System.out.println("NAMA POLI   : "+gigi.nama_klinik);
        System.out.println("ID POLI     : "+gigi.id_klinik);
        System.out.println("DESKRIPSI   : "+gigi.deskripsi());
        System.out.println("JADWAL      : "+gigi.jadwal());
        System.out.println("HARGA       : "+gigi.harga(100000));
        System.out.println();

        PoliUmum umum = new PoliUmum(101,"POLI UMUM");
        System.out.println("NAMA POLI   : "+umum.nama_klinik);
        System.out.println("ID POLI     : "+umum.id_klinik);
        System.out.println("DESKRIPSI   : "+umum.deskripsi());
        System.out.println("JADWAL      : "+umum.jadwal());
        System.out.println("HARGA       : "+umum.harga(200000));
        System.out.println();

        PoliPenyakitDalam dalam = new PoliPenyakitDalam(102,"POLI PENYAKIT DALAM");
        System.out.println("NAMA POLI   : "+dalam.nama_klinik);
        System.out.println("ID POLI     : "+dalam.id_klinik);
        System.out.println("DESKRIPSI   : "+dalam.deskripsi());
        System.out.println("JADWAL      : "+dalam.jadwal());
        System.out.println("HARGA       : "+dalam.harga(300000));
        System.out.println();



        System.out.println("Lanjutkan Mengisi Data Klinik ?");
        System.out.println("1. IYA");
        System.out.println("2. TIDAK");
        System.out.println("Pilih: ");
        pilih = input.nextInt();
        if(pilih==1){
            Dokter Dokter = new Dokter();
            Dokter.isi_data();
            Dokter.update_data();
            KaryawanAdministrasi KaryawanAdministrasi = new KaryawanAdministrasi();
            KaryawanAdministrasi.isi_data();
            KaryawanAdministrasi.update_data();
            Pasien Pasien = new Pasien();
            Pasien.isi_data();
            Pasien.update_data();
            Perawat Perawat = new Perawat();
            Perawat.isi_data();
            Perawat.update_data();
            Berobat Berobat = new Berobat();
            Berobat.isi_data();
            Berobat.lihat_data();
            Berobat.update_data();
        } else if (pilih==2) {
            System.exit(0);
        }else{
            System.out.println("INVALID!");
        }


        //MODIFIKASI PROGRAM CLASS ABSTRACT
        System.out.println("MENU PEMBAYARAN                  |  HARGA        ");
        System.out.println("1. Cek Medis Poli Gigi           | Rp 200,000    ");
        System.out.println("2. Cek Medis Poli Umum           | Rp 150,000    ");
        System.out.println("3. Cek Medis Poli Penyakit Dalam | Rp 500,000    ");
        System.out.println("Masukan Pilihan Anda = ");
        pilih= input.nextInt();
        System.out.println();
        if (pilih==1){
            PembayaranObat pb = new PembayaranObat(200000);
            System.out.println("Total Bayar : "+pb.pembayaran());
        } else if (pilih==2) {
            PembayaranObat pb = new PembayaranObat(150000);
            System.out.println("Total Bayar : "+pb.pembayaran());
        }else if (pilih==3) {
            PembayaranObat pb = new PembayaranObat(500000);
            System.out.println("Total Bayar : "+pb.pembayaran());
        }

    }
}