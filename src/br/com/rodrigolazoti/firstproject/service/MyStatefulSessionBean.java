package br.com.rodrigolazoti.firstproject.service;

import javax.ejb.Stateful;

@Stateful
public class MyStatefulSessionBean {

	private int amountOfrequests = 0;

	public int getAmountOfrequests() {
		return ++amountOfrequests;
	}

}
