package tp1.entities;

import tp1.functionnalities.Aquatic;
import tp1.functionnalities.Carnivorus;
import functionnalities.Eatable;

public class Dolphin extends Animal implements Aquatic, Carnivorus {

  public Dolphin() {
    super();
  }

  public Dolphin(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
}
