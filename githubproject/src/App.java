public class App {
   public static void main(String[] args) throws Exception {
      String creator = "Ishrak Rahman";
      int number1 = 5;
      int number2 = 2;
      //System.out.println(number1);
      int multiplication,addition,subtraction;
      double division;
      System.out.println("Printer App");
      System.out.println("This app is made by: " + creator);
      System.out.println("The value of number1 is " + number1);
      System.out.println("The value of number2 is " + number2);
        multiplication = number1 * number2;
      System.out.println(number1+" * "+number2+" = "+multiplication);
      addition=number1+number2;
      System.out.println(number1+" + "+number2+" = "+addition);
      division=(double)number1/number2;
      System.out.println(number1+" / "+number2+" = "+division);
      subtraction=number1-number2;
      System.out.println(number1+" - "+number2+" = "+ subtraction);
        }}