class Calculation {
   int z;
	
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
}
public class inheritence_prectice extends Calculation {
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }	
   public static void main(String args[]) {
      int a = 5, b = 10;
      MainClass obj1 = new MainClass();
      obj1.addition(a, b);
      obj1.Subtraction(a, b);
      obj1.multiplication(a, b);
   }
}
