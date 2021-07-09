package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int i;
		int sum=1;
		int[] number = new int[10]; 
		try {
			for(i=0;i<3;i++)
				sum *=Integer.parseInt(bf.readLine());
			
			for(i=0; i<String.valueOf(sum).length(); i++){
				
				number[String.valueOf(sum).charAt(i)-'0']+=1;
			}
			for(i=0; i<10;i++)
				sb.append(number[i]+"\n");
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}
