//Code for Swapping two numbers in java 
#include<iostream>
using namespace std;
void swap(int& ,int& ); 
int main()
{
	int x,y;
	cout<<"Enter num1 : ";
	cin>>x;
	cout<<"Enter num2 : ";
	cin>>y;
	cout<<"before swaping:"<<endl<<"x="<<x<<","<<"y="<<y<<endl;
    swap(x,y);
	cout<<"after swaping:"<<endl<<"x="<<x<<endl<<"y="<<y;
}


void swap(int& x,int& y){
	int f;
	f=x;
	x=y;
	y=f;

	}
