package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aoj016 {
	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int cup = 0;
		String[] rrr;
		int st = 0,sr = 0;
		int mon = 0;
		int[] m = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		
		while(true){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			rrr = tmp.split(" ");
			
			st = Integer.parseInt(rrr[0]);
			sr = Integer.parseInt(rrr[1]);
			if(st == 0 && sr == 0){
				break;
			}
			
			for(int i=0;i<st;i++){
				if(i == (st-1)){
					for(int j=0;j<sr;j++){
						mon++;
						mon = mon%7;
					}
				}else{
					for(int j=0;j<m[i];j++){
						mon++;
						mon = mon%7;
					}
				}

			}
			
			if(mon == 0){
				System.out.println("Thursday");
			}else if(mon == 1){
				System.out.println("Friday");
			}else if(mon == 2){
				System.out.println("Saturday");
			}else if(mon == 3){
				System.out.println("Sunday");
			}else if(mon == 4){
				System.out.println("Monday");
			}else if(mon == 5){
				System.out.println("Tuesday");
			}else if(mon == 6){
				System.out.println("Wednesday");
			}
			
		}
	}

}
