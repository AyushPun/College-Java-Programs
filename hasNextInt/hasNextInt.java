import java.util.Scanner;
public class hasNextInt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum,avg,ctr;
		sum=avg=ctr=0;
		while(sc.hasNextInt()){
			sum+= sc.nextInt();
			ctr++;
		}
		avg=sum/ctr;
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+avg);
		sc.close();
	}
}