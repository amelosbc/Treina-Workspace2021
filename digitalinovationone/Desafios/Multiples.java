import java.io.IOException;
import java.util.Scanner;

public class Multiples{
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        int  a = leitor.nextInt();
        int  b  = leitor.nextInt();
        
        if (a < 0)
          a = a * -1;
          
        if (b < 0)
          b = b * -1;
          
        int  c = a%b;
        
        if ( c == 0  ) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}