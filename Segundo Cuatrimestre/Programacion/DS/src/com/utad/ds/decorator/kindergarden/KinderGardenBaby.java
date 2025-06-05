package com.utad.ds.decorator.kindergarden;

public class KinderGardenBaby {
	private String name;
	private String nickname;
	private Integer age;
	private BaseComponent baseComponent;
	public KinderGardenBaby(String name, Integer age) {
		this(name, name, age);
	}
	public KinderGardenBaby(String name, String nickname, Integer age) {
		this.name = name;
		this.nickname = nickname;
		this.age = age;
		this.baseComponent = new StickerComponent(nickname);
	}
	public String getDescription() {
		return this.baseComponent.getDescription();
	}
	public void setBaseComponent(BaseComponent baseComponent) {
		this.baseComponent = baseComponent;
	}
	public BaseComponent getBaseComponent() {
		return this.baseComponent;
	}
	public String getName() {
		return this.name;
	}
	public Integer getAge() {
		return this.age;
	}
	@Override
	public String toString() {
		return this.nickname;
	}
}
