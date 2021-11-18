/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab14;

//import java.lang.module.ModuleDescriptor.Builder;

/**
 *
 * @author 000728303
 */
public class Material {
    
    private final String matName;
    private final String toughness; //soft or hard
    private final String weight;    //light or heavy
    private final String opacity;   //transparent or transulcent or opaque
    private final String stiffness; //rigid or bendy or elastic
    private final String breathe;   //breathable or nonbreathable
    private final boolean waterproof;
    private final boolean absorbent;
    private final boolean windproof;
    private final boolean moistureResistant;
    private final boolean shiny;
    private final boolean antibacterial;
    private final boolean heatResistant;
    private final boolean coldResistant;
    private final boolean acidResistant;
    private final boolean alcoholResistant;
    private final boolean alkaliResistant;
    private final boolean mineralOilResistant;
    private final boolean recyclable;

    private Material(Builder builder){
        matName = builder.matName;
        toughness = builder.toughness;
        weight = builder.weight;
        opacity = builder.opacity;
        stiffness = builder.stiffness;
        breathe = builder.breathe;
        waterproof = builder.waterproof;
        absorbent = builder.absorbent;
        windproof = builder.windproof;
        moistureResistant = builder.moistureResistant;
        shiny = builder.shiny;
        antibacterial = builder.antibacterial;
        heatResistant = builder.heatResistant;
        coldResistant = builder.coldResistant;
        acidResistant = builder.acidResistant;
        alcoholResistant = builder.alcoholResistant;
        alkaliResistant = builder.alkaliResistant;
        mineralOilResistant = builder.mineralOilResistant;
        recyclable = builder.recyclable;
    }

    public String getmatName(){
        return matName;
    }
    
    public String getToughness() {
        return toughness;
    }

    public String getWeight() {
        return weight;
    }

    public String getOpacity() {
        return opacity;
    }

    public String getStiffness() {
        return stiffness;
    }

    public String getBreathe() {
        return breathe;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public boolean isAbsorbent() {
        return absorbent;
    }

    public boolean isWindproof() {
        return windproof;
    }

    public boolean isMoistureResistant() {
        return moistureResistant;
    }

    public boolean isShiny() {
        return shiny;
    }

    public boolean isAntibacterial() {
        return antibacterial;
    }

    public boolean isHeatResistant() {
        return heatResistant;
    }

    public boolean isColdResistant() {
        return coldResistant;
    }

    public boolean isAcidResistant() {
        return acidResistant;
    }

    public boolean isAlcoholResistant() {
        return alcoholResistant;
    }

    public boolean isAlkaliResistant() {
        return alkaliResistant;
    }

    public boolean isMineralOilResistant() {
        return mineralOilResistant;
    }

    public boolean isRecyclable() {
        return recyclable;
    }

    @Override
    public String toString() {
        return "Material{" + "Material=" + matName
                + ", toughness=" + toughness
                + ", weight=" + weight 
                + ", opacity=" + opacity 
                + ", stiffness=" + stiffness 
                + ", breathe=" + breathe 
                + ", waterproof=" + waterproof 
                + ", absorbent=" + absorbent 
                + ", windproof=" + windproof 
                + ", moistureResistant=" + moistureResistant 
                + ", shiny=" + shiny 
                + ", antibacterial=" + antibacterial 
                + ", heatResistant=" + heatResistant 
                + ", coldResistant=" + coldResistant 
                + ", acidResistant=" + acidResistant 
                + ", alcoholResistant=" + alcoholResistant 
                + ", alkaliResistant=" + alkaliResistant 
                + ", mineralOilResistant=" + mineralOilResistant 
                + ", recyclable=" + recyclable 
                + '}';
    }
    
    
    
    public static class Builder{
    
        private String matName;
        private String toughness = "Not answered"; //soft or hard
        private String weight = "Not answered";    //light or heavy
        private String opacity = "Not answered";   //transparent or transulcent or opaque
        private String stiffness = "Not answered";//rigid or bendy or elastic
        private String breathe = "Not answered";   //breathable or nonbreathable
        private boolean waterproof;
        private boolean absorbent;
        private boolean windproof;
        private boolean moistureResistant;
        private boolean shiny;
        private boolean antibacterial;
        private boolean heatResistant;
        private boolean coldResistant;
        private boolean acidResistant;
        private boolean alcoholResistant;
        private boolean alkaliResistant;
        private boolean mineralOilResistant;
        private boolean recyclable;
        
        public Builder(String val){
            this.matName = val;
        }

        public Builder toughness (String toughness1){
            toughness = toughness1;
            return this;
        }
        
        public Builder weight (String weight1){
            weight = weight1;
            return this;
        }
        
        public Builder opacity (String opacity1){
            opacity = opacity1;
            return this;
        }
        
        public Builder stiffness (String stiffness1){
            stiffness = stiffness1;
            return this;
        }
        
        public Builder breathe (String breathe1){
            breathe = breathe1;
            return this;
        }
        
        public Builder waterproof (boolean waterproof1){
            waterproof = waterproof1;
            return this;
        }
        
        public Builder absorbent (boolean absorbent1){
            absorbent = absorbent1;
            return this;
        }
        
        public Builder windproof (boolean windproof1){
            windproof = windproof1;
            return this;
        }
        
        public Builder moistureResistant (boolean val){
            moistureResistant = val;
            return this;
        }
        
        public Builder shiny (boolean val){
            shiny = val;
            return this;
        }
        
        public Builder antibacterial (boolean val){
            antibacterial = val;
            return this;
        }
        
        public Builder heatResistant (boolean val){
            heatResistant = val;
            return this;
        }
        
        public Builder coldResistant (boolean val){
            coldResistant = val;
            return this;
        }
        
        public Builder acidResistant (boolean val){
            acidResistant = val;
            return this;
        }
        
        public Builder alcoholResistant (boolean val){
            alcoholResistant = val;
            return this;
        }
        
        public Builder alkaliResistant (boolean val){
            alkaliResistant = val;
            return this;
        }
        
        public Builder mineralOilResistant (boolean val){
            mineralOilResistant = val;
            return this;
        }
        
        public Builder recyclable (boolean val){
            recyclable = val;
            return this;
        }
        
        public Material build(){
            return new Material(this);
        }
    }
    
}
