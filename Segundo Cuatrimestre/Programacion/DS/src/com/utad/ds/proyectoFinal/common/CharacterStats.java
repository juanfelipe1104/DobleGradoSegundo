package com.utad.ds.proyectoFinal.common;

public class CharacterStats {
	private String name; //nombre
	private Integer strength;   //Ataque fisico
	private Integer magic;    //Ataque magico
	private Integer physicalDef;	//Defensa fisica
	private Integer magicDef; 	//Defensa magica
	private Integer speed;
	private Integer MaxHP;
	private Integer HP;		//Puntos de vida
	private Integer MaxMP;
	private Integer MP;		//Puntos de magia, se consumen al usar ataques magicos
	//Mejoras para ataque, magia y la accion de defenderse
	private Integer atkBoost;
	private Integer magicBoost;
	private Integer	guardBoost;
	private Boolean guarding;
	private Boolean reflecting;
	private Integer guardingPercentage;
	private Boolean canAttack;
	public CharacterStats(String name,Integer strengh,Integer magic,Integer physicalDef,Integer magicDef,Integer speed,Integer MaxHP,Integer MaxMP){
		this.name = name;
		this.strength = strengh;
		this.magic = magic;
		this.physicalDef = physicalDef;
		this.magicDef = magicDef;
		this.speed = speed;
		this.MaxHP = MaxHP;
		this.HP = this.MaxHP;
		this.MaxMP = MaxMP;
		this.MP = this.MaxMP;
		this.atkBoost =0;
		this.guardBoost =0;
		this.guardBoost =0;
		this.guarding = false;
		this.reflecting = false;
		this.guardingPercentage =0;
		this.canAttack = true;
	}
	
	public void increaseStats(Double increasement) {
		this.strength = (int)(this.strength*increasement);
		this.magic = (int)(this.magic*increasement);
		this.physicalDef = (int)(this.physicalDef*increasement);
		this.magicDef = (int)(this.magicDef*increasement);
		this.speed = (int)(this.speed*increasement);
		this.MaxHP = (int)(this.MaxHP*increasement);
		this.MaxMP = (int)(this.MaxMP*increasement);
		this.HP = this.MaxHP;
		this.MP = this.MaxMP;
	}
	
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name;}
	
	public Integer getStrength() {	return this.strength;	}
	public void setStrength(Integer strength) {	this.strength = strength;	}
	
	public Integer getMagic() {	return this.magic;	}
	public void setMagic(Integer magic) {	this.magic = magic;	}
	
	public Integer getPhysicalDef() {	return this.physicalDef;	}
	public void setPhysicalDef(Integer physicalDef) {	this.physicalDef = physicalDef;	}
	
	public Integer getMagicDef() {	return this.magicDef;	}
	public void setMagicDef(Integer magicDef) {	this.magicDef = magicDef;	}
	
	public Integer getSpeed() {	return this.speed;	}
	public void setSpeed(Integer speed) {	this.speed = speed;	}
	
	public Integer getMaxHP() {	return this.MaxHP;	}
	public void setMaxHP(Integer maxHP) {	MaxHP = maxHP;	}
	
	public Integer getHP() {	return this.HP;	}
	public void setHP(Integer HP) {	this.HP = HP;	}
	
	public Integer getMaxMP() {	return this.MaxMP;	}
	public void setMaxMP(Integer maxMP) {	MaxMP = maxMP;	}
	
	public Integer getMP() {	return this.MP;	}
	public void setMP(Integer mP) {	MP = mP;	}
	
	public Integer getAtkBoost() {	return this.atkBoost;	}
	public void setAtkBoost(Integer atkBoost) {	this.atkBoost = atkBoost;	}
	
	public Integer getMagicBoost() {	return this.magicBoost;	}
	public void setMagicBoost(Integer magicBoost) {	this.magicBoost = magicBoost;	}
	
	public Integer getGuardBoost() {	return this.guardBoost;	}
	public void setGuardBoost(Integer guardBoost) {	this.guardBoost = guardBoost;	}
	
	public Boolean getGuarding() {	return this.guarding;	}
	public void setGuarding(Boolean guarding) {	this.guarding = guarding;	}
	
	public Boolean getReflecting() {	return this.reflecting;	}
	public void setReflecting(Boolean reflecting) {	this.reflecting= reflecting;	}
	
	public Integer getGuardingPercentage()  {	return this.guardingPercentage;	}
	public void setGuardingPercentage(Integer guardingPercentage) {	this.guardingPercentage= guardingPercentage;	}
	
	public Boolean getCanAttack() {	return this.canAttack;	}
	public void setCanAttack(Boolean canAttack) {	this.canAttack = canAttack;	}
	@Override
	public String toString() {
		return this.name + "\n"
				+ "Strength: " + this.strength + " Magic: " + this.magic + " Defense: " + this.physicalDef + " MagicDefense: " + this.magicDef + "\n"
				+ "HP: " + this.HP + " Mana: " + this.MP + " Speed: " + this.speed + "\n"
				+ "MaxHP: " + this.MaxHP + " MaxMana: " + this.MaxMP;
	}
}

