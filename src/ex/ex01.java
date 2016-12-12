package ex;
import java.util.Scanner;
/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
public class ex01 {
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				short count=0;
				while(count<n){//n筆測資
					int t=sc.nextInt();//預算
					int m=sc.nextInt();//需要禮物數量
					int k=sc.nextInt();//k種禮物供選擇
					int data[]=new int[k];
					for(int i=0;i<k;i++){//每種禮物價格
						data[i]=sc.nextInt();
					}
					for(int i=0;i<k-1;i++){//由小到大排序
						for(int j=0;j<k-1-i;j++){
							if(data[j]>data[j+1]){
								int tmp=data[j];
								data[j]=data[j+1];
								data[j+1]=tmp;
							}
						}
					}
					int sum=0;
					for(int i=0;i<m;i++){//禮物費用   總和是否大於預算
						sum=sum+data[i];
					}
					if(sum<t)
						System.out.println(sum);
					else
						System.out.println("Impossible");
					
					System.out.println();
					count++;
				}
			}
	}
