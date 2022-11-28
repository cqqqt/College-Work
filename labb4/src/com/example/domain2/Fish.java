package com.example.domain2;

public class Fish extends Animal implements Pet {
	private String name;
	
	public Fish(String name) {
		this.name = name;
	}
	public Fish() {}
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
		System.out.println(name + " плавает вверх-вниз");
	}
	public void eat(){
		System.out.print("Eating...\n"); 
	}
	public void walk(){
		System.out.print("Walking...\n"); 
	}
}
