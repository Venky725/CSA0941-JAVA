import java.util.Scanner;
public class SkipNumber{
    

public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.printf("enter m : ");
    int m=s.nextInt();
    System.out.printf("enter n : ");
    int n=s.nextInt();
    int i;
    for(i=m;i<=n;i+=7)
    {
        System.out.println(i);
    }
}
}
