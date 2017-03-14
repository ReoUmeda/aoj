package aoj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Copy_2_of_aoj09 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;

		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		File file = new File("ifif.txt");
		PrintWriter pw =null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		/*try {
			tes = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		int a,b;
		int[] r = {0,0};
		String[] fruit = tes.split(" ", 0);
		a = Integer.parseInt(fruit[0]);
		al.add(a);
		b = Integer.parseInt(fruit[1]);
		al2.add(b);
		if(a == 0 && b == 0){
			return;
		}
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

			try{
				fruit = tes.split(" ", 0);
				a = Integer.parseInt(fruit[0]);
				b = Integer.parseInt(fruit[1]);
				if(a == 0 && b == 0){
					break;
				}
				fruit = tes.split(" ", 0);
				al.add(a);
				al2.add(b);
				
			}catch(NumberFormatException e){
				break;
			}
		}*/
		
		
		for(int i=1;i<=9;i++){
			for(int j=0;j<=1000;j++){
				al.add(i);
				al2.add(j);
			}
		}
		
		boolean f = false;
		

		int[] total = new int[1];
		
		for(int i=0;i<al.size();i++){
			f = false;
			total[0] = 0;
			if(al.get(i) == 9 && al2.get(i) > 864){
				//System.out.println("0");
				f=true;
			}else if(al.get(i) == 8 && al2.get(i) > 774){
				//System.out.println("0");
				f=true;
			}else if(al.get(i) == 7 && al2.get(i) > 679){
				///System.out.println("0");
				f=true;
			}else if(al.get(i) == 6 && al2.get(i) > 585){
				//System.out.println("0");
				f=true;
			}else if(al.get(i) == 5 && al2.get(i) > 490){
				//System.out.println("0");
				f=true;
			}else if(al.get(i) == 4 && al2.get(i) > 394){
				//System.out.println("0");
				f=true;
			}else if(al.get(i) == 3 && al2.get(i) > 297){
				//System.out.println("0");
				f=true;
			}else if(al.get(i) == 2 && al2.get(i) > 199){
				//System.out.println("0");
				f=true;
			}else if(al.get(i) == 1 && al2.get(i) > 100){
				//System.out.println("0");
				f=true;
			}

			if(!f){
				saiki(total,0,al.get(i)-1,al2.get(i),0);
			}
			//System.out.println(al.get(i)+","+al2.get(i)+","+total[0]);
			pw.println("else if(al.get(i) == "+al.get(i)+" && al2.get(i) == "+al2.get(i)+"){\nSystem.out.println("+total[0]+");\n}");
			
			System.out.println(i);
			
			
		}
		pw.close();


	}
	public static void saiki(int[] total,int tmpgo,int kaisuu,int mokuhyou,int genkai){
		if(mokuhyou < tmpgo){
			return;
		}
		/*if(kaisuu == 8 && mokuhyou > 864){
			return;
		}else if(kaisuu == 7 && mokuhyou > 774){
			return;
		}else if(kaisuu == 6 && mokuhyou > 679){
			return;
		}else if(kaisuu == 5 && mokuhyou > 585){
			return;
		}else if(kaisuu == 4 && mokuhyou > 490){
			return;
		}else if(kaisuu == 3 && mokuhyou > 394){
			return;
		}else if(kaisuu == 2 && mokuhyou > 297){
			return;
		}else if(kaisuu == 1 && mokuhyou > 199){
			return;
		}else if(kaisuu == 0 && mokuhyou > 100){
			return;
		}*/
		
		if(kaisuu == 0){
			for(int i=genkai;i<=100;i++){
				if(mokuhyou == (tmpgo+i)){
					total[0]++;
				}else if(mokuhyou <= (tmpgo+i)){
					return;
				}
			}
			return;
		}
		
		for(int i=genkai;i<100;i++){
			if(mokuhyou <= tmpgo){
				return;
			}
			saiki(total,tmpgo+i,kaisuu-1,mokuhyou,i+1);
		}
	}
}