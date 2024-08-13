public class Main {
  public static void main(String[] args) {
  


  }

  // E dificil criar uma estrutura de switch pequena, pois mesmo dois blocos de case sao maiores do que uma funcao deveria ser;
  // Um switch que fala apenas uma coisa tambem e dificil/mesma coisa com if e else;
  // Infelizmente nao conseguimos evitar o use de switch case todos as vezes. Mas podemos garantir que o switch esta em uma classe de baixo nivel e nunca e repetido, utilizando o polimorfismo;
  // Implementaremos uma das operacoes que podem depender de funcionarios;

  public Money calculatePay(Employee e) throws InvalidEmployeeType {
    switch (e.type) {
      case COMISSIONED:
        return calculateComissionPay(e);
      case HOURLY:
        return calculateHourlyPay(e);
      case SALARIED:
        return calculateSalariedPay(e);
      default: 
        throw new InvalidEmployeeType(e.type);
    }
  }

  // Essa funcao tem varios problemas, ela e grande, quando se adiciona novos funcionarios ela vai crescer ainda mais;
  // Ela faz mais de uma coisa, violando o principio da responsabilidade unica; Determina o tipo, calcula e retorna o erro;
  // E viola o principio OCP por poder crescer demais;

  // Mas o principal e o tamanho que teremos ilimitado de funcoes parecidas;

  // O ideal e criar uma estrututra switch ao fundo de uma abstract factory;

  // O switch ficara responsavel por criar somente instancias; e as funcoes sao enviadas de forma polimorfica para o tipo de funcionario;

  // Switchs devem aparecer somente na criacao de objetos polimorficos;

  public abstract class Employee {
    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);

    public interface EmployeeFactory {
      public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
    }
  }

  public class EmployeeFactoryImpl implements EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType{
      switch(r.type) {
          return newComissionedEmployee;
      default: 
          throw new InvalidEmployeeType(e.type);
      }
    }
  }

  // Parametros de funcao: A quantidade ideal de parametros e zero, depois vem um, dois e tres. Tres deve ser muito especial e mesmo assim nao deveriam ser usados;

  // Um parametro pode dar a impressao de ser um detalhe muito importante e tirar o foco da funcao
}