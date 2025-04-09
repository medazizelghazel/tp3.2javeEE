import test.Personne;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AjoutSrvlet
 */
public class AjoutSrvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutSrvlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String sex = request.getParameter("sex");
        int cpost = Integer.parseInt(request.getParameter("cpost"));

        Personne personne = new Personne(nom, prenom, sex ,cpost);

        HttpSession session = request.getSession();
        ArrayList<Personne> listePersonnes = (ArrayList<Personne>) session.getAttribute("listePersonnes");
        listePersonnes = new ArrayList<Personne>();
        

        listePersonnes.add(personne);
        session.setAttribute("listePersonnes", listePersonnes);
        request.getRequestDispatcher("Affichage.jsp").forward(request, response);
 
	}

}
