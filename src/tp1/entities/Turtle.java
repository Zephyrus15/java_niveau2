package tp1.entities;

import tp1.functionnalities.Eatable;
import tp1.functionnalities.Omnivorus;
import tp1.functionnalities.Tetrapoda;

public class Turtle extends Animal implements Tetrapoda, Omnivorus {

  public Turtle() {
    super();
  }

  public Turtle(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
}
