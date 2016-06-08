#include <iostream>
#include <cstring>
class DaisyTransformation
{
	private:
	int moves,status,length;
	char S1[50],S2[50];
	public:
	void getValues( )
	{
		std::cin >> S1 >> S2 >> moves;
		length=strlen(S1);
	}
	void printValues( )
	{
		std::cout <<"After" <<S1<<S2;
		if(status==0)
			std::cout << "No\n";
		else
			std::cout << "Yes\n";
	}
	void calcPossibilities()
	{
		int i=1,j=0;
		std::cout << "Before swapping" << S1<<S2;
		for(i=0;i<=moves&&j<length;){
			if(S1[j]==S2[j]){
				j++;
				//std::cout <<"\ncond"<< 1<<j;
			}
			else{
				if(S1[j]=='M'){
					S1[j]='D';
					i++;
					j++;
					//std::cout <<"\ncond1"<<i<<j ;
				}
				else{
					S1[j]='M';
					i++;
					j++;
					//std::cout << "\ncond2"<<i<<j;
				}
			}
		}
		if(strcmp(S1,S2)==0 && i==moves)
			status=1;
		else
			status=0;

	}

};
int main()
{
	DaisyTransformation dt[250];
	int noOfTestCases,i;
	std::cin>>noOfTestCases;
	for(i=0;i<noOfTestCases;i++){
		dt[i].getValues();
	}
	for(i=0;i<noOfTestCases;i++){
		dt[i].calcPossibilities();
		dt[i].printValues();
	}
	return 0;
}
