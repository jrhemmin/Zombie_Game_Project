/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jensenhemming
 */
public class Rifle extends Weapons {
//------------------------------------------------------------------------------
//Sets attributes for the rifle in the game
//------------------------------------------------------------------------------    
    private final int damage = 3; //damage subject to change
    private int capacity = 5; //can hold 5 bullets
    private final int reloadTime = 3; //3 seconds to reload
    private final int rateFire = 4; // fires one bullet per sec
    private final int range = 12; //range of 12 feet(?)
    private final String weaponName = "Hunting Rifle"; //the weapons name
    private static final int idNum = 1; //rifle id number
    private final String ammoType = "308cal"; //bullet type for rifle
    
    
    public String SetName(){
        return weaponName;
    }
    
    public int SetDamage(){
        return damage;
    }
    
    public int SetReloadTime(){
        return reloadTime;
    }
    
    public int SetWeaponRate(){
        return rateFire;
    }
    
    public int SetRange(){
        return range;
    }
     
    public String SetBulletType(){
        return ammoType;
    }
    
    public int Reload(int capacity, int i){
        while(capacity > 0 ){ //while loop, while the capacity is more than 0
            return capacity;  //return the capacity and can keep firing
        }
        if(capacity == 0){//once capacity is 0, must reload to weapons capacity
            for (i=0; i < reloadTime; i++){
                return i;
            }
            if(i == reloadTime){
            while (capacity <= 5){
                int reload = capacity++;
            }
        }
        return capacity;
        }
        return 0;
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

