package pboif2.pkg10119079.latihan62.livingthing;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama +"Bernafas");
    }
    public void eat(String nama){
        System.out.println(nama+"Makan");
    }
}
