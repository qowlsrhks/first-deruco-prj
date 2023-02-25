import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int i;
        int j;
        int k;

        for(i=1;i<=n;i++){
            for(j=0;j<n-i;j++)
                System.out.print(" ");
            for(j=0;j<i*2-1;j++)
                System.out.print('*');
            System.out.println();
        }
    }
}