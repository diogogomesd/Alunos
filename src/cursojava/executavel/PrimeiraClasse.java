package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeiraClasse {
    public static void main(String[] args){

        List<Aluno> alunos = new ArrayList<Aluno>();

        for(int qtd = 1; qtd <= 2; qtd ++) {
            //Aluno é instancia do objeto(classe) aluno.
            //aluno1 é uma referência para o objeto Aluno
            Aluno aluno1 = new Aluno();

            //pede os dados para o usuário e seta nos atributos do objeto aluno
            aluno1.setNome(JOptionPane.showInputDialog("qual é seu nome, aluno "+qtd+"?"));
        /*aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("qual sua idade?")));
        aluno1.setDataNascimento(JOptionPane.showInputDialog("qual sua data de nascimento?"));
        aluno1.setNumeroRg(JOptionPane.showInputDialog("qual o numero do seu RG?"));
        aluno1.setNumeroCpf(JOptionPane.showInputDialog("qual numero do seu cpf?"));
        aluno1.setNomeMae(JOptionPane.showInputDialog("qual o nome da sua mãe?"));
        aluno1.setNomePai(JOptionPane.showInputDialog("qual é o nome do seu pai?"));
        aluno1.setDataMatricula(JOptionPane.showInputDialog("em qual data voçê se matriculou?"));
        aluno1.setNomeEscola(JOptionPane.showInputDialog("qual o nome da sua escola?"));
        aluno1.setSerieMatriculado(JOptionPane.showInputDialog("em qual série está matriculado?"));*/


            for (int pos = 1; pos <= 4; pos++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Qual nome da sua disciplina " + pos + " ?");
                double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Qual nota da sua disciplina " + pos + "?"));
                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(notaDisciplina);
                aluno1.getDisciplinas().add(disciplina);
            }
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover alguma disciplina?");

            if (escolha == 0) {

                int continuarRemover = 0;
                int posicao = 1;

                while (continuarRemover == 0) {

                    int disciplinaRemover = Integer.parseInt(JOptionPane.showInputDialog("Qual disciplina deseja remover, 1, 2 , 3 ou 4?"));
                    aluno1.getDisciplinas().remove(disciplinaRemover - posicao);
                    posicao++;
                    continuarRemover = JOptionPane.showConfirmDialog(null, "continuar a remover?");
                }
            }
            alunos.add(aluno1);
        }
        for (Aluno aluno: alunos) {
            System.out.println(aluno);
            System.out.println("Média do aluno = "+aluno.getMediaNota());
            System.out.println("Resultado = "+aluno.getAlunoAprovado2());
            System.out.println("----------------------------------------------------------------------------------------------------");
        }


    }
}
