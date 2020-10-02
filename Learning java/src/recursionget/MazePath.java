package recursionget;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(getMazePath(0,0,2,2));
       System.out.println("hi");
	}
	public static ArrayList<String> getMazePath(int cr , int cc , int er, int ec){
		if(cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}
		
		if(cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = getMazePath(cr,cc+1,er,ec);
		for(String rrsh : rrh) {
			mr.add("H"+rrsh);
		}
		ArrayList<String> rrv = getMazePath(cr+1,cc,er,ec);
		for(String rrsv : rrv) {
			
			mr.add("V"+rrsv);
		}
		ArrayList<String> rrd = getMazePath(cr+1,cc+1,er,ec);
		for(String rrsd : rrd) {
			mr.add("D"+rrsd);
		}
		
		System.out.println("hi");
		return mr;
	}

}
