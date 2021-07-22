
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String str;
		int Max = 0;
		int num = 0 ;
		int[] abc= new int[26];
		try {
			str =bf.readLine();
			for(int i=0;i<str.length();i++) {
				
				if(str.charAt(i)-'a'<0) {
					abc[str.charAt(i)-'A']++;
				}
				else {
					abc[str.charAt(i)-'a']++;	
				}
			}
			for(int i=0;i<26;i++) { //내일 생각
				if(abc[i]>Max) {
					Max=abc[i];
					
					num=(char)i+65;
				}
				else if(abc[i]==Max && Max !=0){
					num='?';
				}
			}
			
				
			sb.append((char)num);
			
			
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}

