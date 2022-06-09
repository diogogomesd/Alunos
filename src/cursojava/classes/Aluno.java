package cursojava.classes;

import cursojava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//classe que representa o aluno
public class Aluno extends Pessoa{

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

     private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    //construtor do objeto
    public Aluno(){}

    //getters e setters
    //getters serve para recuperar os dados inseridos nos atributos
    //setters serve para inserir dados nos atributos
    public String getNome() {
        return super.nome;
    }

    public void setNome(String nome) {
        super.nome = nome;
    }

    public int getIdade() {
        return super.idade;
    }

    public void setIdade(int idade) {
        super.idade = idade;
    }

    public String getDataNascimento() {
        return super.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        super.dataNascimento = dataNascimento;
    }

    public String getNumeroRg() {
        return super.numeroRg;
    }

    public void setNumeroRg(String numeroRg) {
        super.numeroRg = numeroRg;
    }

    public String getNumeroCpf() {
        return super.numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        super.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return super.nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        super.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return super.nomePai;
    }

    public void setNomePai(String nomePai) {
        super.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    //método que retorna nota do aluno
    public double getMediaNota(){
        double somaNotas = 0.0;
        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }
        return somaNotas/disciplinas.size();
    }
    //método que retorna true ou false para aluno aprovado ou reprovado
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if(media >= 70){
            return true;
        }
        else {
            return false;
        }
    }
    //método que retorna a String se o aluno está aprovado ou reprovado
    public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if(media >= 50){
            if (media >= 70) {
                return StatusAluno.APROVADO;
            } else {
                return StatusAluno.RECUPERACAO;
            }
                
            } else {
            return StatusAluno.REPROVADO;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return dataMatricula.equals(aluno.dataMatricula) && nomeEscola.equals(aluno.nomeEscola) && serieMatriculado.equals(aluno.serieMatriculado) && disciplinas.equals(aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataMatricula, nomeEscola, serieMatriculado, disciplinas);
    }

    @Override
    public boolean pessoaMaiorIdade() {
        return idade >= 21;
    }

    @Override
    public boolean autenticar() {
        return false;
    }

    public String msgMaiorIdade(){
        return this.pessoaMaiorIdade() ? "oba vc é maior de idade " : "vixe vc é menor de idade";
    }
}
