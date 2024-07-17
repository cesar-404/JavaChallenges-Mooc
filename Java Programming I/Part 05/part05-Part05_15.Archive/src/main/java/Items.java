/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Namorado
 */
public class Items {
    private final String name;
    private final String identifier;
    
    public Items(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    
    public String getName() {
        return this.name;
    }
    public String getIdentifier() {
        return this.identifier;
    }
    
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        if(!(compared instanceof Items)) {
            return false;
        }
        
        Items comparedItem = (Items) compared;
        return (this.identifier.equals(comparedItem.getIdentifier()));    
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    } 
            
}
