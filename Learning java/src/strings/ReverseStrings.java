package strings;

public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		
        char[] x = str.toCharArray(); 
        int size = x.length;
        char [] y = new char [x.length];
        int j=0;
        while(j!=size)
        { 
           y[size-1-j]=x[j];
           ++j;
        }
       System.out.println(y);
	}

}