package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int count, Max,i,sc;
		try {
			StringTokenizer str= new StringTokenizer(br.readLine(), " ");
			count = Integer.parseInt(str.nextToken());
			Max = Integer.parseInt(str.nextToken());
			str= new StringTokenizer(br.readLine(), " ");
			for(i=0; i<count; i++) {
				sc=Integer.parseInt(str.nextToken());
				if(Max >  sc) {
					sb.append(sc+" ");
				}
			}
			br.close();
			System.out.println(sb);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
