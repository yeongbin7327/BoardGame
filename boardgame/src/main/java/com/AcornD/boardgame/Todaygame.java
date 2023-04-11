package com.AcornD.boardgame;

import java.io.Serializable;

public class Todaygame extends Game implements Serializable{
	
	public Todaygame() {}
	public Todaygame(String name, int people, boolean lend, String explain) {
		super(name, people, lend, explain);
		this.setName(name);
		this.setPeople(people);
		this.setLend(lend);
		this.setExplain(explain);
	}
	
	protected void search (Object[] o ) {
		System.out.println("추천게임");
		Todaygame[] todaygame=(Todaygame[]) o;
		for(int i=0; i<todaygame.length; i++) {
			System.out.println((i+1)+". "+todaygame[i]);
		}
	}
}
