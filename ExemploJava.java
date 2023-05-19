
package abstrata.exemplo;

abstract class Pessoa{    //classe Mãe
    private String Nome;
    private String Data;
    private String Endereco;
    private float  ValorCompra;
    
    public void setNome(String Nome){}
    public void setData (String Data){}
    public void setEndereco (String Endereço){}
    public void setValorCompra (String ValorCompra){}
            
    public String getNome;
    public String getData;
    public String getEndereço;
    public String getValorCompra;  
}

class PessoaFisica extends Pessoa{
    private String CPF;
    public void setCPF (String CPF){}
    public String getCPF(){}
}

class PessoaJuridica extends Pessoa{
    private String CNPJ;
    public void setCPF (String CPF){}
    public String getCNPJ(){}
}

public class ExemploJava {
    public static void main (String [] args){
        
     Pessoa X = new Pessoa();      
        
    }
}
