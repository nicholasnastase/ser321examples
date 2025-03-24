import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */

//nnastase 3/24/2025 updating to take 0-2 inputs
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator =1; denominator = 1;
   }  //change for default

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      //make sure non-zero
      if (d==0){
         System.out.println("denom cannot be 0.");
         System.exit(1);      //exit if 0
      }
      denominator = d;

   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {
         // create a new instance
         // Fraction *frac = [[Fraction alloc] init];
         Fraction frac = new Fraction();

         // set the values
         if (args.length > 0) {
            frac.setNumerator(Integer.parseInt(args[0]));
         }
         if (args.length > 1) {
            frac.setDenominator(Integer.parseInt(args[1]));
         }

         // print it
         System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

      }catch (NumberFormatException e){
         System.out.println("error, provide proper int values");
      }catch(Exception e) {
         e.printStackTrace();
      }
   }
}

