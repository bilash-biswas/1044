import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a,b;
    a = input.nextInt();
    b = input.nextInt();
    if(a % b == 0 || b % a == 0)
    {
        System.out.printf("Sao Multiplos\n");
    }
    else
    {
        System.out.printf("Nao sao Multiplos\n");
    }
  }  
}
