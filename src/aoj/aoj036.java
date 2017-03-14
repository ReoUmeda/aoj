package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class aoj036 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int i = 0;
		int counta=0;
		int max = 0;
		int min = Integer.MAX_VALUE;
		int tmpp = Integer.MAX_VALUE;
		
		ArrayList<Integer> ast1 = new ArrayList<Integer>();
		ArrayList<String> ast = new ArrayList<String>();
		
		
		String[] sprite;
		
		
		double tmp1,tmp2;
		double[] tmper = new double[8];
		boolean flag;
		
		double tmpkata=0,tmpx,tmpy;
		double tmpkata2=0,tmpx2,tmpy2;
		int uuuuu;
		int ban =0;
		int yokosen,bangou,atari,dansuu;
		int yokosen2,bangou2,atari2,dansuu2;
		
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
			
			
			yokosen = Integer.parseInt(tmp);
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			bangou = Integer.parseInt(tmp);
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			atari = Integer.parseInt(tmp);

			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			dansuu = Integer.parseInt(tmp);
			int[][] arr = new int[dansuu][yokosen];
			int s;
			
			for(int k=0;k<dansuu;k++){
				s = 0;
				try {
					tmp = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				for(int r=0;r<yokosen;r++){
					System.out.println(r);
					arr[k][s] = tmp.charAt(s);
					s++;
					
				}
			}
			
			
			
			bangou2 = bangou;
			for(int k=0;k<dansuu;k++){
				if(bangou2 == 1){
					if(arr[k][0] == 1){
						bangou2++;
					}
				}else if(bangou2 == yokosen){
					if(arr[k][yokosen -1] == 1){
						bangou2--;
					}
				}
				else{
					if(arr[k][bangou2-1] == 1){
						bangou2++;
					}else if(arr[k][bangou2-1-1] == 1){
						bangou2--;
					}
				}
			}
			
			
			System.out.println(bangou2);
			
			
			
			
			
			
			
		}
		
	}
}
