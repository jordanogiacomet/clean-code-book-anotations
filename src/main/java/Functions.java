public class Main {
  public static void main(String[] args) {

    
  
  }

  // Esse e um exemplo de uma funcao desorganizada; com idas e vindas no codigo e variaveis desorganizadas;
  
  public static String testableHtml(PageData pageData, boolean includeSuiteSetup) throws Exception {
    Wikipage wikiPage = pageData.getWikiPage();
    StringBuffer buffer = new StringBuffer();

    if(pageData.hasAttribute("test")) {
      if(includeSuiteSetup) {
        WikiPage suiteSetup = PageCrawlerImpl.....
      }
    }
  }

  // Durante 3 minutos codando ela eu nao entendi nada que ela quis dizer;
  // Ha strings estranhas e chamadas de funcoes esquisitas misturadas com ifs alinhados;

  // E possivel refatorar essa funcao: 

  public static String RenderPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite) throws new Exception {
    boolean isTestPage = pageData.hasAttribute("test");
    if(isTestPage) {
      WikiPage testPage = pageData.getWikiPage();
      StringBuffer newPageContent = new StringBuffer();
      includeSetupPages(testPage, newPageContent, isSuite);
      newPageContent.append(pageData.getContent());
      includeTeardownPages(testPage, newPageContent, isSuite);
      pageData.setContent(newPageContent.toString());
    }
      return pageData.getHtml();
  }

  // Essas duas funcoes provam para nos que mesmo sem saber a tecnologia, se uma funcao for bem escrita, ela pode ser entendida por pessoas de fora;

  // Nao existe uma regra sobre escrever funcoes; Mas o ideal e que elas sejam pequenas;

  // As duncoes devem ser pequenas e contar sua historia; Mesmo sendo dificil as vezes, 20/30 linhas deveria ser o ideal para uma funcao;

  // Portanto podemos reescrever uma terceira vez o HtmtUtil.java:

  public static String renderPageWithSetupsAndTeardowns(PageData pageData, bolean isSuite) throws Exception {
    if(isTestPage(pageData)) {
      includeSetupAndTeardownPages(pageData, isSuite);
    }
    return pageData.getHtml();
  }

 // Levamos de licao que se bem escrita uma funcao pode ser quebrada em diversas funcoes pequenas, que vao se juntando, deixando o codigo extremamente mais legivel;

// Blocos e identacao: if, else, while -> devem ter apenas uma linha. Possivelmente uma chamada de funcao; A funcao dentro do bloco pode receber um nome descritivo;
// O nivel de identacao de uma uma funcao deve ser um ou dois 
    //
      //
  // As funcoes devem fazer apenas uma coisa e fazer bem ela e apenas fazer ela;

  // Nas funcoes que vimos acima fica dificil ver o que ela faz, pois visivelmente ela faz tres coisas: Determina se e uma pagina de testes; Se for, inclui setUps e TearDows e depois exibe uma pagina em HTML;

  // Vamos descrever o que ela faz com a palavra TO:
  // TO RenderPageWithSetupsAndTeardowns -> Vefificamos se e uma pagina de testes, se for, incluimos setups e teardowsn, e em amos os casos retornamos um html;
  // Se a funcao faz essas coisas apenas um nivel abaixo de identacao, entao quer dizer que ela esta fazendo somente uma coisa.
  // Escrever uma funcao ja esta relacionado a decompor um conceito maior; Entao dentro delas mesmas isso tambem faz sentido;
  // Uma forma de saber se uma funcao faz ou nao mais de uma coisa e que voce pode extrair outra funcao a partir dela a partir de seu nome que nao seja uma reformulacao de implementacao;

  // Segundo chat gtp: 

  // Funcoes devem realizar somente uma tarefa; 

  // Dentro do SOLID temos o principio a responsabilidade unica;

  // Se uma funcao faz mais de uma coisa ela pode ser dividia em duas ou mais funcoes; cada uma responsavel por sua tarefa em especifico:

// Teste de extracao de funcao: Para ver se uma funcao esta fazendo mais de uma coisa? Posso tentar extrair uma parte do codigo e dar um nome a essa nova funcao. Se eu conseguir fazer isso sem que o novo nome seja apenas uma reformulacao da funcao isso indica que a funcao estava fazendo mais de uma coisa:

// Exemplo pratico

    function validateUser(user) {
        if (!user.name || !user.email) {
            throw new Error('Invalid user data');
        }
    }

  // Agora eu daria o nome da funcao: validade ->

    function validateUser(user) {
        if (!user.name || !user.email) {
            throw new Error('Invalid user data');
        }
    }

  // Agora -> save:

    function saveUser(user) {
        database.save(user);
    }

    function validateAndSaveUser(user) {
        validateUser(user);
        saveUser(user);
    }

    // O criterio e, se a funcao fizer sentido por si so entao a funcao mae fazia mais de uma coisa;

  
}