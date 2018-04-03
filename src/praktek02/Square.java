
package praktek02;
public class Square {
    double sisi1;
    double sisi2;

    public Square() {
        sisi1=5;
        sisi2=5;
    }

    public Square(double sisi1, double sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }
    
  void cetakInfo () {
      System.out.println("=================");
      System.out.println("Sisi1 :"+sisi1);
      System.out.println("Sisi2 :"+sisi2);
      System.out.println("=================");
       
  }
  
  double hitungLuas (){
      double luas;
      luas=sisi1*sisi2;
      return luas;
  }
  
  void cetakLuas () {
      System.out.println("Luasnya Adalah:  "+hitungLuas());
  }
}
