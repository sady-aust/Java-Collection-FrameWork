/*
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * HackerRank JavaArrayList Problem
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		 ArrayList<Integer> list[];
		 list = new ArrayList[n];
		 
		for(int i=0;i<n;i++){
			list[i]= new ArrayList<>();
		}
		
		for(int i=0;i<n;i++){
			int d = sc.nextInt();
			for(int j=0;j<d;j++){
				int numbers = sc.nextInt();
				list[i].add(numbers);
			}
		}
		
		int quary = sc.nextInt();
	
		for(int i=0;i<quary;i++){
			int x= sc.nextInt();
			int y = sc.nextInt();
			int listSize = list[x-1].size();
			try{
			
			System.out.println(list[x-1].get(y-1));
			}catch(IndexOutOfBoundsException e){
				System.out.println("ERROR!");
			}
			
			
		}
		
		
	}
}
