import java.util.HashMap;

/**
 * Title: Kobold
 * Abstract: Purpose of this program is to create a Kobold class which extends Monster
 * Author: Mike Divine
 * Date: 11/25/2022
 */

public class Kobold extends Monster {

  public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    super(maxHP, xp, items);
  }

  @Override
  public String toString() {
    return "Kobold has : " + super.toString();
  }
}
