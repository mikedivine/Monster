import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Title: Driver
 * Abstract: Purpose of this program is to create a Driver class which uses the Monster, Imp, and Kobold objects
 * Author: Mike Divine
 * Date: 11/25/2022
 */

public class Driver {
  public static void main(String[] args) {
    HashMap<String,Integer> items = new HashMap<>();
    items.put("gold",5);
    List<Monster> monsters = new ArrayList<>();
    monsters.add(new Imp(15,20, items));
    monsters.add(new Kobold(1,5, items));

    for (Monster m : monsters) {
      System.out.println(m);
    }
  }
}
