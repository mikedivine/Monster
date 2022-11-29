/**
 * Title: MeleeAttack
 * Abstract: Purpose of this class is to implement Attack and use a Melee Attack in the game
 * Author: Mike Divine
 * Date: 11/28/2022
 */

public class MeleeAttack implements Attack {

  Monster attacker;

  public MeleeAttack(Monster attacker) {
    this.attacker = attacker;
  }

  @Override
  public Integer attack(Monster target) {
    String message = attacker + " uses a melee attack on " + target;
    System.out.println(message);
    return null;
  }
}
