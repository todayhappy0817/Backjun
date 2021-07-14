import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        int i,count,j,avg=0;
        double per=0;
        int fir;
        StringTokenizer str;
        int [] num;
        try {

            fir=Integer.parseInt(bf.readLine());
            for(i=0;i<fir;i++) {
                str =new StringTokenizer(bf.readLine());

                count=Integer.parseInt(str.nextToken());
                num=new int[count];
                for(j=0;j<count;j++) {
                    num[j]=Integer.parseInt(str.nextToken());
                    avg+=num[j];
                }
                avg=avg/count;
                for(j=0;j<count;j++) {
                    if(num[j]>avg)
                        per++;
                }
                sb.append(String.format("%.3f", per/count*100)+"%\n");
                per=0;
                avg=0;
            }
            System.out.println(sb);
        }
        catch(IOException e) {

        }
    }
}
