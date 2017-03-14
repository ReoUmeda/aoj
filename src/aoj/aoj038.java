package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class aoj038 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int counta=0;
		int max = 0;
		int min = Integer.MAX_VALUE;
		int tmpp = Integer.MAX_VALUE;
		
		ArrayList<Integer> ast1 = new ArrayList<Integer>();
		ArrayList<String> ast = new ArrayList<String>();
		
		
		String[] sprite;
		
		
		double tmp1,tmp2;
		int[] kazutmp = new int[9];
		int[] kazu = new int[9];
		int[] kazu2 = new int[9];
		boolean flag;
		
		
		int tmper;
		
		boolean flagr = false;
		
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
			if(tmp.equals("")){
				break;
			}
			
			
			for(int i=0;i<13;i++){
				
				tmper = Integer.parseInt(String.valueOf(tmp.charAt(i)));
				kazutmp[tmper-1]++;
			}
			
			for(int i=0;i<9;i++){
				
				kazu = kazutmp.clone();
				
				kazu[i]++;
				
				
				if(kazu[i] > 4){
					continue;
				}
				
				for(int j=0;j<9;j++){
					kazu2 = kazu.clone();
					if(kazu2[j] == 0){
						
					}else if(kazu2[j] == 1){
						if(kazu2[j+1] >= 1 && kazu2[j+2] >= 1){
							kazu2[j]--;
							kazu2[j+1]--;
							kazu2[j+2]--;
						}
					}else if(kazu2[j] == 2){
						kazu2[j] = kazu2[j] - 2;
					}else if(kazu2[j] == 3){
						kazu2[j] = kazu2[j] - 3;
					}else if(kazu2[j] == 4){
						if(kazu2[j+1] >= 1 && kazu2[j+2] >= 1){
							kazu2[j]--;
							kazu2[j+1]--;
							kazu2[j+2]--;
						}
						kazu2[j] = kazu2[j] - 3;
					}
				}
				int ttt = 0;
						for(int j=0;j<9;j++){
							ttt += kazu2[j];
						}
						
						if(ttt == 0){
							System.out.println(i+" ");
						}
				
				
			}

			
			
			
		}
		
	}
}