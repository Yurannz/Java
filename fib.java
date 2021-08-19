import java.util.Scanner;
public class Fib {
    public static int main(String[] args) {
            
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            
            if(n == 1) {
                return 0;
            }
            if(n == 2) {
                return 1;
            }
            
            int f[];
            
            f[0] = 0;
            f[1] = 1;
            
            for(int i = 2; i <= n; i++) {
                f[i] = f[i-1] + f[i-2];
                int p = 0;
                p = f[i];
            }
        
        return(p);
    }
}
