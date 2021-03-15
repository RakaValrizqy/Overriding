
// Saya akan menerapkan overriding dengan membuat program penghitung luas persegi panjang dan segitiga
package overriding;
public class Main {
    public static void main(String[] args) {
        //membuat objek
        Induk persegiPanjang = new Induk();
        Anak segitiga = new Anak();
        
        //memanggil method hitung dari class Induk
        persegiPanjang.hitung(20, 20);
        
        //memanggil method hitung dari class Anak
        segitiga.hitung(20,20);
    }
    
}
