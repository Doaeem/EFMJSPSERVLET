package com.ismo.crjj.efm.Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ismo.crjj.efm.beans.Etablissement;
import com.ismo.crjj.efm.idao.DAOEtablissement;
import com.ismo.crjj.efm.idao.IDao;

/**
 * Servlet implementation class ControllerServlets
 */
@WebServlet("/ControllerServlets")
public class ControllerServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	IDao<Etablissement> etablissement = new DAOEtablissement();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  IDao<Etablissement> etablissementDao = new DAOEtablissement();
	        List<Etablissement> etablissements = etablissementDao.getAll();

	        response.setContentType("text/html");

	        PrintWriter out = response.getWriter();
	        out.println("<html><body>");
	        out.println("<h1>Liste des établissements</h1>");
	        out.println("<ul>");
	        for (Etablissement etablissement : etablissements) {
	            out.println("<li>" + etablissement.getNom_Etab() + " - " + etablissement.getAdresse_etab() + "</li>");
	        }
	        out.println("</ul>");
	        out.println("</body></html>");

	        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
