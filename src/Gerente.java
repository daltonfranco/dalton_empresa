public class Gerente extends Funcionario{// criação da classe publica Gerente extendido a classe Funcionario, abindo com a chave

    private String login;// criacao do vetor privado login
    private String senha;// criacao do vetor privado senha

    public String getLogin(){// criacao do método publico getLogin do tipo String, abrindo com a chave
        return login;// retorno do vetor login
    }// fechando o metodo com a chave

    public void setLogin(String login){// criação do método publico e vazio setLogin, recebendo um parametro login do tipo String, abrindo com a chave
        this.login = login;// vetor login recebendo o parametro login
    }// fechando o metodo com a chave

    public String getSenha(){// criacao do método publico getSenha do tipo String, abrindo com a chave
        return senha;// retorno do vetor senha
    }// fechando o metodo com a chave

    public void setSenha(String senha){// criação do método publico e vazio setSenha, recebendo um parametro senha do tipo String, abrindo com a chave
        this.senha = senha;// vetor senha recebendo o parametro senha
    }// fechando o metodo com a chave

    public double bonifica(){// crindo o metodo publico bonifica do tipo double, abrindo com a chave
        return this.salario * 0.15;// retorno do vetor salario * 0.15
    }// fechando o metodo com a chave

    public void autentica(String login, String senha) {// criação o metodo publico e vazio autentica, atibuindo os parametros login e senha, ambos do tipo String, abrindo com a chave
        if((this.login == login) && (this.senha == senha)) { // estrutura de condição, condição se, abrindo com a chave
            System.out.println("Acesso permitido!!!");// mostrar na tela, acesso permitido
        }else{// fechando se com chave, estrutura de condicao, condicao senao, abrindo com a chave
            System.out.println("Acesso negado!!!");// mostrar na tela, acesse negado
        }//fechando senao com chave

    }// fechando o metodo com a chave
}// fechando a classe com a chave
