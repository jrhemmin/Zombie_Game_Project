package com.zombie.game;

/**
*
* @author jensenhemming
*/
public class BowAmmo extends Bullet {
	

//------------------------------------------------------------------------------
//Sets attributes for the arrow for the crossbow
//------------------------------------------------------------------------------    
   private final String ammoType = "Arrow";
   private final int ammoSpeed = 8; //speed ammo moves
   private final int damage = 4;	//dammage ammo does

   public BowAmmo(float x, float y, float rot, boolean isFriendly, float damage) {
	   super(x, y, rot, isFriendly, damage);
   }
   
   public String SetAmmoType(){ 	//sets ammo type of the weapon to be called by bullets class
        return ammoType;
   }
   public int SetAmmoSpeed(){	//sets the speed the ammo travels
        return ammoSpeed;	
   }
   public int SetDamage(){		//sets speed ammo travels, called by bullet class
        return damage;
   }
}
