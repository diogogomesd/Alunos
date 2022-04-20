package cursojava.executavel;

import cursojava.classes.Aluno;

import javax.swing.*;

public class PrimeiraClasse {
    public static void main(String[] args){

        //Aluno é instancia do objeto(classe) aluno.
        //aluno1 é uma referência para o objeto Aluno
        Aluno aluno1 = new Aluno();
        aluno1.setNome(JOptionPane.showInputDialog("qual é seu nome"));

    }
}
