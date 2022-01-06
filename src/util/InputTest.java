package util;

 public class InputTest {
     public static void main(String[] args) {
         Input in = new Input();

         String unoReverse = in.getString();


//         Input input = new Input();
//         System.out.println(input.getString());
//         System.out.println(input.yesNo());
//         System.out.println(input.getInt(0, 100));
//         System.out.println(input.getInt(3, 40));
//         System.out.println(input.getDouble(0, 100));
//         System.out.println(input.getDouble(2,5,6,7));


         Input myScanner = new Input();
         System.out.println(myScanner.getInt(myScanner.getInt("Input a min number."), myScanner.getInt("Input a max number.")));
         System.out.println("Start getDouble");
         System.out.println(myScanner.getDouble(myScanner.getDouble("Input a min double."), myScanner.getDouble("Input a max double.")));
         System.out.println("End");

     }
}
