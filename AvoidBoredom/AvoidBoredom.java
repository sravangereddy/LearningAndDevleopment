import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class AvoidBoredom {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		String line;
		DifferenceCalculator[] dc=new DifferenceCalculator[100];
		
		for(int i=0;i<noOfTestCases;i++){
			dc[i]=new DifferenceCalculator();
			line=br.readLine();
			dc[i].noOfSubjs= Integer.parseInt(line.split(" ")[0]);			 
			dc[i].noOfSubjPDay= Integer.parseInt(line.split(" ")[1]);			 
			line=br.readLine();
			
			for(int j=0;j<dc[i].noOfSubjs;j++)
				dc[i].inputValues[j]= Integer.parseInt(line.split(" ")[j]);		
			/*for(int j=0;j<dc[i].noOfSubjs;j++)
				System.out.println(dc[i].inputValues[j]);*/
		}
		for(int i=0;i<noOfTestCases;i++){
			dc[i].sort();
			System.out.println(dc[i].calucluateMaxDifference());
		}
		
	}
}
class DifferenceCalculator{	
	int noOfSubjs,noOfSubjPDay;
	int[] inputValues=new int[100];
	int[] maxSumOrderArray=new int[100];
	int length;
	public void sort(){
		sortElements(0, noOfSubjs - 1);
		/*for(int j=0;j<noOfSubjs;j++)
			System.out.println(inputValues[j]);*/
		
	}
	public long calucluateMaxDifference(){
		long maxDifference=inputValues[noOfSubjs-1];
		//maxSumOrderArray[0] = inputValues[0];
		int i=0,j=noOfSubjs-1,k=1;
		int jflag=0,iflag=0;
		for(k=2;k<=noOfSubjPDay;k++){
			iflag++;
			jflag++;
			System.out.println("Entered");
			//System.out.println(inputValues[j]+" "+inputValues[i]);
			maxDifference=maxDifference+(inputValues[j]-inputValues[i]);
			if(((i==0 ) && (iflag==1))||(iflag==2)){
				i++;
				iflag=0;
			}
			if(jflag==2){
				j--;
				jflag=0;
			}
				
			//maxSumOrderArray[k++]=inputValues[i];
			
		}
		/*for(j=0;j<noOfSubjPDay;j++)
			System.out.println(maxSumOrderArray[j]);*/
		/*for(i=0;i<noOfSubjPDay-1;i++){
			if(maxSumOrderArray[i]>maxSumOrderArray[i+1]){
				maxDifference=maxDifference+(maxSumOrderArray[i]-maxSumOrderArray[i+1]);
			}
			else{
				maxDifference=maxDifference+(maxSumOrderArray[i+1]-maxSumOrderArray[i]);
			}
				 
		}*/
		return maxDifference;
	}
	private void swapValues(int i, int j) {
		int temp = inputValues[i];
		inputValues[i] = inputValues[j];
		inputValues[j] = temp;
	}
	private void sortElements(int low, int high) {
		
		int i = low;
		int j = high;
		int pivot = inputValues[low+(high-low)/2];
		while (i <= j){
			while (inputValues[i] < pivot) {
				i++;
			}
			while (inputValues[j] > pivot) {

				j--;
			}
			if (i <= j) {
				swapValues(i, j);
				i++;
				j--;
			}
		}
		if (low < j)
			sortElements(low, j);
		if (i < high)
			sortElements(i, high);
	}
}