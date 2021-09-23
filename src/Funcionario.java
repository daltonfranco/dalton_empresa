public abstract class Funcionario { // criação da classe publica e abstrata Funcionário, abrindo com a chave

    protected String nome; // criacao do vetor protegido nome do tipo String
    protected String departamento;// criacao do vetor protegido departamento da tipo String
    protected double salario;// criacao do vetor protegido salario do tipo double
    protected String dataDeEntrada;// criacao do vetor protegido dataDeEntrada do tipo String
    protected String rg;// criacao do vetor protegido rg do tipo String
    protected boolean estaNaEmpresa;// criacao do vetor protegido estaNaEmpresa do tipo boolean

    public String getNome(){// criacao do método getNome do tipo String, abrindo com a chave
        return nome;// retorno do vetor nome
    }// fechando o metodo com a chave

    public void setNome(String nome){// criação do método publico e vazio setNome, recebendo um parametro nome do tipo String, abrindo com a chave
        this.nome = nome;// vetor nome recebendo o parametro nome
    }// fechando o metodo com a chave

    public String getDepartamento(){// criacao do método getDepartamento do tipo String, abrindo com a chave
        return departamento;// retorno do vetor departamento
    }// fechando o metodo com a chave

    public void setDepartamento(String departamento){// criação do método publico e vazio setDepartamento, recebendo um parametro departamento do tipo String, abrindo com a chave
        this.departamento = departamento;// vetor departamento recebendo o parametro departamento
    }// fechando o metodo com a chave

    public double getSalario(){// criacao do método getSalario do tipo Double, abrindo com a chave
        return salario;// retorno do vetor salario
    }// fechando o metodo com a chave

    public void setSalario(double salario){// criação do método publico e vazio setSalario, recebendo um parametro salario do tipo double, abrindo com a chave
        this.salario = salario;// vetor salario recebendo o parametro salario
    }// fechando o metodo com a chave

    public String getDataDeEntrada(){// criacao do método getDataDeEntrada do tipo String, abrindo com a chave
        return dataDeEntrada;// retorno do vetor dataDeEntrada
    }// fechando o metodo com a chave

    public void setDataDeEntrada(String dataDeEntrada){// criação do método publico e vazio setDataDeEntrada, recebendo um parametro dataDeEntrada do tipo String, abrindo com a chave
        this.dataDeEntrada = dataDeEntrada;// vetor dataDeEntrada recebendo o parametro dataDeEntrada
    }// fechando o metodo com a chave

    public String getRg(){// criacao do método getRg do tipo String, abrindo com a chave
        return rg;// retorno do vetor rg
    }// fechando o metodo com a chave

    public void setRg(String rg){// criação do método publico e vazio setRg, recebendo um parametro rg do tipo String, abrindo com a chave
        this.rg = rg;// vetor rg recebendo o parametro rg
    }// fechando o metodo com a chave

    public boolean getEstaNaEmpresa(){// criacao do método getEstaNaEmpresa do tipo boolean, abrindo com a chave
        return estaNaEmpresa;// retorno do vetor estaNaEmpresa
    }// fechando o metodo com a chave

    public void setEstaNaEmpresa(boolean estaNaEmpresa){// criação do método publico e vazio setEstaNaEmpresa, recebendo um parametro estaNaEmpresa do tipo boolean, abrindo com a chave
        this.estaNaEmpresa = estaNaEmpresa;// vetor estaNaEmpresa recebendo o parametro estaNaEmpresa
    }// fechando o metodo com a chave

    public void calculaSalario(double valor){// criacao do metodo publico e vazio calculaSalario, abrituindo o parametro valor do tipo double, abindo com a chave
        this.salario = valor - (valor * 0.06);// vetor salario recebendo o parametro valor - (parametro valor * 0.06)
    }// fechando o metodo com a chave

    public void calculaSalario(double valor, double horaExtra){// criação do metodo publico e vazio calculaSalario, atribuindo o parametro valor e horaExtra, ambas do tipo double, abindo com a chave
        double valorHorasExtra = (valor/30) / 8 * horaExtra;// vetor valorHorasExtra recebendo (parametro valor/30) / 8 * parametro horaExtra
        this.salario = valor - (valor*0.06) + valorHorasExtra;// vetor salario recebendo o parametro valor - (parametro valor*0,06) + veto valorHorasExtras
    }// fechando o metodo com a chave

    public double calculaSalario() {// criacao do metodo publico calculaSalario do tipo double, abrindo com a chave
        return this.salario = this.salario - (this.salario * 0.06);// retorno do vetor salario recebendo o vetor salario - (vetor salario * 0.06)
    }// fechando o metodo com a chave

    public double bonifica(){// criação do metodo publico bonifica do tipo double, abrindo com a chave
        return this.salario * 0.10;// retorno do vetor salario * 0.10
    }// fechando o metodo com a chave

    public void demite(){// criação do metodo publico e vazio demite, abrindo com a chave
        estaNaEmpresa = false;// vetor estaNaEmpresa recebendo o false
    }// fechando o metodo com a chave

    public double calculaGanhaAnual(){// criação do método publico calculaGanhaAnual do tipo double, abrindo com a cheve
        return salario * 12;// retorno do vetor salario * 12
    }// fechando o metodo com a chave

    
    
}// fechando a classe com a chave