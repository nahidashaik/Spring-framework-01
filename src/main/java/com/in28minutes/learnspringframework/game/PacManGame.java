package com.in28minutes.learnspringframework.game;

public class PacManGame implements GamingConsole{
	public void up() {
		System.out.println("PACMAN - go up");
	}
	public void down() {
		System.out.println("PACMAN - go down");
	}
	public void left() {
		System.out.println("PACMAN - Go left");
	}
	public void right(){
		System.out.println("PACMAN - go right");
	}
}
