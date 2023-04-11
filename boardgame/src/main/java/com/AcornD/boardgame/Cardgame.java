package com.AcornD.boardgame;

import java.io.Serializable;

public class Cardgame extends Game implements Serializable{
	public Cardgame() {}
	public Cardgame(String name, int people, boolean lend, String explain) {
		super(name, people, lend, explain);
		this.setName(name);
		this.setPeople(people);
		this.setLend(lend);
		this.setExplain(explain);

	}
	
	protected void search (Object[] o) {
		System.out.println("카드게임");
		Cardgame[] cardgame=(Cardgame[]) o;
		for(int i=0; i<cardgame.length; i++) {
			System.out.println((i+1)+". "+cardgame[i]);
		}
	}
}
