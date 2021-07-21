import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
	
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int count,i,count1;
		String str;
		try {
			count =Integer.parseInt(bf.readLine());
			for(i=0;i<count;i++) {
				StringTokenizer st=new StringTokenizer(bf.readLine());
				count1=Integer.parseInt(st.nextToken());
				str=st.nextToken();
				for(int j=0;j<str.length();j++) {
					for(int k=0;k<count1;k++) {
						sb.append(str.charAt(j));
					}
				}
				sb.append("\n");
			}
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}
