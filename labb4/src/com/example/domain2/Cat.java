package com.example.domain2;

public class Cat extends Animal implements Pet{
	private int weight;
	private String name;
	private String color;
	
	public Cat(int weight, String name, String color) {
		this.weight = weight;
		this.name = name;
		this.color = color;
	}
	public Cat(String name) {
		this.name = name;
	}
	public Cat() {}
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
		System.out.println(name + " кусается");
	}
	public void eat(){
		System.out.print("Eating...\n"); 
	}
	public void sleep(){
		System.out.print("Sleeping zz-z-z-z...\n"); 
	}
	public void walk(){
		System.out.print("Walking...\n"); 
	}
	public String speak(String words){
		String phrase = words + "...mauu...\n"; return phrase; 
	}
}
