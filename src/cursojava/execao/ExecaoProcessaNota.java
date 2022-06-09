package cursojava.execao;

public class ExecaoProcessaNota extends Exception{
    public ExecaoProcessaNota(String erro){
        super("erro no processamento nas notas do aluno!!!!!! "+erro);
    }
}
