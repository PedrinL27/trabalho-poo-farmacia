package entidades;

public class Funcionario extends Pessoa {
  private int registroFuncionario;
  private double salario;

  Funcionario(String nome, int idade, String genero, String cpf, int registroFuncionario, double salario) {
    super.setNome(nome);
    super.setIdade(idade);
    super.setGenero(genero);
    super.setCpf(cpf);
  }
  
}
