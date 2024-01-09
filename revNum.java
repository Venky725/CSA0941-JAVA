import java.util.*;
public class revNum {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=s.nextInt();
        int rem,res=0;
        while(n!=0)
        {
            rem=n%10;
            res=res*10+rem;
            n/=10;
        }
            System.out.print("Reversed num : "+res);
    }
}
