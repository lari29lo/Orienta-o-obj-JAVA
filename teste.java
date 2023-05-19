class CursoDeTi

class CienciaDaComputacao extends CursoDeTi
class EngenhariaDeSoftware extends CursoDeTi
class ADS extends CursoDeTi


// Class para determinar o total de alunos mais geral(classe pai ou mãe)

class ControleDeAlunos
    private int TotalDeAlunos = 0
    public void Registra (CursoDeTi X){ //´void´nao vai retornar nada e o parantese é para indicar que não recebe parâmetro
    System.out.println("Contabilizando números de alunos: ");
    this.TotalDeAlunos = this.TotalDeAlunos + X.getNumAlunos;
    }    
    public int getTotalDeAlunos () {
        return this.getTotalDeAlunos();
    }

// Na função principal
CienciaDaComputacao A = new CienciaDaComputacao()
EngenhariaDeSoftware B = new EngenhariaDeSoftware()
ADS C = new ADS ()





AULA DE HOJE 19/05

-Class abstrata: 
("É utilizado PARA SER HERDADA, ELA NÃO PODE SER INSTANCIADA POR UM OBJETO") 
("ELA SERVE DE APOIO PARA OUTRA CLASSE")

COMO CRIAR => coloca *abstract* antes da classe 


-Método abstrata: 
("vai ser implementada e a unica coisa é ser herdada")


// PROJETO FINAL: cada um escolhe o tema do projeto e em linguagem Java
// P1: vai ser dia 26/05 
// A1: vão ser as atividades de DNA e Exercício no AVA
