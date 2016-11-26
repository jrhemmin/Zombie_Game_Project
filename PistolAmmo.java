package com.zombie.game;

/**
*
* @author jensenhemming
*/
public class PistolAmmo extends Bullet {

//------------------------------------------------------------------------------
//Sets attributes for the 9mm ammo for the Pistol
//------------------------------------------------------------------------------   
   private final String ammoType = "9mm";
   private final int ammoSpeed = 8; //future implementation
   private final int damage = 2; // future implementation

   public PistolAmmo(float x, float y, float rot, boolean isFriendly, float damage) {
       super(x, y, rot, isFriendly, damage);
   }
   
   public String SetAmmoType(){  //sets ammo type of the weapon to be called by bullets class
        return ammoType;
   }
   
   public int SetAmmoSpeed(){  //sets the speed the ammo travels
        return ammoSpeed;
   }
   
   public int SetDamage(){   //sets speed ammo travels, called by bullet class
        return damage;
   }
}