package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class aoj039 {
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
		int[] kazu = new int[4];
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
			
			String[] sprit = tmp.split(" ");
			
			kazu[0] = Integer.parseInt(sprit[0]);
			kazu[1] = Integer.parseInt(sprit[1]);
			kazu[2] = Integer.parseInt(sprit[2]);
			kazu[3] = Integer.parseInt(sprit[3]);
			
			int yuzu = 99999;
			
			if((kazu[0]+kazu[1])+(kazu[2]+kazu[3]) == 10){

			}else if((kazu[0]+kazu[1])+(kazu[2]*kazu[3]) == 10){

			}else if((kazu[0]+kazu[1])+(kazu[2]-kazu[3]) == 10){

			}else if((kazu[0]+kazu[1])-(kazu[2]+kazu[3]) == 10){

			}else if((kazu[0]+kazu[1])-(kazu[2]-kazu[3]) == 10){

			}else if((kazu[0]+kazu[1])-(kazu[2]*kazu[3]) == 10){

			}else if((kazu[0]+kazu[1])*(kazu[2]+kazu[3]) == 10){

			}else if((kazu[0]+kazu[1])*(kazu[2]-kazu[3]) == 10){

			}else if((kazu[0]+kazu[1])*(kazu[2]*kazu[3]) == 10){

			}else if((kazu[0]-kazu[1])+(kazu[2]*kazu[3]) == 10){

			}else if((kazu[0]-kazu[1])+(kazu[2]-kazu[3]) == 10){

			}else if((kazu[0]-kazu[1])-(kazu[2]+kazu[3]) == 10){

			}else if((kazu[0]-kazu[1])-(kazu[2]-kazu[3]) == 10){

			}else if((kazu[0]-kazu[1])-(kazu[2]*kazu[3]) == 10){

			}else if((kazu[0]-kazu[1])*(kazu[2]+kazu[3]) == 10){

			}else if((kazu[0]-kazu[1])*(kazu[2]-kazu[3]) == 10){

			}else if((kazu[0]-kazu[1])*(kazu[2]*kazu[3]) == 10){

			}else if((kazu[0]*kazu[1])+(kazu[2]*kazu[3]) == 10){

			}else if((kazu[0]*kazu[1])+(kazu[2]-kazu[3]) == 10){

			}else if((kazu[0]*kazu[1])-(kazu[2]+kazu[3]) == 10){

			}else if((kazu[0]*kazu[1])-(kazu[2]-kazu[3]) == 10){

			}else if((kazu[0]*kazu[1])-(kazu[2]*kazu[3]) == 10){

			}else if((kazu[0]*kazu[1])*(kazu[2]+kazu[3]) == 10){

			}else if((kazu[0]*kazu[1])*(kazu[2]-kazu[3]) == 10){

			}else if((kazu[0]*kazu[1])*(kazu[2]*kazu[3]) == 10){

				
				
				
				
				
			}else if((kazu[0]+(kazu[1]+kazu[2]))+kazu[3] == 10){

			}else if(kazu[0]+kazu[1]+kazu[2]*kazu[3] == 10){

			}else if(kazu[0]+kazu[1]+kazu[2]-kazu[3] == 10){

			}else if(kazu[0]+kazu[1]-kazu[2]+kazu[3] == 10){

			}else if(kazu[0]+kazu[1]-kazu[2]-kazu[3] == 10){

			}else if(kazu[0]+kazu[1]-kazu[2]*kazu[3] == 10){

			}else if(kazu[0]+kazu[1]*kazu[2]+kazu[3] == 10){

			}else if(kazu[0]+kazu[1]*kazu[2]-kazu[3] == 10){

			}else if(kazu[0]+kazu[1]*kazu[2]*kazu[3] == 10){

			}else if(kazu[0]-kazu[1]+kazu[2]*kazu[3] == 10){

			}else if(kazu[0]-kazu[1]+kazu[2]-kazu[3] == 10){

			}else if(kazu[0]-kazu[1]-kazu[2]+kazu[3] == 10){

			}else if(kazu[0]-kazu[1]-kazu[2]-kazu[3] == 10){

			}else if(kazu[0]-kazu[1]-kazu[2]*kazu[3] == 10){

			}else if(kazu[0]-kazu[1]*kazu[2]+kazu[3] == 10){

			}else if(kazu[0]-kazu[1]*kazu[2]-kazu[3] == 10){

			}else if(kazu[0]-kazu[1]*kazu[2]*kazu[3] == 10){

			}else if(kazu[0]*kazu[1]+kazu[2]*kazu[3] == 10){

			}else if(kazu[0]*kazu[1]+kazu[2]-kazu[3] == 10){

			}else if(kazu[0]*kazu[1]-kazu[2]+kazu[3] == 10){

			}else if(kazu[0]*kazu[1]-kazu[2]-kazu[3] == 10){

			}else if(kazu[0]*kazu[1]-kazu[2]*kazu[3] == 10){

			}else if(kazu[0]*kazu[1]*kazu[2]+kazu[3] == 10){

			}else if(kazu[0]*kazu[1]*kazu[2]-kazu[3] == 10){

			}else if(kazu[0]*kazu[1]*kazu[2]*kazu[3] == 10){

			}else{
				System.out.println(0);
			}
			System.out.println(1);
		}
		
	}
}