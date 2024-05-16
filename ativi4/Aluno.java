
public class Aluno {
    private Integer RA;
    private String nome;
    private String curso;
    private String endereco;

    public Aluno(Integer RA, String nome, String curso, String endereco) {
        this.RA = RA;
        this.nome = nome;
        this.curso = curso;
        this.endereco = endereco;
    }

    public Integer getRA() {
        return RA;
    }

    public void setRA(Integer RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void exibirDados(){
        System.out.println("RA: "+this.RA);
        System.out.println("Nome: "+this.nome);
        System.out.println("Curso: "+this.curso);
        System.out.println("Endereço: "+this.endereco);
    }

    public String trocaCurso(String curso){
        this.curso = curso;
        return this.curso;
    }

    public String trocaEndereco(String endereco){
        this.endereco = endereco;
        return this.endereco;
    }
}

