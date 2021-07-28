
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		String str;
		int i=0,count=0;
		try {
			str=bf.readLine();
			while(i<str.length()){
				if( i+2<=str.length() && (str.charAt(i)=='c' || str.charAt(i)=='s' || str.charAt(i)=='z') && str.charAt(i+1)=='=') { // c=, s=, z=
					i++;
				}
				else if(i+2<=str.length() && (str.charAt(i)=='c' || str.charAt(i)=='d' ) && str.charAt(i+1)=='-'){ //c-,d-
					i++;
				}
				else if(i+2<=str.length() && (str.charAt(i)=='l' || str.charAt(i)=='n' ) && str.charAt(i+1)=='j') { // lj, nj
					i++;
				}
				else if(i+3<=str.length() && str.charAt(i)=='d' && str.charAt(i+1)=='z' && str.charAt(i+2)=='=') {
					i+=2;
				}
				count++;
				i++;
			}
			sb.append(count);
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}
