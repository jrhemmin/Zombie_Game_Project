/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jensenhemming
 */
public class PistolAmmo extends Bullets {
//------------------------------------------------------------------------------
//Sets attributes for the 9mm ammo for the Pistol
//------------------------------------------------------------------------------    
    private final String ammoType = "9mm";
    private final int ammoSpeed = 8; 
    private final int damage = 8;

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
