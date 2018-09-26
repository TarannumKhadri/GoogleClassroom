package Fraction;
import java.util.Scanner;

/**
 *
 * @author Arifa
 */
public class EgyptianFrac {
static int gcd(int a, int b){
  if (b == 0)
  return a;
  else
  return gcd(b, a % b);
}
static void simp(int a,int b){
  int l=gcd(a,b);
  a= a/l;
  b= b/l;
  if (denominator == 0){
      throw new IllegalArgumentException("Argument 'divisor' is 0");
  }
  System.out.println(" = " + a + "/" + b );
}
public static void main( String [] args){
  int u;
  int a[]; 
  double sum = 0, g,d,b[];
  System.out.println ( "ENTER THE NUMBER OF INSTANCES: " );
  Scanner instance = new Scanner(System.in);
  int n = instance.nextInt();
  for(int i = 0 ; i < n ; i++ ){
      sum = 0;
      d = 0 ;
      System.out.println("\n ENTER THE NUMBER OF FRACTIONS YOU WANT TO ADD: ");
      int m = instance.nextInt();
      a = new int[m+1];
      b = new double[m+1];
      System.out.println("ENTER THE DENOMINATOR OF EACH EGYPTIAN FRACTION: ");
      for( int k = 0 ; k < m ; k++ ){
         a[k]=instance.nextInt();
      }
      if (m == 1) {          
         System.out.println("1/" + a[0] + "=1/" + a[0]);
      }
      if(m == 0){
         System.out.println("ERROR!!NO FRACTION ENTERED");
      }
      else{
         for( int k = 0 ; k < m-1 ; k++ ){
               g = gcd(a[k],a[k+1]);
               d =(double) a[k]*a[k+1]/g;
          }
          for(int k = 0 ; k < m ; k++ ){
               b[k]= d/ a[k];
               sum= sum+ b[k];
          }
// u= gcd(sum, d);
// sum= sum/u;
// d= d/u;
          for(int k = 0 ; k < m-1 ; k++ ){
                System.out.println(" 1/" + a[k] + "+" );
          }
          System.out.println(" 1/" + a[m-1] );
          simp((int)sum, (int)d);
        }
     }
  }    
}
