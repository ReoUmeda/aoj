package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class aoj05 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		char c = 0;
		int a=0,b=0;


		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

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
				String[] fruit = tes.split(" ", 0);
				a = Integer.parseInt(fruit[0]);
				b = Integer.parseInt(fruit[1]);
				if(a == 0 && b == 0){
					break;
				}
				al.add(a);
				al2.add(b);
			}catch(NumberFormatException e){
				break;
			}

			
			//al.add(a);
		}
		
		for(int r=0;r<al2.size();r++){
			ArrayList<Integer> al3 = new ArrayList<Integer>();
			for(int i=1;i<=al.get(r);i++){
				al3.add(i);
			}
			int point =al2.get(r)-1;
			al3.remove(point);
			
			while(true){
				if(al3.size() == point){
					point = 0;
				}
				if(al3.size() == 1){
					break;
				}
				for(int i=0;i<al2.get(r)-1;i++){
					point++;
					if(al3.size() == point){
						point = 0;
					}
					//System.out.println(point + "  :"+al3.size());
				}
				
				al3.remove(point);
			}
			System.out.println(al3.get(0));
//			boolean e = true;
//			int[] al3 = new int[al.get(r)];
//			int point = 0;
//			int cp = 0;
//			int po = 0;
//			int ps = 0;
//			int max = al.get(r);
//			for(int i=0;i<al.get(r);i++){
//				al3[i] = i+1;
//			}
//			while(e){
//				
//				for(int i=1;i<al2.get(r);i++){
//					if(al3[i] == 0){
//						po++;
//					}else{
//						point++;
//					}
//					point = point % 30;
//				}
//				al3[point] = 0;
//				
//				int ppp = 0;
//				for(int i=0;i>al.get(r);i++){
//					if(al3[i] != 0){
//						ppp += 1;
//						cp = i;
//					}
//				}
//				if(ppp == 1){
//					e = false;
//				}
//			}
//			System.out.println(al3[cp]);
//			System.out.println("aaaaa");
			
			
			
		}
		
		
	}

}