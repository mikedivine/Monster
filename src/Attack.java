/**
 * Title: Attack
 * Abstract: Purpose of this interface is to extend Ability for attacking
 * Author: Mike Divine
 * Date: 11/15/2022
 */

public interface Attack extends Ability {

  abstract Integer attack(Monster monster);
}
