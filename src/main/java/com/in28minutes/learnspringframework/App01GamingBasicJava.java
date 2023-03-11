package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game=new MarioGame();
		var game=new PacManGame();//1.Object creation
		//var game =new SuperContraGame();
		var gameRunner=new GameRunner(game);//object creation+wiring of dependencies
		//game is a Dependency of GameRunner
		gameRunner.run();

	}

}
