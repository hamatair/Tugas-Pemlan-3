public class KHS {
    private String kode;
    private String nama_mk;
    private int nilai_angka;
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama_mk() {
        return nama_mk;
    }

    public void setNama_mk(String nama_mk) {
        this.nama_mk = nama_mk;
    }

    public String getNilai_matkul() {
        String nilai_huruf;

        if(nilai_angka < 40){
            nilai_huruf = "E";
        } else if (nilai_angka < 50) {
            nilai_huruf = "D";
        } else if (nilai_angka < 54) {
            nilai_huruf = "C-";
        } else if (nilai_angka < 59) {
            nilai_huruf = "C";
        } else if (nilai_angka < 64) {
            nilai_huruf = "C+";
        } else if (nilai_angka < 69) {
            nilai_huruf = "B-";
        } else if (nilai_angka < 74) {
            nilai_huruf = "B";
        } else if (nilai_angka < 79) {
            nilai_huruf = "B+";
        } else if (nilai_angka < 84) {
            nilai_huruf = "A-";
        } else{
            nilai_huruf = "A";
        }

        return nilai_huruf;
    }

    public void setNilai_matkul(int nilai_angka) {
        this.nilai_angka = nilai_angka;
    }



}
