
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class XennyAndClassroom {
    public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases=sc.nextInt();
		long[] strength=new long[5];
		String sequence;
		for(int i=0;i<testCases;i++){
			strength[i] = sc.nextLong();
			sequence = br.readLine();
		}
		for(int i=0;i<testCases;i++){
			System.out.println(strength[i]/2);
		}
    }
}
