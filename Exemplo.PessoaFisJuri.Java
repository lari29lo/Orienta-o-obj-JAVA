
package abstrata.exemplo;

class Pessoa{    //classe Mãe
    private String Nome;
    private String Data;
    private String Endereco;
    private float  ValorCompra;
    
    public void setNome (string Nome){
        this.Nome= Nome;  
    }
    public void setData (string Endereco){
        this.Data = Data;
    }
    public void setEndereco (string Endereco){
       this.Endereco = Endereco;
    }
    public void setValorCompra (string Endereco){
        this.ValorCompra = ValorCompra; }
     
  
    public void setNome(String Nome){}
    public void setData (String Data){}
    public void setEndereco (String Endereço){}
    public void setValorCompra (String ValorCompra){}
            
    public String getNome () {
    return (this.Nome); }
    
    public String getData () {
    return (this.Data); }
    
    public String getEndereco (){
    return (this.Endereco);  }
 
    public void getValorCompra(){
    return (this.ValorCompra); }

class PessoaFisica extends Pessoa{
    private String CPF;
    public void setCPF (String CPF){
    this.CPF = CPF; }
    public String getCPF(){
    return (this.CPF); }
    
    
PessoaFisica(String Nome, String Data, String Endereco, float ValorCompra, String CPF ){  
/* essa classe é um construtor*/  
this.setNome (Nome);
this.setData (Data);
this.setEndereco (Endereco);
this.setValorCompra (ValorCompra);
this.setCPF (CPF);
    }   
    public boolean Verificar(){
        return (true); }
    
 
class PessoaJuridica extends Pessoa{ 
    
}
    private String CNPJ;
    public void setCNPJ(String CNPJ){}
    public String getCNPJ(){
    return (this.CNPJ);
    }
    
    
PessoaFisica(String Nome, String Data, String Endereco, float ValorCompra, String CNPJ ){
    
this.setNome (Nome);
this.setData (Data);
this.setEndereco (Endereco);
this.setValorCompra (ValorCompra);
this.setCNPJ (CNPJ);
}

 public boolean Verificar(){
 return (true);  }

   
public class Exemplo  Java 
    public static void main (String [] args){
     // Pessoa X = new Pessoa();  aqui está errado porque pessoa teria q ser abstrata
     
PessoaFisica X = new PessoaFisica ("Neymar", "05/02/1992", "Paris", 12000.00 , "123.456.789-09");
    }
}
