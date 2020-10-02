package recursionget;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     System.out.println(getPerm("abc"));
	}
    
	public static ArrayList<String> getPerm(String str){
		
		if(str.length()==0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr =	getPerm(ros);
		ArrayList<String> mr = new ArrayList<>();
		for(String rrs:rr) {
			for(int i=0;i<=rrs.length();i++) {
				String val = rrs.substring(0,i)+ ch + rrs.substring(i);// insert char in a string
				mr.add(val);
			}
				
		}
		return mr;
		
	}
}
