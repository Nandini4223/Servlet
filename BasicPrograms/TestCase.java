package BasicPrograms;
final class CurrencyNote{
   private final int noteValue;
   public CurrencyNote(int v){
       noteValue = v;
   }
   public int noteValue(){
     return noteValue;
   }
}
public class TestCase{
  public static void main(String[] args){
      CurrencyNote n = new CurrencyNote(500); // wrapping or boxing or packing
	  int v = n.noteValue(); // unwrapping or un boxing or un packing
	  System.out.println(v);
  }
}