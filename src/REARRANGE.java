import java.util.Scanner;

public class REARRANGE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] =  new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int b[] = new int[n];
        int rk=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                b[rk]=a[i];
                rk++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                b[rk]=a[i];
                rk++;
            }
        }
        for(int i=0;i<rk;i++)
            System.out.print(b[i]);
    }
}
