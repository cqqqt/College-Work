package com.example.domain2;

public class Rat extends Animal implements Pet {
	String name;
	public Rat(String name) {
		this.name = name;
	}
	public Rat() {}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	} 
	@Override
	public void play() {
		System.out.println(name + " бегает за сыром");
	}
	public void eat(){
		System.out.print("Eating...\n"); 
	}
	public void walk(){
		System.out.print("Walking...\n"); 
	}
}