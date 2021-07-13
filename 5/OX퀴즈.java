package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int i,j,count,ans=0,Strcount = 0;
		
		try {
			count=Integer.parseInt(bf.readLine());
			String[] str= new String[count];
			for(i=0;i<count;i++) {
				str[i]=bf.readLine();//값을 집어 넣음
			}
			
			for(i=0;i<count;i++) {
				for(j=0;j<str[i].length();j++) {
					
					if(str[i].charAt(j) =='X') {
						Strcount=0;	
					}
					else {
						Strcount++;
						ans+=Strcount;
					}
					
				}
				sb.append(ans+"\n");
				ans=0;
				Strcount=0;
			}
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}
