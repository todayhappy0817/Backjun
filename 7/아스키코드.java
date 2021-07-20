import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		try {
			sb.append(bf.readLine().charAt(0)-0);
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}

