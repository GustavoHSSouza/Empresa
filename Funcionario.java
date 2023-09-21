public class Funcionario {
    private String nome;
    private float salario;
    private static int contador=0;
    private int id;
    private boolean status;
    protected static final float BONIFICACAO = 0.10f;

    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
        this.id = contador;
        contador += 1;
        this.status = true;
    }
    public void mostrarDetalhes(){
        System.out.println("id: "+ this.id);
        System.out.println("nome: "+ this.nome);
        System.out.println("salario: "+ this.salario);
        System.out.println("status: "+ this.status);
    }

    public float getSalario(){
        return this.salario;
    }
    public float getBonificacao(){
        return this.salario * BONIFICACAO;
    }
    public int getID(){
        return id;
    }
}
