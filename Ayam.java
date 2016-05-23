package hewan;

public class Ayam extends Hewan {
    private String nama, jenis, bersuara;
    Ayam(String nama, String jenis, String bersuara){
        super(nama, jenis, bersuara);
    }
    
    public void ShowAyam(){
        System.out.println("Nama Ayam: " +nama);
        System.out.println("Jenis Ayam: " +jenis);
    }
    
    public void bersuara(){
        System.out.println("Kukkkkuruyuuuukkk...");
    }
}
