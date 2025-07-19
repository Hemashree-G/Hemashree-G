package in.HemashreeG;

import java.util.HashMap;
import java.util.Map;

public class Problem_4 {

	public static void main(String[] args) {
		int a[]= {1,2,8,9,12,46,76,82,15,20,30};
		int b[]= {1,2,3,4,5,6,7,8,9};
		Map<Integer,Integer> res=new HashMap<>();
		for(int c:b) {
			res.put(c, 0);
		}
		for(int num:a) {
			for(int c:b) {
				if(num%c==0) {
					res.put(c, res.get(c)+1);
				}
			}
		}
		System.out.println("output");
		for(int c:b) {
			System.out.println(c+":"+res.get(c));
		}


	}

}
