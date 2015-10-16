package napakalaki;

/**
 *
 * @author juane
 */
public class Monster {
    
    /**
     * Atributos privados propios de la clase
     */
    
    private String name; // Nombre del monstruo
    private int combatLevel; //Nivel de combate del monstruo

    /**
     * Atributos privados de otras clases
     */
    private Prize prize; // falta inicialización del objeto prize
    private BadConsequence badconsequence; //falta inicialización del objeto
    
    
    
    /** Constructor **/
    
    Monster(String name, int level, BadConsequence bc, Prize price){
        this.name = name;
        this.combatLevel = level;
        this.badconsequence = bc;
        this.prize = price;
        
    }
    
    /** CONSULTORES **/
    
    /**
     * Método getName()
     * @return name de tipo String
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     * Método getCombatLevel()
     * @return combatLevel de tipo  int
     */
    
    public int getCombatLevel(){
        return this.combatLevel;
    }
    
    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString(){
        return "Monster = " +this.name +" " + "CombatLevel = " + Integer.toString(this.combatLevel) +
                " prize = " + " " + this.prize+ " " + this.badconsequence;
    }
}
