package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Product;
import service.ProductService;


@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<models.Cart> cart = ProductService.getCart(); 	
		
		String totalPrice = ProductService.getTotalPrice(); 
		
		String locale = ProductService.getLocale(); 

		request.setAttribute("cart", cart);
		request.setAttribute("totalPrice", totalPrice);
		request.setAttribute("locale", locale);

		request.getRequestDispatcher("cart.jsp").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
