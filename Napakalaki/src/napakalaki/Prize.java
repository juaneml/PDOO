package napakalaki;

/**
 *
 * @author juane
 */
public class Prize {
 private int treasures;
 private int level;
 
 /**
  * Constructor:
  */
 Prize(int treasures, int level){
     this.treasures = treasures;
     this.level = level;
 }
 
 /**
  * Consultores:
  * Métodos Get.
  */
 
 /**
  * Método getTreasures()
  * @return treasures de tipo int
  */
 
 int getTreasures(){
    return treasures; 
 }
 
 
 /**
  * Método getLevel()
  * @return level de tipo int
  */
 
 int getLevel(){
     return level;
 }
 
 /**
  * Método toString
     * @return String
  */
 
 @Override
 public String toString(){
     return "Treasures ="+ Integer.toString(treasures) + " levels = " + Integer.toString(level);
 }
}
 
