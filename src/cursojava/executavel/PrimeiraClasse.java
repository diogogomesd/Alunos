package cursojava.executavel;

import cursojava.classes.Aluno;

import javax.swing.*;

public class PrimeiraClasse {
    public static void main(String[] args){

        //Aluno é instancia do objeto(classe) aluno.
        //aluno1 é uma referência para o objeto Aluno
        Aluno aluno1 = new Aluno();

        //pede os dados para o usuário e seta nos atributos do objeto aluno
        aluno1.setNome(JOptionPane.showInputDialog("qual é seu nome?"));
        aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("qual sua idade?")));
        aluno1.setDataNascimento(JOptionPane.showInputDialog("qual sua data de nascimento?"));
        aluno1.setNumeroRg(JOptionPane.showInputDialog("qual o numero do seu RG?"));
        aluno1.setNumeroCpf(JOptionPane.showInputDialog("qual numero do seu cpf?"));
        aluno1.setNomeMae(JOptionPane.showInputDialog("qual o nome da sua mãe?"));
        aluno1.setNomePai(JOptionPane.showInputDialog("qual é o nome do seu pai?"));
        aluno1.setDataMatricula(JOptionPane.showInputDialog("em qual data voçê se matriculou?"));
        aluno1.setNomeEscola(JOptionPane.showInputDialog("qual o nome da sua escola?"));
        aluno1.setSerieMatriculado(JOptionPane.showInputDialog("em qual série está matriculado?"));

    }
}
