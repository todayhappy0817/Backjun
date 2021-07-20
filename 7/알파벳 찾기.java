import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int[] abc = new int[26];
		int i;
		for(i=0;i<26;i++)
			abc[i]=-1;
		String str;
		try {
			str=bf.readLine();
			for(i=0;i<str.length();i++) {
				if(abc[str.charAt(i)-'a']==-1)
						abc[str.charAt(i)-'a']=i;
			}
			for(i=0;i<26;i++)
				sb.append(abc[i]+" ");
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}
