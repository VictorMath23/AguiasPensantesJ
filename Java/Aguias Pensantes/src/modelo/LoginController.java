package modelo;

import implementacao.Dao;

/**
 * Classe responsável por controlar o login dos usuários.
 */
public class LoginController {
   
  private Dao usuarioDAO;

  // construtor que inicializa a variável usuarioDAO
  public LoginController(Dao usuarioDAO) {
    this.usuarioDAO = usuarioDAO;
  }

  /**
   * Método que realiza o login do usuário.
   * @param email o email do usuário
   * @param senha a senha do usuário
   * @return true se o login foi bem-sucedido, false caso contrário
   */
  public boolean login(String email, int matricula) {
    Usuario usuario = usuarioDAO.buscarEmail(email);
    if (usuario == null) {
        return false;
    }
    int matriculaDoUsuario = usuario.getMatricula();
    return matriculaDoUsuario == matricula;
}
}
