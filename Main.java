//package Funcionarios.exerciciov1;

public class Main {
    public static void main(String[] args) {
        Departamento financeiro = new Departamento();
        Departamento rh = new Departamento();
        Departamento ti = new Departamento();

        // Adicionando funcionários ao departamento
        Gerente gerenteMariana = new Gerente("Mariana", 10000.0f,"Senior");
        financeiro.adicionarFuncionario(new Funcionario("João", 5000.0f));
        rh.adicionarFuncionario(new Funcionario("Ana", 5000.0f));
        ti.adicionarFuncionario(new Funcionario("Carlos", 4500.0f));
        ti.adicionarFuncionario(new Funcionario("Lucia", 5500.0f));
        ti.adicionarFuncionario(new Engenheiro("Pedro", 7000.0f,"Infraestrutura","Senior"));
        ti.adicionarFuncionario(new Engenheiro("Ricardo", 8000.0f,"Software","Pleno"));
        ti.adicionarFuncionario(new Engenheiro("Elena", 5000.0f,"Telecominicação", "Senior"));
        ti.adicionarFuncionario(gerenteMariana);
        System.out.println("Salário Total do Departamento: " + ti.calcularSalarioTotal());
        System.out.println("Bonificação Total do Departamento: " + ti.calcularBonificacaoTotal());
        System.out.println("Bonificação do Gerente de TI:" + gerenteMariana.getBonificacao());
    }
}

