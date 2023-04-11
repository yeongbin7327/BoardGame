package com.AcornD.boardgame;

import java.io.Serializable;

public class Boardgame extends Game  implements Serializable {
	public Boardgame() {}
	public Boardgame(String name, int people, boolean lend, String explain) {
		super(name, people, lend, explain);
		this.setName(name);
		this.setPeople(people);
		this.setLend(lend);
		this.setExplain(explain);
	}
	
	protected void search (Object[] o) {
		System.out.println("보드게임");
		Boardgame[] boardgame=(Boardgame[]) o;
		for(int i=0; i<boardgame.length; i++) {
			System.out.println((i+1)+". "+boardgame[i]);
		}
	}
	
}
