package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class aoj030 {
	public static void main(String[] args){
		BigDecimal one = new BigDecimal("1.00");
		int[] abo = {0,0,0,0};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int cup = 0;
		int mun = 0;
		int ter = 0;
		String[] rrr;
		int st = 0,sr = 0;
		double mon = 0;
		int syo=0,hisi=0;
		double aaaa = 1;
		
		int zixtusi = 0;
		int touri = 0;
		int i = 0;
		
		while(true){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			
			if((zixtusi = Integer.parseInt(tmp)) == 0){
				System.exit(0);
			}
			
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			touri = Integer.parseInt(tmp);
			
			int[][] kankei = new int[touri][zixtusi];
			int[] tekitou = new int[zixtusi];
			
			for(i=0;i<touri;i++){
				try {
					tmp = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				
				String[] sprit = tmp.split(",",0);
				
				for(int j=0;j<sprit.length;j++){
					
				}
				
				touri = Integer.parseInt(tmp);
				
			}
			
			
			
			
//			for(i=0;i<zixtusi;i++){
//				if(tekitou[i] == 0){
//					break;
//				}
//			}
			
			
		}
		
	}

}
