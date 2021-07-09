package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i,Max=0;
		int[] num =new int[9];
		try {
			for(i=0; i<9; i++) {
				num[i]=Integer.parseInt(bf.readLine());	
			}
			Max=0;
			for(i=0; i<9; i++) {
				if(num[i]>num[Max]) {
					Max=i;
				}
			}
			sb.append(num[Max]+"\n").append(Max+1);
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}
