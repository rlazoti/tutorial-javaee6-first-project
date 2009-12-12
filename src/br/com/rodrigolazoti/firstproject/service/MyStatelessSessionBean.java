package br.com.rodrigolazoti.firstproject.service;

import javax.ejb.Stateless;

@Stateless
public class MyStatelessSessionBean {

	public String createMessage( String username ) {
		String message = "Hello World, ";

		if ( username != null && !"".equals( username.trim() ) ) {
			message += username + "!";
		}
		else {
			message += "stranger!";
		}

		return message;
	}

}