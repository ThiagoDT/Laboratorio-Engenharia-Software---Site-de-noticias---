package outros;

public class Calculadora {
 
    private IOperador operacao;
    public Calculadora(){
       
    }
    private void gerenciarOperacao(String operador){
        if(operador.equals("Adicao")){
                operacao= new Somar();
            }
            else if(operador.equals("Subtracao")){
                operacao= new Subtrair();
            }
            else if(operador.equals("Multiplicacao")){
                operacao= new Multiplicar();
            }else{
                operacao= new Dividir();
            }
    }
    public String gerarResultado(float n1,float n2,String operador){
        gerenciarOperacao(operador);
        return operacao.resultado(n1, n2);
    }
    
}