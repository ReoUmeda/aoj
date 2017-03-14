package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyOfaoj07 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		double[] pp = new double[180];
		double[] pe = new double[180];
		
		try {
			tes = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		for(int i=0;i<180;i++){
			pp[i] = Math.tan((double)i/180d*Math.PI);
			pe[i] = Math.sin((double)i/180d*Math.PI);
		}
		
		
		double r,px,py;
		double xk,yk;
		
		double mb = Double.MAX_VALUE,mc=Double.MAX_VALUE;
		
		int a =Integer.parseInt(tes);
		double[] c ={0d,0d,0d,0d,0d,0d};
		String[] fruit;
		for(int i=0;i<a;i++){
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			fruit = tes.split(" ", 0);
			
			for(int j=0;j<fruit.length;j++){
				c[j] = Double.parseDouble(fruit[j]);
			}
			
			for(int j=0;j<180;j++){
				for(int k=0;k<10000;k++){
					xk = (double)k+c[0];
					yk = (double)k*pp[j]+c[1];
					mb = (c[2] - xk)*(c[2] - xk)  + 
							(c[3] - yk)*(c[3] - yk);
					
					
				}
				
			}
			
			
		}

		

	}

}