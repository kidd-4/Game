package decorator;

import enumclass.Enchantment;

public class Freezing extends WeaponDecorator{

	public Freezing(Weapon decoratedWeapon) {
		super(decoratedWeapon);
	}

	@SuppressWarnings("static-access")
	public void add(Enchantment enchantment){
		
		if(super.arrayList == null)
		super.add(enchantment);
		
		this.arrayList.add(enchantment);
	}
	
}