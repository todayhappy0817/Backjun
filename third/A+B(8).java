package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int a;
		int b;
			try {
				int count = Integer.parseInt(br.readLine());
				for(int i=1; i<=count; i++) {
					StringTokenizer str = new StringTokenizer(br.readLine(), " ");
					a=Integer.parseInt(str.nextToken());
					b=Integer.parseInt(str.nextToken());
					sb.append("Case #"+i+": ").append(a).append(" + ").append(b).append(" = ").append(a+b+"\n");
				}
				System.out.println(sb);
				br.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	
}
