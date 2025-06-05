package com.utad.ds.decorator.kindergarden;

public abstract class RewardComponent implements BaseComponent {
	protected BaseComponent baseComponent;
	public RewardComponent(BaseComponent baseComponent) {
		this.baseComponent = baseComponent;
	}
}
