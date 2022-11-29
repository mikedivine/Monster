import java.util.HashMap;

/**
 * Title: Imp
 * Abstract: Purpose of this program is to create an Imp class which extends Monster
 * Author: Mike Divine
 * Date: 11/25/2022
 */

public class Imp extends Monster {

  public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    super(maxHP, xp, items);
  }

  @Override
  public String toString() {
    return "Imp has : " + super.toString();
  }
}
