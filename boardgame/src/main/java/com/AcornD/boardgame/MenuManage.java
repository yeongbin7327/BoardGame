package com.AcornD.boardgame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManage {
	public void run() {
	Cardgame[] cardgame=Save.carddata();
	Boardgame[] boardgame = Save.boarddata();
	Todaygame[] todaygame=Save.todaydata();
	Scanner sc = new Scanner (System.in);
	System.out.println("D-CHO-LIM 보드게임카페입니다. 1인 1음료 주문 부탁드립니다.");
	System.out.println();
	System.out.println();
	Drink drink = new Drink();
	Food food = new Food();
	drink.search();
	loop1:while(true) {
		System.out.println("1. 조회 2. 음료구매 3. 음식추가구매 4. 게임대여 5. 종료");
		int menu1 =sc.nextInt();
		MenuManage menumanage = new MenuManage();
		switch(menu1) {
			case 1:
				menumanage.Searchmenu(cardgame, boardgame, todaygame);
				break;
			case 2:
				drink.buy();
				break;
			case 3:
				food.buy();
				break;
			case 4:
				menumanage.Lendmenu(cardgame, boardgame, todaygame);
				break;
			case 5:
				System.out.println("종료합니다.");
				break loop1;
			case 6:
				menumanage.returnmenu(cardgame, boardgame, todaygame);
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
	}
}
	
	public void Searchmenu(Cardgame[] c, Boardgame[] b, Todaygame[] t ) {
		Scanner sc = new Scanner (System.in);
		Cardgame cardgame[]=c;
		Boardgame boardgame[]=b;
		Todaygame todaygame[]=t;
		Game game = new Game();
		Drink drink = new Drink();
		Food food = new Food();
		System.out.println("1. 보드게임 2. 음료 3. 음식 4. 메뉴 조회 종료");
		int menu2 = sc.nextInt();
		switch(menu2) {
			case 1:
				game.searchall(cardgame, boardgame, todaygame);
				break;
			case 2:
				drink.search();
				break;
			case 3:
				food.search();
				break;
			case 4:
				System.out.println("메뉴 조회를 종료합니다.");
				break;
			default:	
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
	}
	public void Lendmenu(Cardgame[] c, Boardgame[] b, Todaygame[] t) {
		Scanner sc = new Scanner (System.in);
		Cardgame cardgame[]=c;
		Boardgame boardgame[]=b;
		Todaygame todaygame[]=t;
		Game game = new Game();
		Cardgame cardgame2 = new Cardgame();
		Boardgame boardgame2 = new Boardgame();
		Todaygame todaygame2 = new Todaygame();
		game.searchall(cardgame, boardgame, todaygame);
		System.out.println("대여할 게임 종류를 선택하세요.");
		System.out.println("1. 카드게임 2. 보드게임 3. D-CHO-LIM 추천메뉴");
		try {
		int cusnum = sc.nextInt();
		switch(cusnum) {
		case 1:
			cardgame2.search(cardgame);
			game.lend(cardgame);
			break;
		case 2:
			boardgame2.search(boardgame);
			game.lend(boardgame);
			break;
		case 3:
			todaygame2.search(todaygame);
			game.lend(boardgame);
			break;
		case 4:
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}catch(InputMismatchException e){
		System.out.println("숫자를 입력해주세요");
	}
	}
	
	public void returnmenu(Cardgame[] c, Boardgame[] b, Todaygame[] t) {
		String password = "0221";
		String passwordcheck;
		Scanner sc = new Scanner (System.in);
		System.out.println("비밀번호를 입력해주세요.");
		passwordcheck =sc.next();
		if (passwordcheck.equals(password)) { 
		Cardgame cardgame[]=c;
		Boardgame boardgame[]=b;
		Todaygame todaygame[]=t;
		Game game = new Game();
		Cardgame cardgame2 = new Cardgame();
		Boardgame boardgame2 = new Boardgame();
		Todaygame todaygame2 = new Todaygame();
		System.out.println("반납할 게임 종류를 선택하세요.");
		System.out.println("1. 카드게임 2. 보드게임 3. D-CHO-LIM 추천메뉴");
		try {
		int cusnum = sc.nextInt();
		switch(cusnum) {
		case 1:
			cardgame2.search(cardgame);
			game.gamereturn(cardgame);
			break;
		case 2:
			boardgame2.search(boardgame);
			game.gamereturn(boardgame);
			break;
		case 3:
			todaygame2.search(todaygame);
			game.gamereturn(boardgame);
			break;
		case 4:
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}catch(InputMismatchException e){
		System.out.println("숫자를 입력해주세요");
		}
		}else {
		System.out.println("메인 화면으로 돌아갑니다");
		run();
		}
	}
}
