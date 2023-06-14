/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.swt301.testng.servlet;

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
@WebServlet(urlPatterns = { "/MainControllerServlet" })
public class MainControllerServlet extends HttpServlet {

    private static final String LOGIN_PAGE = "login.jsp";
    private static final String LOGIN_SERVLET = "LoginServlet";
    private static final String SEARCH_SERVLET = "SearchServlet";
    private static final String LOGOUT_SERVLET = "LogoutServlet";
    private static final String LOGIN = "login";
    private static final String LOGOUT = "logout";
    private static final String SEARCH = "search";
    private static final String DELETE = "delete";
    private static final String DELETE_SERVLET = "DeleteServlet";
    private static final String UPDATE = "update";
    private static final String UPDATE_SERVLET = "UpdateServlet";
    private static final String CREATE = "create";
    private static final String CREATE_SERVLET = "CreateServlet";
    private static final String ADD = "add";
    private static final String ADD_SERVLET = "AddServlet";
    private static final String VIEW = "view";
    private static final String VIEW_PAGE = "viewCart.jsp";
    private static final String EDIT = "edit";
    private static final String EDIT_SERVLET = "EditServlet";
    private static final String REMOVE = "remove";
    private static final String REMOVE_SERVLET = "RemoveServlet";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = LOGIN_PAGE;
        try {
            String action = request.getParameter("action");
            if (LOGIN.equals(action)) {
                url = LOGIN_SERVLET;
            }
            if (SEARCH.equals(action)) {
                url = SEARCH_SERVLET;
            }
            if (LOGOUT.equals(action)) {
                url = LOGOUT_SERVLET;
            }
            if (DELETE.equals(action)) {
                url = DELETE_SERVLET;
            }
            if (UPDATE.equals(action)) {
                url = UPDATE_SERVLET;
            }
            if (CREATE.equals(action)) {
                url = CREATE_SERVLET;
            }
            if (ADD.equals(action)) {
                url = ADD_SERVLET;
            }
            if (VIEW.equals(action)) {
                url = VIEW_PAGE;
            }
            if (EDIT.equals(action)) {
                url = EDIT_SERVLET;
            }
            if (REMOVE.equals(action)) {
                url = REMOVE_SERVLET;
            }

        } catch (Exception e) {
            log("Error in MainControllerServlet: " + e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
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
