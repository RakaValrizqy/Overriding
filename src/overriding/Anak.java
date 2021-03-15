package overriding;
public class Anak extends Induk  {     // menjadikan class Anak sebagai subclass dari class Induk
    //membuat override untuk method hitung di class Induk 
    @Override
    public void hitung(int a, int t){ //membuat method penghitung luas segitiga
        System.out.println("Luas segitiga adalah : "+((a*t)/2));   
    }
}
