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
public class Human extends LivingThing {
    private String nama;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public void walk(String nama) {
       System.out.println(nama + " Sedang berjalan");
    }
}