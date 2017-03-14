package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class aoj010 {
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;


		ArrayList<Double> al = new ArrayList<Double>();
		ArrayList<Double> al2 = new ArrayList<Double>();
		ArrayList<Double> al3 = new ArrayList<Double>();
		ArrayList<Double> al4 = new ArrayList<Double>();
		ArrayList<Double> al5 = new ArrayList<Double>();
		ArrayList<Double> al6 = new ArrayList<Double>();
		ArrayList<Double> al7 = new ArrayList<Double>();
		ArrayList<Double> al8 = new ArrayList<Double>();

		while(true){
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			if(tes == null){
				break;
			}
			if(tes.equals("")){
				break;
			}
			try{
				String[] fruit = tes.split(",", 0);
				al.add(Double.parseDouble(fruit[0]));
				al2.add(Double.parseDouble(fruit[1]));
				al3.add(Double.parseDouble(fruit[2]));
				al4.add(Double.parseDouble(fruit[3]));
				al5.add(Double.parseDouble(fruit[4]));
				al6.add(Double.parseDouble(fruit[5]));
				al7.add(Double.parseDouble(fruit[6]));
				al8.add(Double.parseDouble(fruit[7]));
			}catch(NumberFormatException e){
				break;
			}
		}
		
		double a = 0d;
		double b = 0d;
		
		for(int i=0;i<al.size();i++){
			a = (al.get(i) - al3.get(i))*(al.get(i) - al3.get(i)) + (al2.get(i) - al4.get(i))*(al2.get(i) - al4.get(i));
			b = (al.get(i) - al5.get(i))*(al.get(i) - al5.get(i)) + (al2.get(i) - al6.get(i))*(al2.get(i) - al6.get(i));
			
			
			
			
			
		
		}
		
		
		
	}

}
