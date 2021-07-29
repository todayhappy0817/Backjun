package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		String str;
		ArrayList<Character> list= new ArrayList<Character>();
		int i,count=0,num;
		
		try {
			count=num=Integer.parseInt(bf.readLine());
			for(i=0;i<num;i++) {
				str=bf.readLine();
				for(int j=0;j<str.length();j++) {
					
					if(list.contains(str.charAt(j))==false) {
						if(j+1<str.length() && str.charAt(j) !=str.charAt(j+1)) { //같지 않은 경우
							list.add(str.charAt(j));
						}						
					}
					else {
						count--;
						break;
					}
				}
				list.clear();
			}
			
			sb.append(count);
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}
