package com.utad.ds.decorator.kindergarden;

public class CertificateRewardComponent extends RewardComponent {
	public static final String DEFAULT_CERTIFICATE = " con premio de buena conducta pañal";
	private String certificate;
	public CertificateRewardComponent(BaseComponent baseComponent) {
		this(baseComponent, CertificateRewardComponent.DEFAULT_CERTIFICATE);
	}
	public CertificateRewardComponent(BaseComponent baseComponent, String certificate) {
		super(baseComponent);
		this.certificate = certificate;
	}
	@Override
	public String getDescription() {
		return super.baseComponent.getDescription() + this.certificate;
	}
}
