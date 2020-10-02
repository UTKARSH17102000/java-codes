package bitmanipulation;

public class FindMissingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int arr [] = {1,3,4,6 };
		int z=0;
		for(int i=0;i<arr.length;i++) {
			z=z^arr[i];
		}
		for(int i=1;i<= n;i++) {
			z=z^i;		}

		int set_bit= z&~(z-1);
		int grp1=0;
		int grp2 =0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]&set_bit)==set_bit) {
				grp1=grp1^arr[i];
			}else {
				grp2=grp2^arr[i];
			}
		}
		
		for(int i=1;i<=n;i++) {
			if((i&set_bit)==0) {
				grp1=grp1^i;
			}else {
				grp2=grp2^i;
			}
		}
		System.out.println(grp1);
		System.out.println(grp2);
	}

}
