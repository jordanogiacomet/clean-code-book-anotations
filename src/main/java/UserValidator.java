public class Main {
  public static void main(String[] args) {}
  // Evite efeitos colaterais, sua funcao promete fazer apenas uma coisa mas faz varias outras escondidas;
// As vezes adicionara variaveis aos parametros passados, alteracoes inesperadas nas variaveis da propria classe;
  public class UserValidator {
    private Cryptographer cryptographer;

    public boolean checkPassword(String userName, String password) {
      User user = UserGateway.findByName(userName);
      if(user != User.NULL) {
        // Validacao de senha
        Session.initialize();
      }
    }
  }
}

// O efeito colateral dessa funcao e o Session.initialize(), a funcao diz no nome, chequa a senha, nao inicializa a sessao. Logo alguem que nao sabe que a funcao inicializa a sessao corre o risco de apagar os dados da sessao quando autenticar o usuario;

// Logo criamos um acoplamento sem sentido onde so podemos utilizar o check password quando for seguro inicializar a sessao; Logo isso se torna um efeito colateral que quebra o sentido de fazer so uma coisa; Mesmo parecendo que faz;

// A solucao nesse caso seria mudar o nome da funcao para deixar claro que inicializa ela, mas isso ainda quebra uma funcao fazer uma coisa so;