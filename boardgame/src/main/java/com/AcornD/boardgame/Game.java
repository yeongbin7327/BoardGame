package com.AcornD.boardgame;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game implements Serializable {
	private String name;
	private int people;
	private boolean lend;
	private String explain;
		
		public Game() {};
		public Game(String name, int people, boolean lend, String explain) {
			this.setName(name);
			this.setPeople(people);
			this.setLend(lend);
			this.setExplain(explain);
		}
		
		@Override
		public String toString() {
			String lendstr;
			if (isLend() == true) lendstr = "O";
			else lendstr = "X";
			return "이름: " + getName() + ", 최대 인원 수: " + getPeople() + ", 현재 대여 가능 여부: " + lendstr + ", 설명: " + getExplain();
		}
		
		protected void searchall(Game[] c, Game[] b, Game[] t) {
			Cardgame[] cardgame=(Cardgame[])c;
			Boardgame[] boardgame=(Boardgame[])b;
			Todaygame[] todaygame=(Todaygame[])t;
			
			int num=1;
			for (int i = 0; i<cardgame.length; i++) {
				System.out.println((num) + " . " + cardgame[i]);
				System.out.println();
				num++;
			}
			for (int i = 0; i<boardgame.length; i++) {
				System.out.println((num) + " . " + boardgame[i]);
				System.out.println();
				num++;
			}
			for(int i =0; i<todaygame.length; i++) {
				System.out.println((num) + " . " + todaygame[i]);
				System.out.println();
				num++;
			}
		}
		protected void search (Object[] o) {
		
		}
		
		protected void lend (Object[] o) {
			while(true) {
				Scanner sc = new Scanner (System.in);
				try {
					System.out.println("번호를 입력해주세요.");
					int cusorder= sc.nextInt();
					Game[] game=(Game[]) o;
					if (game[cusorder-1].isLend() == false) {
						System.out.println("대여불가");
					}
					else {
						System.out.println("선택하신 게임은 "+game[cusorder-1]);
						System.out.println("빌리시겠습니까? y or n");
						String intention = sc.next();
						if (intention.equals("y")) {
							System.out.println("대여합니다.");
							game[cusorder-1].setLend(false);
							break;
						}
						else if (intention.equals("n")){
							System.out.println("번호 선택으로 돌아갑니다");}
						else {System.out.println("첫 화면으로 돌아갑니다");
						break;
						}
					}
				}catch(InputMismatchException e){
					System.out.println("숫자를 입력해주세요");
					lend(o);
			}
		}
	}
		public void gamereturn (Object[] o) {
			Scanner sc = new Scanner (System.in);
			while(true) {
				try {
					System.out.println("번호를 입력해주세요.");
					int cusorder= sc.nextInt();
					Game[] game=(Game[]) o;
					if (game[cusorder-1].isLend() == true) {
						System.out.println("반납불가");
					}
					else {
						System.out.println("선택하신 게임은 "+game[cusorder-1]);
						System.out.println("반납하시겠습니까? y or n");
						String intention = sc.next();
						if (intention.equals("y")) {
							System.out.println("반납합니다.");
							game[cusorder-1].setLend(true);
							break;
						}
						else if (intention.equals("n")){
							System.out.println("번호 선택으로 돌아갑니다");}
						else {System.out.println("첫 화면으로 돌아갑니다");
						break;
						}
					}
				}catch(InputMismatchException e){
					System.out.println("숫자를 입력해주세요");
					gamereturn(o);
				}
			}
		}

		public int getPeople() {
			return people;
		}

		public void setPeople(int people) {
			this.people = people;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isLend() {
			return lend;
		}

		public void setLend(boolean lend) {
			this.lend = lend;
		}

		public String getExplain() {
			return explain;
		}

		public void setExplain(String explain) {
			this.explain = explain;
		}

}




