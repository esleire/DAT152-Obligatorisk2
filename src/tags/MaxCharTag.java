package tags;

import javax.servlet.jsp.tagext.*;

import models.Cart;
import models.Description;

import javax.servlet.jsp.*;
import java.io.*;
import service.ProductService;

public class MaxCharTag extends SimpleTagSupport {
	
	private int maxChar; 
	
	public void setMaxChar(int maxChar) {
		this.maxChar = maxChar; 
	}
	
	
	StringWriter sw = new StringWriter(); 
	public void doTag()
	
			throws JspException, IOException {
	      if (maxChar != 0) {
	         /* Use message from attribute */
	         for(Cart c : ProductService.cart) {
	 			for(Description d : c.getShortDescription()) {
	 				String shortDescription = d.getText().substring(0, Math.min(d.getText().length(), this.maxChar));
	 				d.setText(shortDescription);
	 			}

	 		}
	         
	      } else {
	         /* use message from the body */
	         getJspBody().invoke(sw);
	         getJspContext().getOut().println(sw.toString());
	      }
	   }
	
	
	
	/*
	
		for(Cart c : ProductService.cart) {
			for(Description d : c.getShortDescription()) {
				String shortDescription = d.getText().substring(0, Math.min(d.getText().length(), this.maxChar));
				d.setText(shortDescription);
			}

		}
		return SKIP_BODY; 
	}
	*/

}
