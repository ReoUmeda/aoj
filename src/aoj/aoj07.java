package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//没
public class aoj07 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		
		try {
			tes = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
		double r,px,py;
		double xk,yk;
		
		double mb = Double.MAX_VALUE,mc=Double.MAX_VALUE;
		
		int a =Integer.parseInt(tes);
		double[] c ={0d,0d,0d,0d,0d,0d};
		String[] fruit;
		for(int i=0;i<a;i++){
			mb = Double.MAX_VALUE;
			mc = Double.MAX_VALUE;
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
			
			
		}

		

	}

}