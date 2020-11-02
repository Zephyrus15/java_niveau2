package tp1.entities;

import tp1.functionnalities.Eatable;
import tp1.functionnalities.Herbivorus;
import tp1.functionnalities.Terrestrial;

public class Deer extends Animal implements Terrestrial, Herbivorus {

  public Deer() {
    super();
  }

  public Deer(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
}
