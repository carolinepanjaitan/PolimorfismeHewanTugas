package hewan;

public class Kucing extends Hewan {
    private String nama, jenis, bersuara;
    Kucing(String nama, String jenis, String bersuara){
        super(nama, jenis, bersuara);
    }
    
    public void ShowKucing(){
        System.out.println("Nama Ayam: " +nama);
        System.out.println("Jenis Ayam: " +jenis);
    }
    
    public void bersuara(){
        System.out.println("Meongg.. Meonnggg...");
    }
}
