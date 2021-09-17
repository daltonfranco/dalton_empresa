public class Programa {
    public static void main(String[] args){
        
        Vendedor v = new Vendedor();

        v.setDataDeEntrada("19/08/2016");

        v.setDepartamento("Tecnologia");

        v.setEstaNaEmpresa(true);

        v.setNome("Dalton");

        v.setRg("19");

        v.setSalario(1000.0);



        Gerente g1 = new Gerente();
        
        g1.departamento = "RH";

        g1.dataDeEntrada = "13/01/2017";

        g1.estaNaEmpresa = true;

        g1.nome = "Suelen";

        g1.rg = "32143142x";

        g1.salario = 4000.0;

        g1.setLogin("Suelen123");

        g1.setSenha("123456789");




        Supervisor supervisor = new Supervisor();

        supervisor.setNome("Rafael");

        supervisor.setDataDeEntrada("12/12/2018");

        supervisor.setDepartamento("Vendas");

        supervisor.setEstaNaEmpresa(true);

        supervisor.setRg("342423424x");

        supervisor.setLogin("rafa987");

        supervisor.setSenha("123456789");;

        supervisor.salario = 4600.0;

        

        ControleDeBonificacao controle = new ControleDeBonificacao();

        controle.calculadoraTotalDeBonus(v);
        controle.calculadoraTotalDeBonus(g1);
        controle.calculadoraTotalDeBonus(supervisor);


        System.out.println(v.getDataDeEntrada());

        System.out.println(v.getDepartamento());

        System.out.println(v.getNome());

        System.out.println(v.getRg());

        System.out.println(v.getSalario());

        System.out.println(v.getEstaNaEmpresa());

        System.out.println(v.bonifica());


        System.out.println("-----------------------------------------------------");

        g1.autentica("Suelen123", "123456789");

        System.out.println(g1.getDataDeEntrada());

        System.out.println(g1.getDepartamento());

        System.out.println(g1.getNome());

        System.out.println(g1.getRg());

        System.out.println(g1.getSalario());

        System.out.println(g1.bonifica());

        System.out.println("Total de bonus: R$ " + controle.getTotalDeBonus());


        System.out.println("------------------------------------------------------");

        supervisor.autentica("rafa987", "123456789");

        System.out.println(supervisor.getNome());

        System.out.println(supervisor.getDataDeEntrada());

        System.out.println(supervisor.getSalario());

        System.out.println(supervisor.getDepartamento());

        System.out.println(supervisor.getEstaNaEmpresa());

        System.out.println(supervisor.getRg());

        System.out.println("Total de bonus R& " + controle.getTotalDeBonus());


    }
}
