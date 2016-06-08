import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RodCuttingProblem {
	public static void main(String args[]) throws Exception 
	   {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int noOfTestCases = Integer.parseInt(br.readLine());
		 String line;
		 RodCut[] rc=new RodCut[1000];
		 for(int i=0;i<noOfTestCases;i++){
			rc[i]=new RodCut();
			rc[i].rodLimit= Integer.parseInt(br.readLine());			 
		}
		for(int i=0;i<noOfTestCases;i++)
		{
			System.out.println(rc[i].calcPossibilities());
		}
	   
}
}
class RodCut{
	long rodLimit,possibilities=-1;
	public long calcPossibilities(){
		for(long i=1;i<=rodLimit;i=i*2+1){
			possibilities++;
				//System.out.println(i+""+possibilities);
		}
		return possibilities;
	}
	
}