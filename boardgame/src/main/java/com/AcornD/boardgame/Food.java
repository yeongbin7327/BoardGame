package com.AcornD.boardgame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Food extends Stuff{
	public Food() {}
	public Food(String name, int price) {
		super(name,price);
		this.setName(name);
		this.setPrice(price);
	}
	
	protected void search () {
		System.out.println("음식");
		Food[] foods= Save.fooddata();
		for(int i=0; i<foods.length; i++) {
			System.out.println((i+1)+". "+foods[i]);
		}
	}
	
	public void buy() {
		Food[] foods=Save.fooddata();
		Scanner sc = new Scanner (System.in);
		search();
		while(true) {
			try {
				System.out.println(" 수량을 입력해주세요. ");
				int cusnum = sc.nextInt();
				int[] cusorder = new int[cusnum];
				int i =0;
				while(cusnum>0) {
					System.out.println(" 메뉴를 선택해주세요. ");
					int tmp = sc.nextInt();
					if( tmp >= 1&& tmp<= 10) {
						cusorder[i] =tmp;
						cusnum--;
						i++;
					}
					else System.out.println("범위 내의 메뉴를 입력해주세요.");
				}
				System.out.print(" 주문하신 메뉴는 : ");
				for(int j=0; j<cusorder.length; j++) {
					System.out.print(foods[cusorder[j]-1].getName() + " ");
				}
				System.out.println(" 입니다. ");
		
		
				System.out.println("주문하시겠습니까? y or n");
				String intention = sc.next();
				if (intention.equals("y")) {
					System.out.println("주문이 완료되었습니다.");
					break;
				}
				else if (intention.equals("n")){
					System.out.println("주문 화면으로 돌아갑니다");}
				else {System.out.println("첫 화면으로 돌아갑니다");
				break;
				}
			}catch(InputMismatchException e){
					System.out.println("숫자를 입력해주세요");
					break;
				}
		}
	}
}
