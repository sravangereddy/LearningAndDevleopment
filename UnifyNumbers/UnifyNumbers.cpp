#include <iostream>
#include <cstring>
class UnifyNumbers
{
	private:
	int noOfValues,values[100000],i,sum=0,average,absSum=0;
	public:
	void getValues( )
	{
		std::cin >>noOfValues;
		for(i=0;i<noOfValues;i++){
			std::cin>>values[i];
		}
	}
	void printValues( )
	{
		std::cout << absSum;
	}
	void calcBestInt()
	{
		int i=1,j=0;
		for(i=0;i<noOfValues;i++){
			sum=sum+values[i];
		}
		average=sum/noOfValues;
		calcAbsSum();
		
	}
	void calcAbsSum()
	{
		int i=1,j=0;
		for(i=0;i<noOfValues;i++){
			if(values[i]>average){
				absSum=absSum+(values[i]-average);
			}
			else{
				absSum=absSum+(average-values[i]);
			}
		}		
	}
	
};
int main()
{
	UnifyNumbers un[10];
	int noOfTestCases,i;
	std::cin>>noOfTestCases;
	for(i=0;i<noOfTestCases;i++){
		un[i].getValues();
	}
	for(i=0;i<noOfTestCases;i++){
		un[i].calcBestInt();
		un[i].printValues();
	}
	return 0;
}
