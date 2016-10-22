/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jensenhemming
 */
public class BowAmmo extends Bullets {
//------------------------------------------------------------------------------
//Sets attributes for the arrow for the crossbow
//------------------------------------------------------------------------------    
    private final String ammoType = "Arrow";
    private final int ammoSpeed = 8; //plan on changing this, just a filler for now
    private final int damage = 4;

    public String SetAmmoType(){
         return ammoType;
    }
 
    public int SetAmmoSpeed(){
         return ammoSpeed;
    }
    public int SetDamage(){
         return damage;
    }
}

