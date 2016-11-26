package com.zombie.game;

public class Weapon {
    private int damage; //damage weapon does
    private int capacity; //future implementation
    private int reloadTime; //future implementation
    private int rateFire; //future implementation
    private int range; //future implementation
    private String weaponName;
    private static int idNum; //gives weapon id number to be called
    private String bulletType; //bullet type the weapon uses
    
    public String GetName(){
        return weaponName;	//gets weapon name from one of the extending classes
    }
    
    public int GetDamage(){
        return damage;		//gets damage weapon does from one of the extending classes
    }
    
    public int GetReloadTime(){
        return reloadTime;		//gets reload time from one of the extending classes
    }
    
    public int GetWeaponRate(){
        return rateFire;		//gets rate of fire from one of the extending classes
    }
    
    public int GetRange(){
        return range;		//gets gets range of weapon from one of the extending classes
    }
    
    public String GetBulletType(){
        return bulletType;		//gets the type of bullet it requires
    }
}
