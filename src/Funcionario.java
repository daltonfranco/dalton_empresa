public abstract class Funcionario {

    protected String nome;
    protected String departamento;
    protected double salario;
    protected String  dataDeEntrada;
    protected String rg;
    protected boolean estaNaEmpresa;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getDataDeEntrada(){
        return dataDeEntrada;
    }

    public void setDataDeEntrada(String dataDeEntrada){
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getRg(){
        return rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public boolean getEstaNaEmpresa(){
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa){
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public void calculaSalario(double valor){
        this.salario = valor - (valor * 0.06);
    }

    public void calculaSalario(double valor, double horaExtra){
        double valorHorasExtra = (valor/30) / 8 * horaExtra;
        this.salario = valor - (valor*0.06) + valorHorasExtra;
    }

    public double calculaSalario() {
        return this.salario = this.salario - (this.salario * 0.06);
    }

    public double bonifica(){
        return this.salario * 0.10;
    }

    public void demite(){
        estaNaEmpresa = false;
    }

    public double calculaGanhaAnual(){
        return salario * 12;
    }

    
    
}