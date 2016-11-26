package com.zombie.game;


/**
 *
 * @author jensenhemming
 */
public class CrossBow extends Weapon {
//------------------------------------------------------------------------------
//Sets the attributes for the crossbow in the game, FUTURE IMPLEMENTATION
//------------------------------------------------------------------------------    
    private final int damage = 4; //damage weapon does
    private int capacity = 1; //capactiy of the crossbow
    private final int reloadTime = 2; //future implementation
    private final int rateFire = 3; //future implementation
    private final int range = 15; //future implementation
    private final String weaponName = "Crossbow"; //weapons name
    private static final int idNum = 2; //weapons id
    private final String ammoType = "Arrow"; //weapons ammo type
    
    public String SetName(){
        return weaponName;	//sets weapon name to be called from the weapons class
    }
   
    public int SetidNum(){
        return idNum;	//sets ID number to be called from the weapons class
    }
    
    public int SetDamage(){
        return damage;	//sets damage to be called from the weapons class
    }
    
    public int SetReloadTime(){
        return reloadTime;	//sets reload time of weapon to be called from the weapons class
    }
    
    public int SetWeaponRate(){
        return rateFire;		//sets rate of fire of weapon to be called from the weapons class
    }
    
    public int SetRange(){
        return range;		//sets range of fire for weapon to be called from the weapons class
    }
    
    public String SetBulletType(){
        return ammoType;		//sets type of ammo needed
    }
    
    public int Reload(int capacity, int i){
        while(capacity > 0 ){ //while loop, while the capacity is more than 0
            return capacity;  //return the capacity and can keep firing
        }
        if(capacity == 0){ //once capacity is 0, must reload to weapons capacity
            for (i=0; i < reloadTime; i++){
                return i;
            }
            if(i == reloadTime){		//if i is equal to the reload time, reload the weapon
                while (capacity <= 1){		
                    int reload = capacity++;
                }
        }
        }
        return capacity;
    }
    public int Fire(int i){
        
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