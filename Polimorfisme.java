package hewan;

import java.util.*;

public class Polimorfisme {
    public static void main(String[] args){
        Hewan[] hewannya = {
        new Anjing("Berni", "Herder", "Huggg.. Huggg.. Huggggg..."),
            new Kucing("Kitty", "Anggora", "Meongggg.. Meonggg..."),
            new Ayam("Peppo", "Buras", "Kukkkuruyuuukkk...")
    };
        Hewan pilihHewan;
        Random pilih = new Random();
        for (int i = 0; i < 5; i++) {
            pilihHewan = hewannya[pilih.nextInt(hewannya.length)];
            System.out.println("\nPilihan Anda: \n" +pilihHewan);
        }
    }
}
