package lab3.tasks1235;

public class ChocAmor extends CandyBox {
   float length;

   public ChocAmor() {}

   public ChocAmor(String flavor, String origin, float length) {
      super(flavor, origin);
      this.length = length;
   }

   public float getVolume() {
      float result = length * length * length;
      return result;
   }

   public String toString() {
      return super.toString() + " has volume " + getVolume();
   }

   public void printChocAmorDim() {
      System.out.print("length = " + length + "\n");
   }

   public void printDim() {
      System.out.print("length = " + length + "\n");
   }
}
