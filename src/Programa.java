public class Programa {// criação da classe publica Programa, abrindo com a chave
    public static void main(String[] args){// criação do metodo publico, estático e vazio main (principal), atribuindo o tipo String e o vetor agrs, abrindo com a chave
        
        Vendedor v = new Vendedor();// criação do objeto v do tipo Vendedor, construindo (new) com a classe Vendedor

        v.setDataDeEntrada("19/08/2016");// objeto v acessando o método setDataDeEntrada da sua classe, atribundo um valor

        v.setDepartamento("Tecnologia");// objeto v acessando o método setDepartamento da sua classe, atribundo um valor

        v.setEstaNaEmpresa(true);// objeto v acessando o método setEstaNaEmpresa da sua classe, atribundo um valor

        v.setNome("Dalton");// objeto v acessando o método setNome da sua classe, atribundo um valor

        v.setRg("19");// objeto v acessando o método setRg da sua classe, atribundo um valor

        v.setSalario(1000.0);// objeto v acessando o método setSalario da sua classe, atribundo um valor



        Gerente g1 = new Gerente();// criação do objeto g1 do tipo Gerente, construindo (new) com a classe Gerente
        
        g1.departamento = "RH";// objeto g1 acessando o vetor departamento de sua classe, atribuindo um valor

        g1.dataDeEntrada = "13/01/2017";// objeto g1 acessando o vetor dataDeEntrada de sua classe, atribuindo um valor

        g1.estaNaEmpresa = true;// objeto g1 acessando o vetor estaNaEmpresa de sua classe, atribuindo um valor

        g1.nome = "Suelen";// objeto g1 acessando o vetor nome de sua classe, atribuindo um valor

        g1.rg = "32143142x";// objeto g1 acessando o vetor rg de sua classe, atribuindo um valor

        g1.salario = 4000.0;// objeto g1 acessando o vetor salario de sua classe, atribuindo um valor

        g1.setLogin("Suelen123");// objeto g1 acessando o método setLogin de sua classe, atribuindo um valor

        g1.setSenha("123456789");// objeto g1 acessando o método setSenha de sua classe, atribuindo um valor




        Supervisor supervisor = new Supervisor();// criação do objeto supervisor do tipo Supervisor, construindo (new) com a classe Supervisor

        supervisor.setNome("Rafael");// objeto supervisor acessando o método setNome da sua classe, atribundo um valor

        supervisor.setDataDeEntrada("12/12/2018");// objeto supervisor acessando o método setDataDeEntrada da sua classe, atribundo um valor

        supervisor.setDepartamento("Vendas");// objeto supervisor acessando o método setDepartamento da sua classe, atribundo um valor

        supervisor.setEstaNaEmpresa(true);// objeto supervisor acessando o método setEstaNaEmpresa da sua classe, atribundo um valor

        supervisor.setRg("342423424x");// objeto supervisor acessando o método setRg da sua classe, atribundo um valor

        supervisor.setLogin("rafa987");// objeto supervisor acessando o método setLogin da sua classe, atribundo um valor

        supervisor.setSenha("123456789");;// objeto supervisor acessando o método setSenha da sua classe, atribundo um valor

        supervisor.salario = 4600.0;// objeto supervisor acessando o vetor salario de sua classe, atribuindo um valor

        

        ControleDeBonificacao controle = new ControleDeBonificacao();// criação do objeto controle do tipo ControleDeBonificacao, construindo (new) com a classe ControleDeBonificacao

        controle.calculadoraTotalDeBonus(v);// objeto controle acessando o método calculadoraTotalDeBonus da sua classe, atribundo o objeto v
        controle.calculadoraTotalDeBonus(g1);// objeto controle acessando o método calculadoraTotalDeBonus da sua classe, atribundo o objeto g1
        controle.calculadoraTotalDeBonus(supervisor);// objeto controle acessando o método calculadoraTotalDeBonus da sua classe, atribundo o objeto supervisor


        System.out.println(v.getDataDeEntrada());// mostrar na tela o objeto v acessando o método getDataDeEntrada da sua classe

        System.out.println(v.getDepartamento());// mostrar na tela o objeto v acessando o método getDepartamento da sua classe

        System.out.println(v.getNome());// mostrar na tela o objeto v acessando o método getNome da sua classe

        System.out.println(v.getRg());// mostrar na tela o objeto v acessando o método getRg da sua classe

        System.out.println(v.getSalario());// mostrar na tela o objeto v acessando o método getSalario da sua classe

        System.out.println(v.getEstaNaEmpresa());// mostrar na tela o objeto v acessando o método getEstaNaEmpresa da sua classe

        System.out.println(v.bonifica());// mostrar na tela o objeto v acessando o método bonifica da sua classe


        System.out.println("-----------------------------------------------------");// mostrar na tela vários traços

        g1.autentica("Suelen123", "123456789");// objeto g1 acessando o método autentica, atribuindo dois valores

        System.out.println(g1.getDataDeEntrada());// mostrar na tela o objeto g1 acessando o método getDataDeEntrada da sua classe

        System.out.println(g1.getDepartamento());// mostrar na tela o objeto g1 acessando o método getDepartamento da sua classe

        System.out.println(g1.getNome());// mostrar na tela o objeto g1 acessando o método getNome da sua classe

        System.out.println(g1.getRg());// mostrar na tela o objeto g1 acessando o método getRg da sua classe

        System.out.println(g1.getSalario());// mostrar na tela o objeto g1 acessando o método getSalario da sua classe

        System.out.println(g1.bonifica());// mostrar na tela o objeto g1 acessando o método bonifica da sua classe

        System.out.println("Total de bonus: R$ " + controle.getTotalDeBonus());// mostrar na tela o objeto controle acessando o método getTotalDeBonus da sua classe


        System.out.println("------------------------------------------------------");// mostrar na tela vários traços

        supervisor.autentica("rafa987", "123456789");// objeto supervisor acessando o método autentica, atribuindo dois valores

        System.out.println(supervisor.getNome());// mostrar na tela o objeto supervisor acessando o método getNome da sua classe

        System.out.println(supervisor.getDataDeEntrada());// mostrar na tela o objeto supervisor acessando o método getDataDeEntrada da sua classe

        System.out.println(supervisor.getSalario());// mostrar na tela o objeto supervisor acessando o método getSalario da sua classe

        System.out.println(supervisor.getDepartamento());// mostrar na tela o objeto supervisor acessando o método getDepartamento da sua classe

        System.out.println(supervisor.getEstaNaEmpresa());// mostrar na tela o objeto supervisor acessando o método getEstaNaEmpresa da sua classe

        System.out.println(supervisor.getRg());// mostrar na tela o objeto supervisor acessando o método getRg da sua classe

        System.out.println("Total de bonus R& " + controle.getTotalDeBonus());// mostrar na tela o objeto controle acessando o método getTotalDeBonus da sua classe


    }// fechando o método main com a chave
}// fechando a classe com a chave
