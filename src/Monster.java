import java.util.HashMap;
import java.util.Objects;

/**
 * Title: Monster
 * Abstract: Purpose of this program is to create a Monster class
 * Author: Mike Divine
 * Date: 11/25/2022
 */

public abstract class Monster {
  private Integer hp;
  private Integer xp = 10;
  private Integer maxHP;
  private HashMap<String,Integer> items;

  public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    this.maxHP = maxHP;
    hp = this.maxHP;
    this.xp = xp;
    this.items = items;
  }

  public Integer getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public Integer getXp() {
    return xp;
  }

  public Integer getMaxHP() {
    return maxHP;
  }

  public HashMap<String, Integer> getItems() {
    return items;
  }

  public void setItems(HashMap<String, Integer> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Monster monster = (Monster) o;
    return hp == monster.hp && xp == monster.xp && maxHP == monster.maxHP && Objects.equals(items, monster.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hp, xp, maxHP, items);
  }

  @Override
  public String toString() {
    return "hp=" + hp + "/" + maxHP;
  }
}
