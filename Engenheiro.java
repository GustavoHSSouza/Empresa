public class Engenheiro extends Funcionario{
    private String especialidade;
    private String nivel;
    public Engenheiro(String nome, float salario,String especialidade, String nivel){
        super(nome,salario);
        this.especialidade = especialidade;
        this.nivel = nivel;
    }
}
