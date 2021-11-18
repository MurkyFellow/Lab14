/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


/**
 *
 * @author 000728303
 */
public class MaterialTest {
    
    
    @Test
    public void testMaterial1() {
        Material rubber = new Material.Builder("Rubber")
                .toughness("soft")
                .weight("Heavy")
                .opacity("Opaque")
                .stiffness("Rigid")
                .breathe("nonbreathable")
                .waterproof(true)
                .recyclable(false)
                .build();
        System.out.println(rubber);
        assertEquals("Material{Material=Rubber, "
                + "toughness=soft, "
                + "weight=Heavy, "
                + "opacity=Opaque, "
                + "stiffness=Rigid, "
                + "breathe=nonbreathable, "
                + "waterproof=true, "
                + "absorbent=false, "
                + "windproof=false, "
                + "moistureResistant=false, "
                + "shiny=false, "
                + "antibacterial=false, "
                + "heatResistant=false, "
                + "coldResistant=false, "
                + "acidResistant=false, "
                + "alcoholResistant=false, "
                + "alkaliResistant=false, "
                + "mineralOilResistant=false, "
                + "recyclable=false}",
                rubber.toString());
    }
    
    @Test
    public void testMaterial2() {
        Material rubber = new Material.Builder("")
                .build();
        System.out.println(rubber);
        assertEquals("Material{Material=, "
                + "toughness=Not answered, "
                + "weight=Not answered, "
                + "opacity=Not answered, "
                + "stiffness=Not answered, "
                + "breathe=Not answered, "
                + "waterproof=false, "
                + "absorbent=false, "
                + "windproof=false, "
                + "moistureResistant=false, "
                + "shiny=false, "
                + "antibacterial=false, "
                + "heatResistant=false, "
                + "coldResistant=false, "
                + "acidResistant=false, "
                + "alcoholResistant=false, "
                + "alkaliResistant=false, "
                + "mineralOilResistant=false, "
                + "recyclable=false}",
                rubber.toString());
    }

    @Test
    public void testMaterial3() {
        Material rubber = new Material.Builder("Wood")
                .toughness("hard")
                .weight("heavy")
                .opacity("Opaque")
                .stiffness("Rigid")
                .breathe("breathable")
                .waterproof(false)
                .absorbent(true)
                .windproof(true)
                .moistureResistant(false)
                .shiny(false)
                .antibacterial(false)
                .heatResistant(false)
                .coldResistant(false)
                .acidResistant(false)
                .alcoholResistant(false)
                .alkaliResistant(false)
                .mineralOilResistant(true)
                .recyclable(true)
                .build();
        System.out.println(rubber);
        assertEquals("Material{Material=Wood, "
                + "toughness=hard, "
                + "weight=heavy, "
                + "opacity=Opaque, "
                + "stiffness=Rigid, "
                + "breathe=breathable, "
                + "waterproof=false, "
                + "absorbent=true, "
                + "windproof=true, "
                + "moistureResistant=false, "
                + "shiny=false, "
                + "antibacterial=false, "
                + "heatResistant=false, "
                + "coldResistant=false, "
                + "acidResistant=false, "
                + "alcoholResistant=false, "
                + "alkaliResistant=false, "
                + "mineralOilResistant=true, "
                + "recyclable=true}",
                rubber.toString());
    }
    
    @Test
    public void testMaterial4() {
        Material rubber = new Material.Builder("PCP pipe")
                .toughness("Hard")
                .stiffness("Rigid")
                .shiny(false)
                .alkaliResistant(true)
                .build();
        System.out.println(rubber);
        assertEquals("Material{Material=PCP pipe, "
                + "toughness=Hard, "
                + "weight=Not answered, "
                + "opacity=Not answered, "
                + "stiffness=Rigid, "
                + "breathe=Not answered, "
                + "waterproof=false, "
                + "absorbent=false, "
                + "windproof=false, "
                + "moistureResistant=false, "
                + "shiny=false, "
                + "antibacterial=false, "
                + "heatResistant=false, "
                + "coldResistant=false, "
                + "acidResistant=false, "
                + "alcoholResistant=false, "
                + "alkaliResistant=true, "
                + "mineralOilResistant=false, "
                + "recyclable=false}",
                rubber.toString());
    }
    
    @Test
    public void testMaterial5() {
        Material rubber = new Material.Builder("Stainless Steel")
                .toughness("Hard")
                .weight("Heavy")
                .opacity("Opaque")
                .stiffness("Rigid")
                .waterproof(true)
                .windproof(true)
                .moistureResistant(true)
                .shiny(true)
                .antibacterial(true)
                .alcoholResistant(true)
                .mineralOilResistant(true)
                .build();
        System.out.println(rubber);
        assertEquals("Material{Material=Stainless Steel, "
                + "toughness=Hard, "
                + "weight=Heavy, "
                + "opacity=Opaque, "
                + "stiffness=Rigid, "
                + "breathe=Not answered, "
                + "waterproof=true, "
                + "absorbent=false, "
                + "windproof=true, "
                + "moistureResistant=true, "
                + "shiny=true, "
                + "antibacterial=true, "
                + "heatResistant=false, "
                + "coldResistant=false, "
                + "acidResistant=false, "
                + "alcoholResistant=true, "
                + "alkaliResistant=false, "
                + "mineralOilResistant=true, "
                + "recyclable=false}",
                rubber.toString());
    }
}
