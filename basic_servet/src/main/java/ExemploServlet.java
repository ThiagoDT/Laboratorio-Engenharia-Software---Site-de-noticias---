import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet(urlPatterns={"/exemplo_01"})
public class ExemploServlet extends HttpServlet{	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(  HttpServletRequest req, 
						HttpServletResponse res){
		try{
			PrintWriter pw = res.getWriter();
			pw.write("{nome:'Thiago Dias', Projeto da materia de laboratorio de engenharia de software}");
			pw.close();
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}	
}