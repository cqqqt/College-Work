package com.example;

import com.example.domain2.Cat;
import com.example.domain2.Rat;
import com.example.domain2.Fish;
import com.example.domain2.Pet;


public class PetMain {
	public static void main(String[] args) 
	{
		Cat c = new Cat("Tom");
		c.eat();
		c.walk();
		c.play();
		Cat a = new Cat();
		a.eat();
		a.walk();
		Pet p;
		p = new Cat();
		p.setName("Mr. Whiskers");
		p.play();
		Fish f = new Fish();
		f.setName("Guppy");
		f.eat();
		f.walk();
		f.play();
		Fish a2 = new Fish();
		a2.eat();;
		a2.walk();
		Rat r = new Rat("Kelvin");
		r.play();
		r.walk();
			
	}
}
