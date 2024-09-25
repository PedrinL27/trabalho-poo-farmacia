package entidades;

public class Pessoa {
  protected String nome;
  private int idade;
  private String genero;
  private String cpf;

  public String getNome() {
    return nome;
  }
  protected void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }
  protected void setIdade(int idade) {
    this.idade = idade;
  }

  public String getGenero() {
    return genero;
  }
  protected void setGenero(String genero) {
    this.genero = genero;
  }

  public String getCpf() {
    return cpf;
  }
  protected void setCpf(String cpf) {
    this.cpf = cpf;
  }
}

