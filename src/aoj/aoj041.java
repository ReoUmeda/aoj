package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class aoj041 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int count=1;
		
		ArrayList<Integer> ast1 = new ArrayList<Integer>();
		int ast;
		int ast2 = 0;
		int tmper;
		
		boolean flagr = false;
		
		String kaibun;
		
		//System.out.println(getsosuu(2));
		for(int i=2;i<=50000;i++){
			if(getsosuu(i)){
				ast1.add(i);
			}
		}
		
		ast = ast1.size();
		ast2 = ast;
		
		while(true){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			if(tmp == null){
				break;
			}
			if(tmp.equals("0")){
				break;
			}
			
			tmper = Integer.parseInt(tmp);
			count = 0;
			
//			if(tmper%2 == 1){
//				for(int i=0;i<ast;i++){
//					if(ast1.get(i) + 2 == tmper){
//						count++;
//					}
//					if(ast1.get(i) - 2 == tmper){
//						count++;
//					}
//				}
//				
//				System.out.println(count);
//				continue;
//			}
			
			for(int i=0;i<ast;i++){
				if(tmper <= ast1.get(i)){
					
				}
			}
			int j=ast2-1;
			loop:
			for(int i=0;i<ast2;i++){
				for(;j>=0;j--){
					if(ast1.get(i)+ast1.get(j) == tmper){
						count++;
					} else if (ast1.get(i)+ast1.get(j) < tmper) {
						continue loop;
					}
					if(i == j){
						break loop;
					}
				}
			}
			
			System.out.println(count);
			
		}
		
	}public static boolean getsosuu(int name) {
		boolean ret = true;
	    for(int i=2;i<name;i++){
	    	if(name%i == 0){
	    		ret = false;
	    		break;
	    	}
	    }
	    return ret;
	}
}