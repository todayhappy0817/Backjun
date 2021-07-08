import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int i;
		int Max=0,Min=0;
		try {
			int num =Integer.parseInt(bf.readLine()); //횟수
			int[] number =new int[num];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(i=0; i<num; i++) {
				number[i] = Integer.parseInt(st.nextToken());
			}
			Max=number[0];
			Min=number[0];
			for(i=0; i<num; i++) {
				if(Max<number[i]) {
					Max=number[i];
				}
				
				if(Min>number[i]) {
					Min=number[i];
				}
			}			
			sb.append(Min+" ");
			sb.append(Max);
			System.out.println(sb);
			bf.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
