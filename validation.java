import java.util.*;
public class validation{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the username : ");
        String username1=s.nextLine();
        int len1=username1.length();
        String rev1="";
        System.out.print("Re-Enter the username : ");
        String username2=s.nextLine();
        int len2=username2.length();
        String rev2="";
        for(int i=0;i<=len1-1;i++)
        {
           // rev1=username1.charAt(i);
            for(int j=1;j<len2-1;j++)
            {
                if(username1.charAt(i)==username2.charAt(j))
                    System.out.print("Both the usernames are same");
                else
                    System.out.print("Both are not same");
                    
            }
                
         }
       
            
    
    }
}
