package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrimeiraClasse {
    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("digite seu login");
        String senha = JOptionPane.showInputDialog("digite sua senha");

        if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

            List<Aluno> alunos = new ArrayList<Aluno>();

            //é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores tambem
            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


            for (int qtd = 1; qtd <= 5; qtd++) {
                //Aluno é instancia do objeto(classe) aluno.
                //aluno1 é uma referência para o objeto Aluno
                Aluno aluno1 = new Aluno();

                //pede os dados para o usuário e seta nos atributos do objeto aluno
                aluno1.setNome(JOptionPane.showInputDialog("qual é seu nome, aluno " + qtd + "?"));
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

            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

            //listando alunos aprovados reprovados e recuperação
            for (Aluno aluno : alunos) {
                if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);
                } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
                    maps.get(StatusAluno.REPROVADO).add(aluno);
                }
            }
            System.out.println("--------------------------Lista dos Alunos Aprovados--------------------------------------");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média = " + aluno.getMediaNota());
            }
            System.out.println("----------------------Lista dos Alunos em recuperação--------------------------------------");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média = " + aluno.getMediaNota());
            }
            System.out.println("--------------------------Lista dos Alunos Reprovados--------------------------------------");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média = " + aluno.getMediaNota());
            }


            for (Aluno aluno : alunos) {

                if (aluno.getNome().equalsIgnoreCase("diogo")) {

                    alunos.remove(aluno);
                    break;
                } else {
                    System.out.println(aluno);
                    System.out.println("Média do aluno = " + aluno.getMediaNota());
                    System.out.println("Resultado = " + aluno.getAlunoAprovado2());
                    System.out.println("----------------------------------------------------------------------------------------------------");
                }
            }
            for (Aluno aluno : alunos) {
                System.out.println("Alunos que sobraram na lista.");
                System.out.println(aluno.getNome());
                System.out.println("sua matérias são!");

                //percorrendo a lista de disciplinas
                for (Disciplina disciplina : aluno.getDisciplinas()) {
                    System.out.println(disciplina.getDisciplina());
                }
            }
            //percorrendo a lista de alunos
            for (int pos = 0; pos < alunos.size(); pos++) {
                Aluno aluno = alunos.get(pos);

                //substituição de objeto em uma lista
                if (aluno.getNome().equalsIgnoreCase("alex")) {
                    Aluno trocar = new Aluno();
                    trocar.setNome(JOptionPane.showInputDialog("Novo nome do aluno."));

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(JOptionPane.showInputDialog("Nova disciplina"));
                    disciplina.setNota(Integer.parseInt(JOptionPane.showInputDialog("Nova nota")));

                    trocar.getDisciplinas().add(disciplina);
                    alunos.set(pos, trocar);
                    aluno = alunos.get(pos);
                }

                System.out.println("Aluno = " + aluno.getNome());
                System.out.println("Média do aluno = " + aluno.getMediaNota());
                System.out.println("Resultado = " + aluno.getAlunoAprovado2());

                //percorrendo a lista de disciplinas
                for (Disciplina disc : aluno.getDisciplinas()) {
                    System.out.println("Matéria = " + disc.getDisciplina() + "Nota = " + disc.getNota());
                }
                System.out.println("----------------------------------------------------------------------------------------------------");
            }

        }
    }
}
