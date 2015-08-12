/**
 * 
 */
package fr.vaur.test.resteasy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author	Xavier Devilliers
 * @since	0.1	
 * @version	0.1
 */

@WebServlet("/")
public class servlet extends HttpServlet 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2685751045269894298L;
	
	/**
	 *  Return "doGet" to the client
	 */
	@Override 
	public void	doGet(HttpServletRequest http_request, HttpServletResponse http_response) throws IOException
	{
		println(http_response, "doGet");
	}

	/**
	 *  Return "doPost" to the client
	 */
	
	@Override
	public void		doPost(HttpServletRequest http_request, HttpServletResponse http_response) throws IOException
	{
		println(http_response, "doPost");
	}

	private void println( HttpServletResponse http_response, String str) throws IOException
	{
		PrintWriter out;
		
		//http_response.setContentType("text/html");
		out = http_response.getWriter();
		out.println(str);
		System.out.println(str);
	}
}
