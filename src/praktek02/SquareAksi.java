package praktek02;
public class SquareAksi {
    public static void main(String[] args) {
        Square r1 = new Square();
        r1.sisi1 = 5;
        r1.sisi2 = 5;
        
        r1.cetakInfo();
        System.out.println("Luas Square =  "+r1.hitungLuas());
        r1.cetakLuas ();
        
    }
}
