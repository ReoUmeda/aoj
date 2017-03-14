package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class aoj033 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int i = 0;
		int counta=0;
		int max = 0;
		int min = Integer.MAX_VALUE;
		int tmpp = Integer.MAX_VALUE;
		
		ArrayList<Integer> ast1 = new ArrayList<Integer>();
		ArrayList<Integer> ast2 = new ArrayList<Integer>();
		
		try {
			tmp = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		String[] sprite = tmp.split(" ");
		
		counta = Integer.parseInt(sprite[0]);
		
		int[] sanka = new int[counta];
		
		int countb = Integer.parseInt(sprite[1]);
		
		int tmp1,tmp2;
		
		for(i=0;i<countb;i++){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			sprite = tmp.split(" ");
			tmp1 = Integer.parseInt(sprite[0]) - 1;
			tmp2 = Integer.parseInt(sprite[1]);
//			sanka[tmp1] += tmp2;
			
			max = 0;
			min = Integer.MAX_VALUE;
			tmpp = Integer.MAX_VALUE;
			
			if(i==0){
				for(int j=0;j<counta;j++){
					ast1.add(j);
					if(tmp1 == j){
						ast2.add(tmp2);
					}
					else{
						ast2.add(0);
					}
				}
			}
			else{
				for(int j=0;j<counta;j++){
					if(tmp1 == ast1.get(j)){
						tmp1 = j;
						break;
					}
				}
				ast2.set(tmp1, ast2.get(tmp1)+tmp2);
			}
			
			int tmpr = 0,tmpe = 0;
			for(int j=0;j<counta;j++){
				if(ast2.get(tmp1) == ast2.get(j) && ast1.get(tmp1) < ast1.get(j)){
					for(int k=j;k<tmp1;k++){
						tmpr = ast1.get(k+1);
						ast1.set(k+1, ast1.get(k));
						tmpe = ast2.get(k+1);
						ast2.set(k+1, ast2.get(k));
					}
					ast1.set(j, tmpr);
					ast2.set(j, tmpe);
					
				}
				else if(ast2.get(tmp1) < ast2.get(j)){
					for(int k=j;k<tmp1;k++){
						tmpr = ast1.get(k+1);
						ast1.set(k+1, ast1.get(k));
						tmpe = ast2.get(k+1);
						ast2.set(k+1, ast2.get(k));
					}
					ast1.set(j, tmpr);
					ast2.set(j, tmpe);
				}
			}
			
			
//			for(int j=0;j<counta;j++){
//				if(max <= sanka[j]){
//					if(tmpp == sanka[j]){
//						if(min > j){
//							max = sanka[j];
//							min = j;
//							tmpp = sanka[j];
//						}
//					}
//					else{
//						max = sanka[j];
//						min = j;
//						tmpp = sanka[j];
//					}
//					
//				}
//			}
			
			System.out.println(ast1.get(0)+1+" "+ast2.get(0));
		}
		
	}
}
