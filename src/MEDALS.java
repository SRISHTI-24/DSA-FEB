import java.util.Scanner;
class medal
{
    public static int totalml(int a[][], int na[])
    {
        int rk=0,sm=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sm=sm+a[i][j];
            }
            na[rk]=sm;
            rk=rk+1;
            sm=0;
        }
        return rk;
    }
}
public class MEDALS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[][] = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                a[i][j]=s.nextInt();
        }
        int na[] = new int[9];
        int x = medal.totalml(a,na);
        for(int i=0;i<x;i++)
            System.out.println(na[i]);

    }
}
