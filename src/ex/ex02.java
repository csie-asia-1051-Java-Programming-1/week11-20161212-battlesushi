package ex;
import java.util.Scanner;
/*
 * �g�@�ӵ{���D�@��ƧǦC�ҧt����ƭӼƤΥ����ȡC�@��ƧǦC�H�ť���j�}�Ʀr�C
 * �ǦC�ҧt����ƭӼƤΥ����ȡC��T�ܤp���I�� 3 ��(�Ѥp���I�� 4 ��|�ˤ��J)
 * Date: 2016/12/12
 * Author: 105021030  �i�ʷ�
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String m="";
		float sum=0;
		float sum2=0;
		int count=1;
		double Average;
//		String n2=Integer.toString(sum);
		for(int i=0;i<n.length();i++){
			if(n.charAt(i)!=' '){
				m=""+n.charAt(i);
			}
			else{
				sum2=Integer.parseInt(m);
				sum=sum+sum2;
				count++;//Size
			}
			if(i==n.length()-1){
				sum2=Integer.parseInt(m);
				sum=sum+sum2;
			}
		}
		sum2=sum/count;
		Average=(float)Math.round(sum2*1000f)/1000f;
		System.out.println("Size:"+count);
		System.out.print("Average:"+Average);
		
		
	}
}