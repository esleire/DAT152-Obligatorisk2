package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Product;
import service.ProductService;
/**
 * Servlet implementation class Product
 */
@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String locale = ProductService.getLocale(); 
		List<Product> productList = ProductService.getProducts(); 
		

		request.setAttribute("productList", productList);
		request.setAttribute("locale", locale);

		request.getRequestDispatcher("Products.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String txtPno = request.getParameter("pno"); 
		int pno = Integer.parseInt(txtPno); 
		
		ProductService.addToCart(pno);
		response.sendRedirect(request.getContextPath() + "/Products");

	}

}
