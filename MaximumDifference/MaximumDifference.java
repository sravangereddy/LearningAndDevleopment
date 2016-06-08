import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class MaximumDifference {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfValues = Integer.parseInt(br.readLine());
		String line;
		int[] values=new int[100000];
		line=br.readLine();
		for(int i=0;i<noOfValues;i++){
			//System.out.println(line.split(" ")[0]);
			values[i]= Integer.parseInt(line.split(" ")[i]);			 
		}
		DifferenceCalculator dc =  new DifferenceCalculator();
		dc.sort(values,noOfValues);
		System.out.println(dc.calucluateMaxDifference(noOfValues));
		
	}
}
class DifferenceCalculator{	
	int valuesCopy[];
	int[] maxSumOrderArray=new int[100000];
	int length;
	public void sort(int[] inputValues,int noOfValues){
		this.valuesCopy = inputValues;
		length = noOfValues;
		//System.out.println(length);
		sortElements(0, length - 1);
		/*for(int i=0;i<length;i++){
			System.out.print(valuesCopy[i]+" ");
				 
		}*/
	}
	public long calucluateMaxDifference(int noOfValues){
		long maxDifference=0;
		maxSumOrderArray[0] = valuesCopy[0];
		//System.out.println();
		int i=1,j=1,k=1;
		/*for(i=0;i<length;i++){
			System.out.print(valuesCopy[i]+" ");
				 
		}*/
		for(i=1,j=noOfValues-1,k=1;k<noOfValues;i++,j--){
			//System.out.print("j="+j+" "+valuesCopy[j]+" i="+i+" "+valuesCopy[i]+"\n");
			maxSumOrderArray[k++]=valuesCopy[j];
			maxSumOrderArray[k++]=valuesCopy[i];
			//System.out.print("k="+k+" "+maxSumOrderArray[k]);
			
		}
		for(i=0;i<noOfValues-1;i++){
			//System.out.print(maxSumOrderArray[i]+" ");
			//System.out.println(maxSumOrderArray[i+1]+" ");
			if(maxSumOrderArray[i]>maxSumOrderArray[i+1]){
				maxDifference=maxDifference+(maxSumOrderArray[i]-maxSumOrderArray[i+1]);
			}
			else{
				maxDifference=maxDifference+(maxSumOrderArray[i+1]-maxSumOrderArray[i]);
			}
				 
		}
		return maxDifference;
	}
	private void swapValues(int i, int j) {
		int temp = valuesCopy[i];
		valuesCopy[i] = valuesCopy[j];
		valuesCopy[j] = temp;
	}
	private void sortElements(int low, int high) {
		
		int i = low;
		int j = high;
		int pivot = valuesCopy[low+(high-low)/2];
		while (i <= j){
			while (valuesCopy[i] < pivot) {
				//System.out.print(i +" "+valuesCopy[i]);
				i++;
			}
			while (valuesCopy[j] > pivot) {
				//System.out.print(j +" "+valuesCopy[i]);
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