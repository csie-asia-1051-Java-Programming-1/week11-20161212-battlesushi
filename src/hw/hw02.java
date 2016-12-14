package hw;
import java.util.Arrays;
import java.util.Scanner;
/*
 * Date: 2016/12/12
 * Author: 105021030  張廷毓
 */
public class hw02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int count=1;
		int	j=0;
		for(int i=0;i<n.length();i++){//個數
			if(n.charAt(i)==' ')
				count++;
		}
		String data[]=new String[count];
		for(int z=0;z<count;z++){//為了可以兩位數以上 ---> ||
			data[z]="";		
		}
		for(int i=0;i<n.length();i++){
			if(n.charAt(i)!=' ')
				data[j]=data[j]+n.charAt(i);//  ---||
			else
				j++;
		}
		int data2[]=new int[count];//轉int
		for(int i=0;i<count;i++){
			String n2;
			n2=data[i];
			int	k=Integer.parseInt(n2);
			data2[i]=k;
		}
		Arrays.sort(data2);
		j=1;
		for(int i=0;i<count-1;i++){
			if(data2[i]==data2[i+1])
			j++;
			if(j>count/2){
				System.out.println(data2[i]);
				break;
			}
		}
		if(j<=count/2)
			System.out.println("NO");
	}
}