/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jensenhemming
 */
public class Rifle{
//------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------    
    private final int damage = 3; //damage subject to change
    private int capacity = 6; //can hold 6 bullets
    private final int reloadTime = 6; //6 seconds to reload
    private final int rateFire = 1; // fires one bullet per sec
    private final int range = 12; //range of 12 feet
    private final String weaponName = "Rifle"; 
    
    public String GetName(){
        return weaponName;
    }
    
    public int GetDamage(){
        return damage;
    }
    
    public int GetReloadTime(){
        return reloadTime;
    }
    
    public int GetWeaponRate(){
        return rateFire;
    }
    
    public int GetRange(){
        return range;
    }
    public int Reload(int capacity){
        while(capacity > 0 ){
            return capacity;
        }
        if(capacity == 0){
            while (capacity <= 6){
           int reload = capacity++;
            }
        }
        return capacity;
    }
    public int Fire(){
        while(capacity > 0){
            capacity--;
        }
        return capacity;
    }
}
