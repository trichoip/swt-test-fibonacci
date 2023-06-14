/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.swt301.testng.servlet;

import com.swt301.testng.user.UserDAO;
import com.swt301.testng.user.UserDTO;
import com.swt301.testng.user.UserError;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author minh tri
 */
@WebServlet(urlPatterns = { "/CreateServlet" })
public class CreateServlet extends HttpServlet {

    private static final String ERROR = "createUser.jsp";
    private static final String SUCCESS = "login.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response ser let response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        UserError userError = new UserError();
        boolean checkValidation = true;
        UserDAO dao = new UserDAO();
        try {
            String userID = request.getParameter("userID");
            String fullName = request.getParameter("fullName");
            String roleID = request.getParameter("roleID");
            String password = request.getParameter("password");
            String confirm = request.getParameter("confirm");
            if (userID.length() > 10 || userID.length() < 2) {

                userError.setUserIDError("UserID must in [2-10]");
            }
            boolean checkDuplicate = dao.checkID(userID);
            if (checkDuplicate) {

                userError.setUserIDError("duplicate userid");

            }
            if (fullName.length() > 100 || fullName.length() < 5) {
                checkValidation = false;
                userError.setFullNameError("full name must be in [5,100]");
            }
            if (!password.equals(confirm)) {
                checkValidation = false;
                userError.setConfirmError("hai password khong giong nhau");
            }
            if (checkValidation) {
                boolean checkInsert = dao.insertV2(new UserDTO(userID, fullName, password, roleID, true));
                // boolean checkInsert = dao.insert(new UserDTO(userID, fullName, password,
                // roleID, true));
                if (checkInsert) {
                    url = SUCCESS;
                }
            } else {
                request.setAttribute("USER_ERROR", userError);
            }

        } catch (Exception e) {
            log("Error in CreateServlet: " + e.toString());
            if (e.toString().contains("duplicate")) {
                userError.setUserIDError("duplicate userID!!!");
                request.setAttribute("USER_ERROR", userError);
            }
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }
    //

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
    /**
     * Handles the HT P <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response ser let response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HT P <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response ser let response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
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
