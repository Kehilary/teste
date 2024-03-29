
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.cefetmg.altomare.dao-mysql.ConexaoDB;
import java.sql.Connection;
import br.cefetmg.altomare.dao-mysql.DadosForms;

/**
 *
 * @author KEHILARY
 */
@WebServlet(urlPatterns = {"/InserirPassageiro"})
public class InserirPassageiro extends HttpServlet import IPassageiro{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            String nome = request.getParameter("nome");
            String dataNascimento = request.getParameter("dataNascimento");
            String sexo = request.getParameter("sexo");
            String cpf = request.getParameter("cpf");
            String rg = request.getParameter("rg");
            String civil = request.getParameter("civil");
            String email = request.getParameter("email");
            String telefone = request.getParameter("telefone");
            String medico = request.getParameter("medico");
            String pacote = request.getParamenter("pacote");
            long despesa = 0;
            String senha;
            gerarSenha() = senha;
            
            InserirDadosPassageiro(pacote, despesa, cpf,  rg, nome, dataNascimento, email, senha,  telefone, sexo, civil);
            
            
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroPassageiroBD</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastroPassageiroBD at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
