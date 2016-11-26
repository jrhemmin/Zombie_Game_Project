package com.zombie.game;

/**
*
* @author jensenhemming
*/
public class Pistol extends Weapon {
//------------------------------------------------------------------------------
//sets attributes for the pistol in the game
//------------------------------------------------------------------------------    
   private final int damage = 2; //damage
   private int capacity = 6; //future implementation
   private final int reloadTime = 3; //future implementation
   private final int rateFire = 3; //future implementation
   private final int range = 7; //future implementation
   private final String weaponName = "Pistol";  //weapon name
   private static final int idNum = 0; // weapon ID
   private final String ammoType = "9mm"; //weapon ammo type
   
   public String SetName(){
       return weaponName;  //sets weapon name to be called from the weapons class
   }
  
   public int SetidNum(){
       return idNum;	 //sets ID number to be called from the weapons class
   }
   
   public int SetDamage(){
       return damage;	//sets damage to be called from the weapons class
   }
   
   public int SetReloadTime(){
       return reloadTime;	//sets reload time to be called from the weapons class
   }
   
   public int SetWeaponRate(){
       return rateFire;		//sets rate of fire to be called from the weapons class
   }
   
   public int SetRange(){
       return range;		//sets weapon range to be called from the weapons class
   }
   
   public int Reload(int capacity,int i){
       while(capacity > 0 ){ //while loop, while the capacity is more than 0
           return capacity;  //return the capacity and can keep firing
       }
       if(capacity == 0){ //once capacity is 0, must reload to weapons capacity
           for (i=0; i < reloadTime; i++){
               return i;
           }
           if(i == reloadTime){			//if i equals reload time, reload the weapon
           while (capacity <= 6){
               int reload = capacity++;
           }
       }
       return capacity;
   }
       return 0;
   }
   
   public int Fire(int i){  //future implementation
       
       for(i = 0; i< rateFire; i++){ //will add 1 to i until i equals rateFire
           return i;
       }
       if(i == rateFire){ //when i equals rate of fire, shoot
           while(capacity > 0){
               capacity--; //when player shoots, subtract 1 from their capacity
       }
       return capacity; 
   }
       return 0;
   }
}