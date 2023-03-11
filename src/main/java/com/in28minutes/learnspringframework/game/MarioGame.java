package com.in28minutes.learnspringframework.game;

public class MarioGame implements GamingConsole{
	public void up() {
		System.out.println("MARIO GAME - Jump");
	}
	public void down() {
		System.out.println("MARIO GAME - Go into a hole");
	}
	public void left() {
		System.out.println("MARIO GAME - Go back");
	}
	public void right(){
		System.out.println("MARIO GAME - Accelerate");
	}
}
	
