package DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Validators;

import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.CreditCard;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
