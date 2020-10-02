package recursionget;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BoardPath(0,10) );

	}
	public static ArrayList<String> BoardPath(int curr, int end){
		if(curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if(curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		for(int i=1;i<=6;i++) {
			ArrayList<String> rr =	BoardPath(curr+i,end);
			
			for(String rrs:rr) {
				mr.add(i+rrs);
			}
			
		}
		return mr;
		
	}

}
