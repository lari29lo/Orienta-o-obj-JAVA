
class Pessoa {
    private String Nome;
    private int Idade;
    public void DefinirNome (String Nome){
    this.Nome = Nome;
    }

    public void DefinirIdade (int Idade){
    this.Idade = Idade;
   }
}

class Professor extends Pessoa{
    private String Formacao;
    private int CargaHoraria;
    public void DefinirFormacao (String Formacao){
    this.Formacao = Formacao;
    }
    public void DefinirCargaHoraria(int CargaHoraria){
        this.CargaHoraria = CargaHoraria;
    }
    public float CalcularSalario(){
    float S  = 45 * this.CargaHoraria;
    return (S);
            }
}

class Aluno extends Pessoa{
    private String Curso;
    public void DefinirCurso (String X){
    this.Curso = Curso;
    }
public String ObterCurso(){
    return (this.Curso);
}

public Aluno (String Nome, int Idade){
this.DefinirNome (Nome);
this.DefinirIdade (Idade);
    }
}


public class Heranca { 
    public static void main (String[] args){
    System.out.println("hello world");
    Aluno A = new Aluno ("Ronaldo Nazaro", 45);
    A.DefinirNome("Marcelo Eustáquio");
    A.DefinirIdade(40);
    A.DefinirCurso("ciência da computação");
    }
}

class Animal {
    public String Nome;
    public String Raca;
    public Animal (){}
    public Animal (String Nome){}
    public String Caminha (){
        return ("caminhando...");
    }
}

class Cachorro extends Animal {
    public String Late (){
        return ("au au...");
    }
}

class Gato extends Animal {
    public String Mia (){
        return ("miau...");
    }
    public Gato(){}
}

Animal X = new Animal();
Animal Y = new Animal("Totó³...");
Y.Mia(); // isso geraria um ERRO

Gato G = new Gato();
    G.Nome;
    G.Mia();
      