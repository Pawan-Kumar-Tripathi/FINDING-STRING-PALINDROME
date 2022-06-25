import java.io.*;
import java.util.*;
class palindrome_string
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int i ;
    String rev = "";
      
        for(i = st.length()-1;i>=0;i--)
        {
             rev = rev +st.charAt(i);
        }
        System.out.println(rev);
        System.out.println(" ");
        
        boolean bo = st.equals(rev);
        
         
          
        if(bo == true)
        {
            System.out.println("palindrome");
            
    }
    else 
    System.out.println("not palindrome");
}
}