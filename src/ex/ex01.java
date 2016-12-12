package ex;
import java.util.Scanner;
/*
 * 公司尾牙預定購買一批獎品給員工抽獎，而且人人有獎。在有限的經費、固定員工數、每份獎品均不相同的限制下，
 * 該如何選購獎品，使得總花費最少且不超過預算?

說明: 程式輸入的第一行包含一個正整數 n ， 1 ≤ n ≤ 10 ，代表接下來有 n 筆測試資料。 每筆測試資料包含兩行數據
，第一行包含三個正整數 T, m 和 k ， m ≤ k ≤ 100 ; T 代表總預算， m 代表員工數(禮物數量)， 
k 代表有 k 件物品可供選購。第二 行包含 k 個正整數，分別代表 k 種物品的售價，正整數間以空白隔開。
對於每一筆測試資料，輸出一行結果，該行結果列印禮品總花費。倘若預算內無法購 買足夠量的禮物，
則列印 “Impossible”，最後必須有換行字元
 * Date: 2016/12/12
 * Author: 105021030 張廷毓
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
