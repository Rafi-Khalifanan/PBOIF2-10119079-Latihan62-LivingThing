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
public class PBOIF210119079Latihan62LivingThing {
    public static void main(String[] args) {

        Human human = new Human();
        human.setNama("Rafi Khalifanan Azanan");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
}