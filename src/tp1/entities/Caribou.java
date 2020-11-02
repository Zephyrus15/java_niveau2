package tp1.entities;

import tp1.functionnalities.Eatable;
import tp1.functionnalities.Herbivorus;
import tp1.functionnalities.Terrestrial;

public class Caribou extends Animal implements Terrestrial, Herbivorus {

  public Caribou() {
    super();
  }

  public Caribou(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void walk() {
	// TODO Auto-generated method stub
	
	
}

@Override
public void eat(Eatable eatable) {
	// TODO Auto-generated method stub
	if (eatable instanceof Vegetable) {
		this.eat((Vegetable)eatable);
	}	
}

@Override
public void move() {
	// TODO Auto-generated method stub
	this.walk();
	
}

@Override
public void eat(Vegetable vegetable) {
	// TODO Auto-generated method stub
	
}
  
}
