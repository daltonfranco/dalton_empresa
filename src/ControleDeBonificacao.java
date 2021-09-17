public class ControleDeBonificacao {
    
    private double totalDeBonus;

    public double getTotalDeBonus(){
        return this.totalDeBonus;
    }

    public double calculadoraTotalDeBonus(Funcionario f){
        return this.totalDeBonus = this.totalDeBonus + f.bonifica();
    }

    
}
