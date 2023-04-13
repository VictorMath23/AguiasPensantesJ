/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacao;

import Conexao.ConectBD;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Proposta;
import java.sql.ResultSet;
import java.util.Calendar;
import modelo.Usuario;

/**
 *
 * @author vsilva18
 */
public class Dao {

    private ConectBD nova_Conexao = new ConectBD();
    private Connection conn;

    private int id;
    private String dono;
    private String propostax;
    private String area_id;
    private String beneficio_id;
    private String gestor_id;
    private Date data_ideia;
    private String status;

    public boolean cadastra_Proposta(Proposta proposta) {

        PreparedStatement stmt = null;

        String sql = "INSERT INTO firsts.ideia VALUES (?,?,?,?,?,?,?,?)";

        try {

            stmt = nova_Conexao.conectBD().prepareStatement(sql);

            stmt.setNull(1, 0);
            stmt.setString(2, dono = proposta.getDono());
            stmt.setString(3, propostax = proposta.getProposta());
            stmt.setString(4, area_id = proposta.getArea_id());
            stmt.setString(5, beneficio_id = proposta.getBeneficio_id());
            stmt.setString(6, gestor_id = proposta.getGestor_id());
            Calendar calendar = Calendar.getInstance();
            java.sql.Timestamp timestamp = new java.sql.Timestamp(calendar.getTimeInMillis());
            stmt.setTimestamp(7, timestamp);
            stmt.setString(8, status = proposta.getStatus());

            stmt.execute();

            return true;

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Dados!\n"
                    + "Por favor, verificar os dados da sua ideia e tentar Novamente.");
            System.out.println(sqle.getMessage());

            return false;
        } finally {
            System.out.println(stmt);
            nova_Conexao.desconectBD();
        }
    }

    public List lista_Proposta() {

        String sql = "SELECT ideia.id,ideia.dono,ideia.proposta,area.area,beneficio.beneficio,gestor.nome,ideia.data_ideia,ideia.status,TIMESTAMPDIFF(DAY,data_ideia,NOW()) as dias FROM ideia\n" +
"INNER JOIN area ON area_id = area.id \n" +
"INNER JOIN beneficio ON Beneficio_id = beneficio.id\n" +
"INNER JOIN gestor ON gestor_id = gestor.id ORDER BY dias DESC; ";

        List<Proposta> retorno_Proposta = new ArrayList<>();

        try {

            PreparedStatement stmt = nova_Conexao.conectBD().prepareStatement(sql);

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {

                Proposta ideia = new Proposta();

                ideia.setId(resultado.getInt("ideia.id"));
                ideia.setDono(resultado.getString("ideia.dono"));
                ideia.setProposta(resultado.getString("ideia.proposta"));
                ideia.setArea_id(resultado.getString("area.area"));
                ideia.setBeneficio_id(resultado.getString("beneficio.beneficio"));
                ideia.setGestor_id(resultado.getString("gestor.nome"));
                ideia.setData_ideia(resultado.getDate("ideia.data_ideia"));
                ideia.setStatus(resultado.getString("ideia.status"));
                ideia.setDias(resultado.getInt("dias"));

                retorno_Proposta.add(ideia);
            }

            return retorno_Proposta;
           

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Falha ao Carregar Tabela!");
            System.out.println(sqle.getMessage());

        } finally {
            
            nova_Conexao.desconectBD();
        }

        return null;
    }
    
    public List pesquisa_Ideia( String donoquest){
        
        String sql = "SELECT ideia.id,ideia.dono,ideia.proposta,area.area,beneficio.beneficio,gestor.nome,ideia.data_ideia,ideia.status,TIMESTAMPDIFF(DAY,data_ideia,NOW()) as dias FROM ideia\n" +
"INNER JOIN area ON area_id = area.id \n" +
"INNER JOIN beneficio ON Beneficio_id = beneficio.id\n" +
"INNER JOIN gestor ON gestor_id = gestor.id WHERE dono LIKE '%" + donoquest + "%' ORDER BY dias DESC ";
        List<Proposta> retorno_Proposta = new ArrayList<>();
        
        try {
                    
            PreparedStatement stmt = nova_Conexao.conectBD().prepareStatement(sql);
        
            ResultSet resultado = stmt.executeQuery();
        
            while (resultado.next()) {
                
                Proposta ideia = new Proposta();
                
                ideia.setId(resultado.getInt("ideia.id"));
                ideia.setDono(resultado.getString("ideia.dono"));
                ideia.setProposta(resultado.getString("ideia.proposta"));
                ideia.setArea_id(resultado.getString("area.area"));
                ideia.setBeneficio_id(resultado.getString("beneficio.beneficio"));
                ideia.setGestor_id(resultado.getString("gestor.nome"));
                ideia.setData_ideia(resultado.getDate("ideia.data_ideia"));
                ideia.setStatus(resultado.getString("ideia.status"));
                ideia.setDias(resultado.getInt("dias"));
                
                
                retorno_Proposta.add(ideia);   
            }
            return retorno_Proposta;
            
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Falha ao Encontrar sua ideia!");
            System.out.println(sqle.getMessage());
        }
        finally{
            System.out.println(retorno_Proposta);
            nova_Conexao.desconectBD();
        }
        return null;
    }
    
    public Usuario buscarEmail(String email){
       
    String sql = "SELECT * FROM firsts.gestor WHERE email = ? and comite = 'Y'";
    
    Usuario usuario = null;
    
    try {
        PreparedStatement stmt = nova_Conexao.conectBD().prepareStatement(sql);
        stmt.setString(1, email); // define o valor do primeiro parâmetro como o valor do e-mail
        ResultSet resultado = stmt.executeQuery();
        
        while (resultado.next()) {
            usuario = new Usuario();
            usuario.setEmail(resultado.getString("email"));
            usuario.setMatricula(resultado.getInt("matricula"));
        }
        
        return usuario;
    } catch (SQLException sqle) {
        System.out.println(sqle.getMessage());
    } finally {
        System.out.println();
        nova_Conexao.desconectBD();
    }
    
    return null;
}
    
    public List lista_PropostaAdmin() {

        String sql = "SELECT ideia.id,ideia.dono,ideia.proposta,area.area,beneficio.beneficio,gestor.nome,ideia.data_ideia,ideia.status,TIMESTAMPDIFF(DAY,data_ideia,NOW()) as dias FROM ideia\n" +
"INNER JOIN area ON area_id = area.id \n" +
"INNER JOIN beneficio ON Beneficio_id = beneficio.id\n" +
"INNER JOIN gestor ON gestor_id = gestor.id WHERE status = 'Analise' ORDER BY dias DESC; ";
        String sl2 = "SELECT TIMESTAMPDIFF(DAY, data_ideia, NOW()) as dias FROM firsts.ideia;";

        List<Proposta> retorno_Proposta = new ArrayList<>();

        try {

            PreparedStatement stmt = nova_Conexao.conectBD().prepareStatement(sql);

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {

                Proposta ideia = new Proposta();

                ideia.setId(resultado.getInt("ideia.id"));
                ideia.setDono(resultado.getString("ideia.dono"));
                ideia.setProposta(resultado.getString("ideia.proposta"));
                ideia.setArea_id(resultado.getString("area.area"));
                ideia.setBeneficio_id(resultado.getString("beneficio.beneficio"));
                ideia.setGestor_id(resultado.getString("gestor.nome"));
                ideia.setData_ideia(resultado.getDate("ideia.data_ideia"));
                ideia.setStatus(resultado.getString("ideia.status"));
                ideia.setDias(resultado.getInt("dias"));

                retorno_Proposta.add(ideia);
            }

            return retorno_Proposta;
           

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Falha ao Carregar Tabela!");
            System.out.println(sqle.getMessage());

        } finally {
            
            nova_Conexao.desconectBD();
        }

        return null;
    }
    
    public void atualizaStatus(String status, int id){
        
        PreparedStatement stmt = null;
    String sql = "UPDATE firsts.ideia SET status = ? WHERE id = ?"; 
    
    try {
        stmt = nova_Conexao.conectBD().prepareStatement(sql);
        stmt.setString(1, status);
        stmt.setInt(2, id);
        stmt.executeUpdate();
    } catch (SQLException sqle) {
        JOptionPane.showMessageDialog(null, "Erro ao Atualizar Dados!\n"
                                                       + "Por favor, verificar os dados que queira aleterar e tentar Novamente.");
        System.out.println(sqle.getMessage());
    } finally {
        nova_Conexao.desconectBD();
    }
    }
          
    }


