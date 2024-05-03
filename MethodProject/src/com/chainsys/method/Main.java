package com.chainsys.method;
public class Main {
	public static Player[] displayHighScorePosition(Player[] player) {
		for(int i=0;i<player.length;i++) {
			for(int j=i+1;j<player.length-1;j++) {
				if(player[i].getScore()<player[j].getScore()) {
					Player temp=player[i];
					player[i]=player[j];
					player[j]=temp;
				}
			}
		}
		return player;
	}
	public static int calculateHighScorePosition(int score) {
		if(score>=1000) {
			return 1;
		}
		else if(score>=500 && score<1000) {
			return 2;
		}
		else if(score>=100 && score<500) {
			return 3;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Player[] player=new Player[4];
		player[0]=new Player("Luffy",900,3,90,true); 
		player[1]=new Player("Zoro",400,2,45,false);
		player[2]=new Player("Panda",1500,4,150,true);
		player[3]=new Player("Robin",50,1,10,false);
		Player[] position = displayHighScorePosition(player);
		for(int i=0;i<position.length;i++ ) {
			System.out.println(position[i]+""+(i+1)+" position");
		}
		for(int i=0;i<player.length;i++ ) {
			System.out.println(calculateHighScorePosition(player[i].getScore())+" Rank");
		}
		
	}
}
