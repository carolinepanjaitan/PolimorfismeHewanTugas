package hewan;

public class Hewan {
    String nama, jenis, bersuara;
    Hewan(String nama, String jenis, String bersuara) {
        this.nama = nama;
        this.jenis = jenis;
        this.bersuara = bersuara;
    }
    
    public String toString() {
        return "Hewan ini jenisnya adalah "+jenis+ "\nNamanya "+nama+ "\nIa mengeluarkan suara" +" "+bersuara;
    }
    
    public void bersuara(){
    }
}
