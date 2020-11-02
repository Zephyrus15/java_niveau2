package tp1.entities;

import tp1.functionnalities.Carnivorus;
import tp1.functionnalities.Eatable;
import tp1.functionnalities.Terrestrial;

public class Hyena extends Animal implements Terrestrial, Carnivorus {

  public Hyena() {
    super();
  }

  public Hyena(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
}
