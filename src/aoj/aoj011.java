package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aoj011 {
	public static void main(String args[]){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null,tmp = "";
		int tmpa,i,s=0,t;
		
		while(true){
			try {
				System.out.println("a");
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			tmpa = Integer.parseInt(tes);
			if(tmpa == 0){
				break;
			}
			char[][] tmpca = new char[tmpa+1][tmpa+1];
			
			for(i=0;i<tmpa;i++){
				try {
					tes = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				tmp += tes;
				tmpca[i] = tes.toCharArray();
			}
			
			for(i=0;i<(tmpca.length-1);i++){
				for(int j=0;j<(tmpca[i].length-1);j++){
					
					if(tmpca[i][j] == '.'){
						t = saiki(tmpca,i,j,2);
						if(t > s){
							s = t;
						}

						//tmpca[i][j] = '0';
					}
					
				}
			}
			s--;
			System.out.println(s);
			
		}
		System.exit(0);
		
	}
	
	public static int saiki(char[][] s,int i,int j,int ss){
		int ret = ss;
		boolean tf = true;
		int ssl = ss+i;
		int ssa = ss+j;
		
		if(s.length <= ssl){
			return ss;
		}
		
		for(int a=i;a<ssl;a++){
			for(int b=j;b<ssa;b++){
				if(s[a][b] != '.'){
					tf = false;
					a = ss+1;
					b = ssa+1;
				}
			}
		}
		
		
		if(tf){
			ret = saiki(s,i,j,ss+1);
		}
		
		
		
		return ret;
		
	}

}

