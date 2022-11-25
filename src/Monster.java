import java.util.HashMap;
import java.util.Objects;

public abstract class Monster {
  private int hp;
  private int xp;
  private int maxHP;
  private HashMap<String,Integer> items;

  public Monster(int hp, int xp, int maxHP, HashMap<String, Integer> items) {
    this.hp = hp;
    this.xp = xp;
    this.maxHP = maxHP;
    this.items = items;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getXp() {
    return xp;
  }

  public int getMaxHP() {
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
    return "Monster{" +
      "hp=" + hp +
      ", xp=" + xp +
      ", maxHP=" + maxHP +
      ", items=" + items +
      '}';
  }
}
