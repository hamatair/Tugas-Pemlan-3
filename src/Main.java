import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList mahasiswas = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        boolean next = true;
        while (next) {
            System.out.print("masukkan nim : ");
            String nim = scanner.nextLine();

            System.out.print("masukkan nama : ");
            String nama = scanner.nextLine();

            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(nim);
            mhs.setNama(nama);

            ArrayList KHS = new ArrayList();
            boolean nextKHS = true;
            while (nextKHS) {
                System.out.print("masukkan kode khs : ");
                String kode = scanner.nextLine();

                System.out.print("masukkan nama mata kuliah : ");
                String nama_mk = scanner.nextLine();

                System.out.print("masukkan nilai dalam bentuk angka : ");
                int nilai_angka = scanner.nextInt();
                scanner.nextLine();

                KHS khs = new KHS();
                khs.setKode(kode);
                khs.setNama_mk(nama_mk);
                khs.setNilai_matkul(nilai_angka);
                KHS.add(khs);

                System.out.print("tambah KHS ? :\n(y/n)");
                String tambahkhs = scanner.nextLine();
                if (tambahkhs.equals("n")) {
                    nextKHS = false;
                }
            }

            mhs.setKhs(KHS);
            mahasiswas.add(mhs);
            System.out.print("tambah data mahasiswa ? :\n(y/n)");
            String tambah = scanner.nextLine();

            if (tambah.equals("n")) {
                next = false;
            }

        }

        for (int i = 0; i < mahasiswas.size(); i++) {
            System.out.println("==================================");
            Mahasiswa mhs = (Mahasiswa) mahasiswas.get(i);
            System.out.println("NIM : " + mhs.getNim());
            System.out.println("Nama : " + mhs.getNama());
            System.out.println("KHS : ");
            ArrayList khs = mhs.getKhs();
            System.out.println("_____________________________________________");
            System.out.printf("|%-15s|%-20s|%-7s|\n", "Kode", "Nama Mata Kuliah", "Nilai");
            System.out.println("_____________________________________________");
            for (int j = 0; j < khs.size(); j++) {
                KHS k = (KHS) khs.get(j);
                System.out.printf("|%-15s|%-20s|%-7s|\n", k.getKode(), k.getNama_mk(), k.getNilai_matkul());
            }
            System.out.println("_____________________________________________\n");
        }
    }
}