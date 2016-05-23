package hewan;

public class Anjing extends Hewan {
    private String nama, jenis, bersuara;
    Anjing(String nama, String jenis, String bersuara){
        super(nama, jenis, bersuara);
    }
    
    public void ShowAnjing(){
        System.out.println("Nama Ayam: " +nama);
        System.out.println("Jenis Ayam: " +jenis);
    }
    
    public void bersuara(){
        System.out.println("Hugg.. Huggg.. Huggg...");
    }
}
