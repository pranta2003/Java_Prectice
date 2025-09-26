public class Human{
      String name;
      String color;
      float height;
      float weight;


      Human()
      {
      }

      Human(String a,String b,float c,float d){
         this.name=a;
         this.color=b;
         this.height=c;
         this.weight=d;
      }
     
     public String getName() {
        return name;
     }
}

public class inheritence_prec {
   public static void main(String args[]) {
     Human ismail = new Human();
     ismail.getName();
     Human amit = new Human("Amit","White","5.5","69");
     String x = amit.getName();
    System.out.println("Name"+x);
   }
}
