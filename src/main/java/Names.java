

public class Main {
  public static void main(String[] args) {
    int d; // Se um nome precisa de um comentário então ele não especifica nada;

    // Exemplo de nomes melhores //

    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    // Exemplo de um código ruim: //
  
  }

  // O código não tem expressões complexas, identação está correta, mas ele deixa coisas implicitas, o contexto não está explicito portanto ficam as perguntas: 

  // Que tipo de coisas estão em theList?
  // Por que queremos a posição zero de theList?
  // Por que o valor 4 é importante?
  // Como eu usaria a lista retornada?
  
  public List<int[]> getThem(){
    List<int[]> list1 = new ArrayList<int[]>();
    for(int[] x : theList)
      if(x[0] == 4)
        list1.add(x);
    return list1;
  }
  
  // Agora colocaremos um pouco de contexto no assunto: Esse é um jogo de campo minado, nosso tabuleiro é o theList, logo renomeamos ele para gameBoard. A posição zero guarda o valor de status e o valor 4 representa "marcado com uma bandeirinha", saber do contexto nos permite trazer muita qualidade ao código;

  public List<int[]> getFlaggedCells() {
    List<int[]> flaggedCells = new ArrayList<int[]>();
    for(int[] cell: gameBoard)
      if(cell[STATUS_VALUE] == FLAGGED)
        return flaggedCells.add(cell);
    return flaggedCells;
  }

  // Poderiamos criar uma classe para cell ao invés de usar um vetor, trazendo mais simplicidade ainda. Essa classe pode ter uma função que verifica se a cell está marcada com uma bandeinha ou não;

  public List <Cell> getFlaggedCells() {
    List<Cell> flaggedCells = new ArrayList<Cell>();
    for(Cell cell: gameBoard)
      if(cell.isFlagged())
        flaggedCells.add(cell);
    return flaggedCells;
  }

  // Logo chegamos a conclusão: Deixar claro o contexto e usar bons nomes é um grande passo inicial para deixar o código mais limpo;

  // Cuidado ao utilizar nomes ruins: hp pode parecer um nome bom para hipotenusa, mas querendo ou não pode vir a ser mal interpretado;

  // Outro exemplo válido, utilizar List em nomes de grupos sem necessáriamente estar utilizando uma List. List é algo especifico na programação, logo utilizar isso no nome pode vir a confundir o funcionamento do código, então se accountList não for uma List, é melhor colocar por exemplo: accounts, accountGroup...

  // Cuidado ao utilizar nomes muito parecidos

  // USAR NOMES DISTINTOS POR MAIS QUE O COMPILADOR FICAR SATISFEITO: 

  public static void copyChars(char a1[, char a2[]) {
    for(int i = 0; i < a1.length; i++) {
      a2[i] = a1[i];
    }
  }

  // Essa função só deixa claro que estamos copiando caracteres de um array para outro, mas não ficaria melhor se usassemos source e destination para o nome dos arrays?

  // Outro exemplo: Product | ProductInfo | ProductData -> São três classes distintas, mas não revelam nada por seus nomes, deixando vago qual a funcionalidade de cada classe;

  getActiveAccount();
  getActiveAccounts();
  getActiveAccountsInfo();

  // Como os programadores saberiam qual das funções chamar?

  // Outro tópico importante, crie nomes pronunciaveis: Estar discutindo com o time de desenvolvimento sobre váriáveis com nomes por exemplo: genymdhms; Não é o indicado.

  // Devemos utilizar o poder do ser humano de pronunciar, pois programar é uma atividade social;

  class DtaRcrd102 {
    private Date genymdhms;
    private Date modymdhms;
    private final String pszqint = "102";
  }

  class Customer {
    private Date generationTimestamp;
    private Date modificationTimestamp;
    private final String recordId = "102";
  }

  // Por incrivel que pareça a classe de cima foi implementada em uma empresa, então USE nomes pronunciáveis;

  // Use nomes passiveis de busca:

  // Em um cenário usando grep buscar o nome "MAX_CLASSES_PER_STUDENT" é fácil, mas pense em achar por exemplo algo que foi nomeado com somente uma letra, por exemplo "a";

  // Nomes longos se sobressaem na questão de busca;

  // Podemos usar letras como váriaveis, mas somente em escopos minusculos -> seguindo a regra quano maior o escopo maior a especificidade do nome;

  for(int j = 0; j < 34; j++) {
    s += (t[j] * 4) / 5;
  }

  // Como buscariamos essa funcionalidade acima? Não tem nada de especifico nela;

  int realDaysPerIdealDay = 4;
  const int WORK_DAYS_PER_WEEK = 5;
  int sum = 0;

  for(int j = 0; j < NUMBER_OF_TASKS; j++) {
    int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
    int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
    sum += realTaskWeeks;
  }

  // A funcionalidade implementada com nomes passíveis de busca deixa tudo mais sólido;

  // Interfaces e implementações: Preferir usar nomes como ShapeFactoryImp do que IShapeFactory;

  // Nomes de classes: Classes e objetos devem ter nomes com substantivos, como Customer, Account.

  // Meu teclado atualmente esta sem acento entao algumas regras de portugues nao vao ser seguidas;

  // Evitar nomes com senso de humor;

  HolyHandGranade(); // -> O dono dessa funcao sabe o que ela representa, porem, mesmo sendo engracado, deixa o codigo com uma qualidade ruim.

  DeleteItems(); -> // Esse seria o nome ideal para essa funcao que mostra que realmente a funcionalidade dela;

  // Selecione uma palavra por contexto, o que isso quer dizer? Digamos que eu tenha uma requisicao de dados; E errado em por exemplo um controller usar fetch, outro get e outro retrive. Ou seja escolha uma palavra para a aplicacao inteira;

  // Outro exemplo, usar a palavra controller, manager dentro da mesma funcao. Fica dificil de entender qual e cada coisa; 

  // Porem mesmo respeitando todos esse conceito de palavra, e preciso usar isso semanticamente, a palavra add precisa ter sua aplicacao igual em todos os pontos do codigo, se eu der um nome add para algo que nao respeite isso, eu estarei quebrando a semantica que eu mesmo estabeleci. Um exemplo valido e, temos diversas classes o qual o metodo add cria um valor novo por meio da concatenacao de dois valores existentes;

  // Agora criamos uma nova classe que adiciona valores ao fim de um array, pode parecer contra intuitivo nao usar add aqui, mas como criamos uma semantica para classes anteriores, deveriamos usar um nome como insert ou append;

  // Preferir nomes tecnicos a nomes a partir do dominio do problema;

  // Ex: 

  // UserRepository, um programador sabe qual o uso do padrao entao logo e um nome aceitavel para ser nomeado;

  // Nomes por si so nao costumam expressar contexto;

  // As variaveis 

  String firstName;
  String lastName;
  String street;
  int houseNumber;

  // Juntas podemos entender que seu contexto e de um endereco, mas se estivessem separadas nao entenderiamos, envolver elas numa classe ajudaria a entender o contexto;

  class Address {
    private String firstName;
    private String lastName;
    private String street;
    private int houseNumber;
  }

  // A funcao a seguir nao deixa claro o contexto a partir do nome, deixando isso para o resto do codigo, o que tambem e errado:

  private void printGuessStatistics(char candidate, int count) {
    String number;
    String verb;
    String pluralModifier;

    if(count == 0) {
      number = "no";
      verb = "are";
      pluralModifier = "s";
    } else if (count == 1) {
      number = "1";
      verb = "is";
      pluralModifier = "";
    } else {
      number = Integer.toString(count);
      verb = "are";
      pluralModifier = "s";
    }

    String guessMessage = string.format("There %s% %s %s$%s", verb, number, candidate, pluralModifier); 
  }

  // Alem de ser extensa, suas variaveis sao muito utlizadas, precisei ler 3 vezes para entender o que fazia a funcao, o ideal nesse caso e implementar uma classe e tornar cada um dos ifs em uma funcao, e fazendo a verificacao por eles, ficaria muito mais legivel;

  public class GuessStatisticsMessage {
    private String number;
    private String verb;
    private String pluralModifier;

    public String make(char candidate, int count){
      createPluralDependentMessageParts(count);
      return String.format(
        "There %s %s %s%s", verb, number, candidate, pluralModifiere)
    }

    private void createPluralDependentMessageParts(int count) {
      if(count == 0) {
        thereAreNoLetters();
      } else if(count == 1) {
        thereIsNoLetters();
      } else {
        thereAreManyLetters(count);
      }
    }

    private void thereAreManyLetters(int count) {
      number = Integer.toString(count);
      verb = "are";
      pluralModifier = "s";
    }

    private void thereIsNoLetter(){
      number = "1";
      verb = "is";
      pluralModifier = "";
    }

    private void thereAreNoLetters() {
      number = "no";
      verb = "are";
      pluralModifier = "s";
    }
  }
}

