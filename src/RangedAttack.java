/**
 * Title: MeleeAttack
 * Abstract: Purpose of this class is to implement Attack and use a Ranged Attack in the game
 * Author: Mike Divine
 * Date: 11/28/2022
 */
public class RangedAttack implements Attack {
  Monster attacker;

  public RangedAttack(Monster attacker) {
    this.attacker = attacker;
  }

  @Override
  public Integer attack(Monster target) {
    String message = attacker + " uses a ranged attack on " + target;
    System.out.println(message);
    return null;
  }
}
