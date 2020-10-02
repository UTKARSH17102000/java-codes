package strings;
import java.util.*;
public class ConvertLtoU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
        String str = s.next();
        char [] x = str.toCharArray();
        int size = str.length();
        int i=0;
        while(i!=size)
        {
            x[i]= (char) (x[i]-32);
            i++;
            
         }
         System.out.println(str);
         System.out.println(x);


	}

}
