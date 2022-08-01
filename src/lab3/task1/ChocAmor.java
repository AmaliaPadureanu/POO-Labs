package lab3.task1;

public class ChocAmor extends CandyBox {
   float length;

   ChocAmor() {

   }

   ChocAmor(String flavor, String origin, float length) {
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

}
