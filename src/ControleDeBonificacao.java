public class ControleDeBonificacao { //Criação da classe publica ControleDebonificação, abrindo com a cheve
    
    private double totalDeBonus; //criacao do Vetor totalDeBonus privado do tipo double

    public double getTotalDeBonus(){ // criacao do método getTotalDeBonus do tipo double, abrindo com a chave
        return this.totalDeBonus; //retorno do vetor totalDebonus
    }// Fechando o método com a chave

    public double calculadoraTotalDeBonus(Funcionario f){ // Criacao do método publico calculadoraTotalDeBonus, atribuindo a classe funcionario com o objeto f, abindo com a chave
        return this.totalDeBonus = this.totalDeBonus + f.bonifica(); //retorno do vetor totalDeBonus, recebendo o vetor totalDeBonus + o método bonifica do objeto f
    }//fechando o método com a chave

    
}//fechando a classe com a chave
