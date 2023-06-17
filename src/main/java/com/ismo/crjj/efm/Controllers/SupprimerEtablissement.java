package com.ismo.crjj.efm.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ismo.crjj.efm.beans.Etablissement;
import com.ismo.crjj.efm.idao.DAOEtablissement;

/**
 * Servlet implementation class SupprimerEtablissement
 */
@WebServlet("/SupprimerEtablissement")
public class SupprimerEtablissement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerEtablissement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int etablissementId = Integer.parseInt(request.getParameter("id"));
		    
		    DAOEtablissement dao = new DAOEtablissement();
		    
		    Etablissement etablissementToDelete = dao.getOne(etablissementId);
		    
		    if (etablissementToDelete != null) {
		        dao.delete(etablissementToDelete);
		        
		        response.sendRedirect("AffichEtablissement.jsp");
		    } else {
		        response.sendRedirect("AffichEtablissement.jsp?error=1");
		    }
	}

}
