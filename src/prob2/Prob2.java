package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		
		System.out.print("금액: ");
		Scanner s = new Scanner(System.in);
		int money = s.nextInt();

			if(money/50000>0){
				System.out.println("오만 원권: "+money/50000+"매");
				money-=(money/50000)*50000;
			}
			if(money/10000>0){
				System.out.println("만 원권: "+money/10000+"매");
				money-=(money/10000)*10000;
			}
			if(money/5000>0){
				System.out.println("오천 원권: "+money/5000+"매");
	
				money-=(money/5000)*5000;
			}
			if(money/1000>0){
				System.out.println("천 원권: "+money/1000+"매");
		
				money-=(money/1000)*1000;
			}
			if(money/500>0){
				System.out.println("500원 동전: "+money/500+"개");
				
				money-=(money/500)*500;
			}
			if(money/100>0){
				System.out.println("100원 동전: "+money/100+"개");
				
				money-=(money/100)*100;
			}
			if(money/50>0){
				System.out.println("50원 동전: "+money/50+"개");
				
				money-=(money/50)*50;
			}
			if(money/10>0){
				System.out.println("10원 동전: "+money/10+"개");
				money-=(money/10)*10;
			}
			if(money>0){
				System.out.println("1원 동전: "+money+"개");
			}

		

		s.close();
	}
}

