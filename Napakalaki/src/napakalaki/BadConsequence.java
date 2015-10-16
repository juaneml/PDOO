package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author juane
 */
public class BadConsequence {

    /**
     * Atributos privados
     */
    private String text; // lo que dice un mal rollo
    private int levels; // niveles que se pierden
    private int nVisibleTreasures; // número de tesoros visibles que se pierden
    private int nHiddenTreasures; // número de tesoros ocultos que se pierden
    private boolean death; // mal rollo tipo muerte

    /**
     * Atributos de tipo Enumerado TreasureKind
     */
    
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    /**
     * Constructores
     */
    
    /**
     * Constructor que recibe como argumentos 
     * @param text de tipo String
     * @param levels de tipo int
     * @param nVisible de tipo int
     * @param nHidden de tipo int
     */
    
    BadConsequence(String text, int levels, int nVisible, int nHidden) {
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = nVisible;
        this.nHiddenTreasures = nHidden;
    }
    
    /**
     * Constructor que recibe como argumentos
     * @param text de tipo String
     * @param death de tipo boolean
     */
    
    BadConsequence(String text, boolean death) {
        this.text = text;
        this.death = death;

    }
    
    /**
     * Constructor que recibe como argumentos
     * @param text de tipo String
     * @param levels de tipo int
     * @param tVisible  ArrayList de tipo enumerado TreasureKind
     * @param tHidden ArrayList de tipo enumerado TreasureKind
     */
    
    BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
            ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        this.specificVisibleTreasures = tVisible;
        this.specificHiddenTreasures = tHidden;
    }

    
        
    /**
     * Método getText()     *
     * @return text de tipo String
     */
    
    public String getText() {
        return this.text;
    }
    
    /**
     * Método getLevels() 
     * @return levels the tipo int
     */
    
    public int getLevels(){
        return this.levels;
    }
    
    
    /**
     * Método getVisibleTreasures()
     * @return de tipo int
     */
    
    public int getVisibleTreasures(){
        return this.nVisibleTreasures;
    }
    
    /**
     * Método get nHiddenTreasures()
     * @return nHiddenTreasures de tipo int
     */
    
    public int getHiddenTreasures(){
        return this.nHiddenTreasures;
    }
    
    /**
     * Método getDeath()
     * @return death de tipo boolean
     */
   public boolean getDeath(){
        return this.death;
    }
    
   /**
    * Método toString
    * @return 
    */
    @Override
   public String toString(){
        return "BadConsequence = " + " " + this.text + " " + "Level = " + this.levels + " "+
                "nVisibleTreasures = " + " " + this.nVisibleTreasures + " " + "nHiddenTreasures = "
                + this.nHiddenTreasures + " " + "specificVisibleTreasures = " + this.specificVisibleTreasures +" "
                +"specificHiddenTreasures = " + this.specificHiddenTreasures +  " " + "muerte = " + " " + this.death;
    }
}
