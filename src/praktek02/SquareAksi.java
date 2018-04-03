package praktek02;
public class SquareAksi {
    public static void main(String[] args) {
        Square r1 = new Square();
        r1.sisi1 = 5;
        r1.sisi2 = 5;
        
        r1.cetakInfo();
        System.out.println("Luas Square =  "+r1.hitungLuas());
        r1.cetakLuas ();
        
        Square r2 = new Square ();
        r2.cetakInfo();
        
        Square r3 = new Square (10,10);
        r3.cetakInfo();
    }
}
