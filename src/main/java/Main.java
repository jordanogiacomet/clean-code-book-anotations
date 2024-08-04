

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

  
  
}

