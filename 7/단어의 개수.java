package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		try {
			StringTokenizer st =new StringTokenizer(bf.readLine());
			sb.append(st.countTokens());
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}

