/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jensenhemming
 */
public class Weapons {
//------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------
  
    private int damage; //damage weapon does
    private int capacity; //capacity of weapon
    private int reloadTime; //reload time
    private int rateFire; // rate of fire
    private int range; //range of weapon
    private String weaponName;
    private static int idNum;
    private String bulletType;
    
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
    
    public String GetBulletType(){
        return bulletType;
    }
}
