package tp1.entities;

import tp1.functionnalities.Eatable;
import tp1.functionnalities.Omnivorus;
import tp1.functionnalities.Terrestrial;

public class Dog extends Animal implements Terrestrial, Omnivorus {

  public Dog() {
    super();
  }

  public Dog(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
}
