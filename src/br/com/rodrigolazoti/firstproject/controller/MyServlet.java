package br.com.rodrigolazoti.firstproject.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rodrigolazoti.firstproject.service.MyStatefulSessionBean;
import br.com.rodrigolazoti.firstproject.service.MyStatelessSessionBean;

@WebServlet( name = "MyServlet", urlPatterns = { "/hello" } )
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = -2206981309178199835L;

	@EJB
	private MyStatefulSessionBean myStatefulSessionBean;

	@EJB
	private MyStatelessSessionBean myStatelessSessionBean;

	@Override
	protected void doGet( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException {
		String message = myStatelessSessionBean.createMessage( null );
		request.setAttribute( "message", message );

		int amountOfRequests = myStatefulSessionBean.getAmountOfrequests();
		request.setAttribute( "amountOfRequests", amountOfRequests );

		request.getRequestDispatcher( "/hello.jsp" ).forward( request, response );
	}

	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException {
		String username = request.getParameter( "username" );
		String message = myStatelessSessionBean.createMessage( username );
		request.setAttribute( "message", message );

		int amountOfRequests = myStatefulSessionBean.getAmountOfrequests();
		request.setAttribute( "amountOfRequests", amountOfRequests );

		request.getRequestDispatcher( "/hello.jsp" ).forward( request, response );
	}

}
