//package Funcionarios.exerciciov1;
/*
- Implemente uma classe Departamento que contém vários funcionários e gerentes, com métodos para calcular o salário total e bonificações do departamento.
- Adicione validações para evitar operações inválidas, como remover um funcionário que não está na equipe de um gerente.
 */
import java.util.ArrayList;
import java.util.List;

public class Departamento {
      private List<Funcionario> funcionarios = new ArrayList<>();

    // Adiciona um funcionário ao departamento
    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public boolean removerFuncionario(int id){
        for(Funcionario funcionario:funcionarios){
            if(funcionario.getID()==id){
                this.funcionarios.remove(id);
                System.out.println("Funcionário removido da equipe");
                return true;
            }else{
                System.out.println("Funcionário não encontrado na equipe!");
                return false;
            }
        }
        return false;
    }

    // Calcula o salário total do departamento
    public float calcularSalarioTotal() {
        float total = 0.0f;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.getSalario();
        }
        return total;
    }

    // Calcula a bonificação total
    public float calcularBonificacaoTotal() {
        float total = 0.0f;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.getBonificacao();
        }
        return total;
    }
}
