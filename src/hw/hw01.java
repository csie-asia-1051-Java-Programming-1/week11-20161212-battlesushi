package hw;
import java.util.Scanner;
/*
 * Date: 2016/12/12
 * Author: 105021030  �i�ʷ�
 */
public class hw01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String n2="";
		int move=sc.nextInt();
		int print;
		for(int i=0;i<n.length()-1;i++){//��K
			if(n.charAt(i)!=' '){
				print=(int)n.charAt(i);
				n2=n2+""+(char)(print+move);
			}
			else if(n.charAt(i)==' ')
				n2=n2+" ";
			else
				n2=n2+n.charAt(i);
		}
		for(int i=0;i<n.length()-1;i++){//���
			System.out.print(n2.charAt(i));
		}		
			System.out.println();
		
	}
}