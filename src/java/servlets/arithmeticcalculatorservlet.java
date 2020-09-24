
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
public class arithmeticcalculatorservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message","Result: ---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int addedValue = 0; 
        int firstValueInt = 0;
        int secondValueInt = 0;
        String firstValueString = request.getParameter("firstValue");       
        String secondValueString = request.getParameter("secondValue");
        
        if(firstValueString != null && firstValueString.length() != 0){
            try{
                firstValueInt = Integer.parseInt(firstValueString);
            }catch(NumberFormatException e){
                request.setAttribute("message","Result: Invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            }
        }
        if(secondValueString != null && secondValueString.length() != 0){
            try{
                secondValueInt = Integer.parseInt(secondValueString);
            }catch(NumberFormatException e){
                request.setAttribute("message","Result: Invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            }
        } 
        
        String submit = request.getParameter("submit");
        switch(submit){
            
            case "+":
                addedValue = firstValueInt + secondValueInt;
                break;
            case "-":
                addedValue = (firstValueInt) - (secondValueInt);
                break;
            case "*":
                addedValue = firstValueInt*secondValueInt;
                break;
            case "%":
                addedValue = firstValueInt%secondValueInt;
                break;
        }
        
        request.setAttribute("message","Result: " +addedValue);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
        
}
}


