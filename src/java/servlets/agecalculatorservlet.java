
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre
 */
public class agecalculatorservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String inputAge = request.getParameter("age");
        request.setAttribute("age", inputAge);
        
        if(inputAge != null && inputAge.length() != 0){
        try {
            int age = Integer.parseInt(inputAge);
            int nextAge = age + 1;
            request.setAttribute("message","Your age next birthday will be "+nextAge);
        }catch(NumberFormatException e){
            request.setAttribute("message","Please enter a valid number. i.e 1...2...3");
        }  
        } else{
            request.setAttribute("message","You must give your current age.");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        
    }


}
