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
				while(count<n){//n������
					int t=sc.nextInt();//�w��
					int m=sc.nextInt();//�ݭn§���ƶq
					int k=sc.nextInt();//k��§���ѿ��
					int data[]=new int[k];
					for(int i=0;i<k;i++){//�C��§������
						data[i]=sc.nextInt();
					}
					for(int i=0;i<k-1;i++){//�Ѥp��j�Ƨ�
						for(int j=0;j<k-1-i;j++){
							if(data[j]>data[j+1]){
								int tmp=data[j];
								data[j]=data[j+1];
								data[j+1]=tmp;
							}
						}
					}
					int sum=0;
					for(int i=0;i<m;i++){//§���O��   �`�M�O�_�j��w��
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
