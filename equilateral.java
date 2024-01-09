import java.util.*;
public class equilateral {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("n : ");
        int n=s.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            int c=1;
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
