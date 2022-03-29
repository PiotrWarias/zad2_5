import java.util.Scanner;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) 
  {
    Scanner a = new Scanner(System.in);
    double x=a.nextDouble();
    if(x%4==0 && x%100!=0 || x%400==0)
    {
      System.out.println("rok przestępny");
    }
    else
    {
      System.out.println("rok nieprzestępny");
    }

  }
}