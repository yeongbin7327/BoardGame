package com.AcornD.boardgame;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Save {
	public static void data() { }
	
	public static Cardgame[] carddata() {
		
		// 할리갈리, 부루마블, 윷놀이, 루미큐브, 젠가, 화투, 공기놀이, 다빈치코드, 카탄의개척자, 스플렌더, 클루, 원카드, 바퀴벌레포커
		 Cardgame[] cardgame = new Cardgame[5];
		 	/*cardgame[0] = new Cardgame("할리갈리", 3, true, "과일 갯수 5개 되면 종치고 카드 뺏는 게임");
			cardgame[1] = new Cardgame("원카드", 5, true, "원카드라고 외치면 이김");
			cardgame[2] = new Cardgame("바퀴벌레포커", 4, false, "칩이 바퀴벌레임");
			cardgame[3] = new Cardgame("스플렌더", 5, false, "중세시대 보석상이 되어보세요");
			cardgame[4] = new Cardgame("화투", 6, true, "타짜로 배우세요"); */
		//파일 초기화
		 try {
				ObjectOutputStream  o  = new  ObjectOutputStream ( new FileOutputStream("card.text"));
				o.writeObject(new Cardgame("할리갈리", 3, true, "과일 갯수 5개 되면 종치고 카드 뺏는 게임"));
				o.writeObject(new Cardgame("원카드", 5, true, "원카드라고 외치면 이김")); 
				o.writeObject(new Cardgame("바퀴벌레포커", 4, false, "칩이 바퀴벌레임")); 
				o.writeObject(new Cardgame("스플렌더", 5, false, "중세시대 보석상이 되어보세요")); 
				o.writeObject(new Cardgame("화투", 6, true, "타짜로 배우세요")); 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 int index=0;
			try {
				 ObjectInputStream  o  = new  ObjectInputStream ( new FileInputStream("card.text"));			
			
			  try {
				while(true) {
					cardgame[index] = (Cardgame)o.readObject();
					 index++;
				}
				
			  }catch( EOFException e) {
				  System.out.println("");
			  }
				 
				 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return cardgame;
			// 카드 게임 - 할리갈리, 원카드, 바퀴벌레포커, 스플렌더, 화투
		 }
		 
	public static Boardgame[] boarddata() {	 
		 
			Boardgame[] boardgame = new Boardgame[8];
		 	/*boardgame[0] = new Boardgame("부루마블", 3, true, "세계여행은 부루마블로");
			boardgame[1] = new Boardgame("윷놀이", 5, true, "명절용 도박");
			boardgame[2] = new Boardgame("루미큐브", 4, false, "숫자 다 버려!");
			boardgame[3] = new Boardgame("젠가", 5, true, "잘못 빼면 친구 잃어요");
			boardgame[4] = new Boardgame("다빈치코드", 6, true, "방탈출이 더 재밌을듯");
			boardgame[5] = new Boardgame("카탄의개척자", 6, true, "직업체험 : 목수");
			boardgame[6] = new Boardgame("클루", 6, false, "경찰과 도둑");
			boardgame[7] = new Boardgame("공기놀이", 6, true, "꺾기만 잘해도 1인분"); */
			
			try {
				ObjectOutputStream  o  = new  ObjectOutputStream ( new FileOutputStream("board.text"));
				o.writeObject(new Boardgame("부루마블", 3, true, "세계여행은 부루마블로"));
				o.writeObject(new Boardgame("윷놀이", 5, true, "명절용 도박")); 
				o.writeObject(new Boardgame("루미큐브", 4, false, "숫자 다 버려!")); 
				o.writeObject(new Boardgame("젠가", 5, true, "잘못 빼면 친구 잃어요")); 
				o.writeObject(new Boardgame("다빈치코드", 6, true, "방탈출이 더 재밌을듯")); 
				o.writeObject(new Boardgame("카탄의개척자", 6, true, "직업체험 : 목수")); 
				o.writeObject(new Boardgame("클루", 6, false, "경찰과 도둑")); 
				o.writeObject(new Boardgame("공기놀이", 6, true, "꺾기만 잘해도 1인분")); 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int index=0;
			try {
				 ObjectInputStream  o  = new  ObjectInputStream ( new FileInputStream("board.text"));			
			
			  try {
				while(true) {
					 boardgame[index] = (Boardgame)o.readObject();
					 index++;
				}
				
			  }catch( EOFException e) {
				  System.out.println("");
			  }
				 
				 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return boardgame;
			// 보드 게임 - 부루마블, 윷놀이, 루미큐브, 젠가, 다빈치코드, 카탄의개척자, 클루, 공기놀이
	}
		 
		
	public static Todaygame[] todaydata() {	
		 Todaygame[] todaygame = new Todaygame[4];
		 
		 	/*todaygame[0] = new Todaygame("루미큐브", 4, false, "추천게임인데 안할거?");
			todaygame[1] = new Todaygame("원카드", 5, true, "난 이거 큐플레이로 배움");
			todaygame[2] = new Todaygame("바퀴벌레포커", 4, false, "세스코 : 1588-1119");
			todaygame[3] = new Todaygame("카탄의개척자", 4, true, "난 이거 사탄의 개척자인줄 알았음"); */
		 
		 	try {
				ObjectOutputStream  o  = new  ObjectOutputStream ( new FileOutputStream("today.text"));
				o.writeObject(new Todaygame("루미큐브", 4, false, "추천게임인데 안할거?"));
				o.writeObject(new Todaygame("원카드", 5, true, "난 이거 큐플레이로 배움")); 
				o.writeObject(new Todaygame("바퀴벌레포커", 4, false, "세스코 : 1588-1119")); 
				o.writeObject(new Todaygame("카탄의개척자", 4, true, "난 이거 사탄의 개척자인줄 알았음")); 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	
		 	int index=0;
			try {
				 ObjectInputStream  o  = new  ObjectInputStream ( new FileInputStream("today.text"));			
			
			  try {
				while(true) {
					todaygame[index] = (Todaygame)o.readObject();
					 index++;
				}
				
			  }catch( EOFException e) {
				  System.out.println("");
			  }
				 
				 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			return todaygame;
			// 오늘의 추천 게임 -  루미큐브, 원카드, 바퀴벌레포커, 카탄의개척자
	}
		
	public static Drink[] drinkdata() {
		 
		Drink[] drinks = new Drink[9];
		/*drinks[0] = new Drink("아메리카노", 2500);
		drinks[1] = new Drink("바닐라라떼", 4500);
		drinks[2] = new Drink("카라멜마끼야또", 4500);
		drinks[3] = new Drink("아이스티", 3000);
		drinks[4] = new Drink("콜라", 2000);
		drinks[5] = new Drink("환타", 2000);
		drinks[6] = new Drink("사이다", 2000);
		drinks[7] = new Drink("오렌지주스", 4000);
		drinks[8] = new Drink("레몬에이드", 4000); */
		
		// 아메리카노, 바닐라라떼 , 카라멜마끼야또, 아이스티, 콜라, 환타, 사이다 , 오렌지주스, 레몬에이드
		
		try {
			ObjectOutputStream  o  = new  ObjectOutputStream ( new FileOutputStream("drink.text"));
			o.writeObject(new Drink("아메리카노", 2500));
			o.writeObject(new Drink("바닐라라떼", 4500)); 
			o.writeObject(new Drink("카라멜마끼야또", 4500)); 
			o.writeObject(new Drink("아이스티", 4500));
			o.writeObject(new Drink("콜라", 2000)); 
			o.writeObject(new Drink("환타", 2000)); 
			o.writeObject(new Drink("사이다", 2000)); 
			o.writeObject(new Drink("오렌지주스", 4000)); 
			o.writeObject(new Drink("레몬에이드", 4000)); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int index=0;
		try {
			 ObjectInputStream  o  = new  ObjectInputStream ( new FileInputStream("drink.text"));			
		
		  try {
			while(true) {
				drinks[index] = (Drink)o.readObject();
				 index++;
			}
			
		  }catch( EOFException e) {
			  System.out.println("");
		  }
			 
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return drinks;
	}
	
	public static Food[] fooddata() {
		 Food[] foods = new Food[10];
		 // 토스트, 김치볶음밥, 라면, 우동, 돈까스, 감자튀김, 떡볶이, 순대, 튀김, (오늘의 추천메뉴)순대국밥
		/*foods[0] = new Food("토스트", 2000);
		foods[1] = new Food("김치볶음밥", 5000);
		foods[2] = new Food("라면", 3500);
		foods[3] = new Food("우동", 4000);
		foods[4] = new Food("돈까스", 5000);
		foods[5] = new Food("감자튀김", 2500);
		foods[6] = new Food("떡볶이", 3000);
		foods[7] = new Food("순대", 3000);
		foods[8] = new Food("튀김", 3000);
		foods[9] = new Food("(오늘의 추천 메뉴) 순대국밥", 9000); */
		try {
				ObjectOutputStream  o  = new  ObjectOutputStream ( new FileOutputStream("food.text"));
				o.writeObject( new Food("토스트", 2000));
				o.writeObject( new Food("김치볶음밥", 5000));
				o.writeObject( new Food("라면", 3500));
				o.writeObject( new Food("우동", 4000));
				o.writeObject( new Food("돈까스", 5000));
				o.writeObject( new Food("감자튀김", 2500));
				o.writeObject( new Food("떡볶이", 3000));
				o.writeObject( new Food("순대", 3000));
				o.writeObject( new Food("튀김", 3000));
				o.writeObject( new Food("(오늘의 추천 메뉴) 순대국밥", 9000));
		 	}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		int index=0;
		try {
			 ObjectInputStream  o  = new  ObjectInputStream ( new FileInputStream("food.text"));			
		
		  try {
			while(true) {
				foods[index] = (Food)o.readObject();
				 index++;
			}
			
		  }catch( EOFException e) {
			  System.out.println("");
		  }
			 
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return foods;
	}
	
	
	
	
}
