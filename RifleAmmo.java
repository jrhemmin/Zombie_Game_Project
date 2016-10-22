/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jensenhemming
 */
public class RifleAmmo extends Bullets{
//------------------------------------------------------------------------------
//Sets attributes for the 308 caliber ammo for the Rifle
//------------------------------------------------------------------------------        
    private final String ammoType = "308cal";
    private final int ammoSpeed = 8; 
    private final int damage = 9;

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
