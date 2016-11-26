package com.zombie.game;

import com.badlogic.gdx.math.Vector2;

public class Bullet extends DynamicObject
{
	private boolean isFriendly; //who fired bullet, player or client
	private float damage;	//damage bullet does
	private String ammoType; // Future implementation
    private int ammoSpeed; // Future implementation
	
	public Bullet(float x, float y, float rot, boolean isFriendly, float damage)
	{
		super(x, y, rot);
		this.isFriendly = isFriendly;	//handles who fired the bullet, player or client
		this.damage = damage;
	}
	
	public boolean getFriendly()
	{
		return isFriendly;		//gets response,returns true/false based on who fired
	}
	
	public String getAmmoType(){
         return ammoType;		//gets ammo type from the ammo classes, future implementation
	}
	
	public int getAmmoSpeed(){
         return ammoSpeed;		//gets speed ammo travels, future implementation
	}
	
	public float getAmmoDamage(){
         return damage;		//gets the damage the ammo will do to the other player from the ammo classes
	}
	
	public void setDamage(float newDamage)
	{
		damage = newDamage;		
	}
}
