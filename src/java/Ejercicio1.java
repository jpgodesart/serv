/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author al037721
 */
@WebServlet(urlPatterns = {"/Ejercicio1"})
public class Ejercicio1 extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ejercicio1 at " + request.getContextPath() + "</h1>");
            out.println("<table border = '1' solid>");
            out.println("<tr>");
            out.println("<th>Metodo</th>");
            out.println("<th>URI</th>");
            out.println("<th>Protocolo</th>");
            out.println("<th>Path</th>");
            out.println("<th>Direccion y Host</th>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + request.getMethod() + "</td>");
            out.println("<td>" + request.getRequestURI() + "</td>");
            out.println("<td>" + request.getProtocol() + "</td>");
            out.println("<td>" + request.getRequestURI() + " " + request.getPathInfo() + "</td>");
            out.println("<td>" + request.getRemoteAddr() + "</td>");
            out.println("</tr>");
            out.println("</table><br/><br/>");
            out.println("<table border = '1' solid>");

            Enumeration headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String headerName = (String) headerNames.nextElement();
                out.println("<tr><th>" + headerName + "</th>");
                out.println("<td>" + request.getHeader(headerName) + "</td></tr>");
            }
            out.println("</table>");

            out.println("<h1>Parte 3</h1>");
            
            out.println("<FORM action='' method='post'>");
            out.println("<LABEL for='nombre'>Nombre: </LABEL>");
            out.println("<INPUT type='text' id='nombre'><BR>");
            out.println("<INPUT type='submit' value='Send'> <INPUT type='reset'>");
            out.println("</FORM>");
   
            
            
            
            
            if (request.getMethod() == "POST") {
                Enumeration parametros = request.getParameterNames();
                while (parametros.hasMoreElements()) {
                    out.println(request.getParameter(parametros.nextElement().toString()));
                    out.println("Parámetro de tipo POST");
                }
                } else if (request.getMethod() == "GET") {
                Enumeration parametros = request.getParameterNames();
                while (parametros.hasMoreElements()) {
                    out.println(request.getParameter(parametros.nextElement().toString()));
                    out.println("Parámetro de tipo GET");
                }
                
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
