import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    private String nivel;
    private static final float BONIFICACAO_GERENTE = 0.15f;
    public Gerente(String nome, float salario, String nivel){
        super(nome,salario);
        this.nivel = nivel;
    }
    
    @Override
    public float getBonificacao() {
        return this.getSalario() * BONIFICACAO_GERENTE;
    }
}