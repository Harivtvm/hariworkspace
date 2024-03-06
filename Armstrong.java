import java.util.Scanner;
class Armstrong{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();
int t=n;
int q=n;
int i=0;
double s=0;
while(n!=0)
{
n=n/10;
i++;
}
while(t!=0){
int d=t%10;
s=s+Math.pow(d,i);  // power of a number syntax- Math.pow(base,exponent)
t=t/10;
}
/* System.out.println(s); */
if(s==q){
	System.out.println("Entered number is a  Armstrong number");
}
else{
	System.out.println("Entered number is not an Armstrong number");
}
}
}