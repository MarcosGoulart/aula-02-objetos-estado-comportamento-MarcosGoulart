import java.io.Console;

class App {
  public static void main(String[] args) throws Exception{
    // MaquinaAgua maq = new MaquinaAgua(20000, 100, 100); // 20L, 100 copos 200, 100 copos de 300
    // System.out.println(maq.agua() == 0); // mL
    // System.out.println(maq.copos200() == 0);
    // System.out.println(maq.copos300() == 0);
    // try {
    //   maq.servirCopo200(); // não efetua, pois não há copo nem água
    // } catch (Exception e) {
    // }
    // System.out.println(maq.agua() == 0); // mL
    // System.out.println(maq.copos200() == 0); // unidades
    // System.out.println(maq.copos300() == 0); // unidades
    // try {
    //   maq.abastecerAgua(); // inicializa 20000mL
    // } catch (Exception e) {
    //   //TODO: handle exception
    // };
    // System.out.println(maq.agua() == 20000); // mL

    // try {
    //   maq.abastecerAgua(); // mantém consistente
    // } catch (Exception e) {
    //   //TODO: handle exception
    // }
    // System.out.println(maq.agua() == 20000); // mL
    // try {
    //   maq.servirCopo200(); // não efetua, sem copo
    // } catch (Exception e) {
    //   //TODO: handle exception
    // }
    // System.out.println(maq.agua() == 20000); // mL
    // System.out.println(maq.copos200() == 0);
    // maq.abastecerCopo200(); // agora a máquina possui 100 copos de 200
    // System.out.println(maq.copos200() == 100);

    // maq.servirCopo200(); // -200
    // maq.servirCopo200(); // -200
    // maq.servirCopo200(); // -200
    // maq.servirCopo200(); // -200
    // maq.servirCopo200(); // -200, isto é, -1000ml e 5 copos de 200
    // System.out.println(maq.agua() == 19000);
    // System.out.println(maq.copos300() == 0);
    // System.out.println(maq.copos200() == 95);
    // maq.abastecerCopo200(); // agora a máquina possui 100 copos de 200 novamente
    // System.out.println(maq.copos200() == 100);

    // maq.servirCopo200(); // -200ml e 1 copo de 200
    // System.out.println(maq.agua() == 18800);
    // System.out.println(maq.copos200() == 99);
    // System.out.println(maq.copos300() == 0);
    // try {
    //   maq.servirCopo300(); // não efetua, não há copo 300
    // } catch (Exception e) {
    //   //TODO: handle exception
    // }
    // maq.abastecerCopo300(); // agora a máquina possui 100 copos de 300
    // System.out.println("17");
    // System.out.println(maq.copos300() == 100);
    // maq.servirCopo300(); // agora efetua
    // System.out.println(maq.agua() == 18500);
    // System.out.println(maq.copos200() == 99);
    // System.out.println(maq.copos300() == 99);

    // // servir 50 copos de 300 = -15000ml
    // for (int i = 0; i < 50; i++) maq.servirCopo300();
    // System.out.println(maq.agua() == 3500);
    // System.out.println(maq.copos200() == 99);
    // System.out.println(maq.copos300() == 49);

    // // servir 17 copos de 200 = 3400ml
    // for (int i = 0; i < 17; i++) maq.servirCopo200();
    // System.out.println(maq.agua() == 100);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 49);

    // // não há água para atender o pedido
    // try {
    //   maq.servirCopo300();
    // } catch (Exception e) {
    //   //TODO: handle exception
    // }
    // System.out.println(maq.agua() == 100);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 49);

    // // não há água para atender o pedido
    // try {
    //   maq.servirCopo200();
    // } catch (Exception e) {
    //   //TODO: handle exception
    // }
    // System.out.println(maq.agua() == 100);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 49);

    // maq.abastecerAgua(); // inicializa 20000mL
    // System.out.println(maq.agua() == 20000);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 49);

    // // servir os 49 copos de 300 restantes = 14700ml
    // while (maq.copos300() > 0) maq.servirCopo300();
    // System.out.println(maq.agua() == 5300);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 0);

    // // não há copo para atender o pedido
    // try {
    //   maq.servirCopo300();
    // } catch (Exception e) {
    //   //TODO: handle exception
    // }
    // System.out.println(maq.agua() == 5300);
    // System.out.println(maq.copos200() == 82);
    // System.out.println(maq.copos300() == 0);

    // maq.servirCopo200(); // de 200 ok
    // maq.servirCopo200(); // de 200 ok
    // System.out.println(maq.agua() == 4900);
    // System.out.println(maq.copos200() == 80);
    // System.out.println(maq.copos300() == 0);

    // maq.abastecerCopo300(); // 100 copos de 300
    // System.out.println(maq.agua() == 4900);
    // System.out.println(maq.copos200() == 80);
    // System.out.println(maq.copos300() == 100);

    // // servir 3 copos de 300
    // maq.servirCopo300(); maq.servirCopo300(); maq.servirCopo300();
    // System.out.println(maq.agua() == 4000);
    // System.out.println(maq.copos200() == 80);
    // System.out.println(maq.copos300() == 97);

    // MaquinaAgua maquinaCustom = new MaquinaAgua(10000, 30, 20);
    // // os atributos são acessíveis para leitura
    // System.out.println(maquinaCustom.capacidadeAgua == 10000); // mL
    // System.out.println(maquinaCustom.capacidadeCopos200 == 30);
    // System.out.println(maquinaCustom.capacidadeCopos300 == 20);

    // // As três linhas a seguir não devem compilar pois estes atributos devem ser imutáveis. Comente estas linhas.
    // //maquinaCustom.capacidadeAgua = 100000;
    // //maquinaCustom.capacidadeCopos200 = 300;
    // //maquinaCustom.capacidadeCopos300 = 200;

    // // Checando armazenamento
    // System.out.println(maquinaCustom.agua() == 0); // mL
    // System.out.println(maquinaCustom.copos200() == 0);
    // System.out.println(maquinaCustom.copos300() == 0);

    // maquinaCustom.abastecerAgua();
    // maquinaCustom.abastecerCopo200();
    // maquinaCustom.abastecerCopo300();
    // System.out.println(maquinaCustom.agua() == 10000);
    // System.out.println(maquinaCustom.copos200() == 30);
    // System.out.println(maquinaCustom.copos300() == 20);

    // maquinaCustom.servirCopo200(); // -200
    // maquinaCustom.servirCopo200(); // -200
    // maquinaCustom.servirCopo200(); // -200
    // maquinaCustom.servirCopo200(); // -200
    // maquinaCustom.servirCopo200(); // -200

    // System.out.println(maquinaCustom.copos200() == 25);
    // System.out.println(maquinaCustom.agua() == 9000);

    // MaquinaAgua maquininha = new MaquinaAgua(1000, 6, 3);
    // System.out.println(maquininha.capacidadeAgua == 1000); // mL
    // System.out.println(maquininha.capacidadeCopos200 == 6);
    // System.out.println(maquininha.capacidadeCopos300 == 3);
    // maquininha.abastecerAgua();
    // maquininha.abastecerCopo200();
    // maquininha.abastecerCopo300();
    // System.out.println(maquininha.agua() == 1000);
    // System.out.println(maquininha.copos200() == 6);
    // System.out.println(maquininha.copos300() == 3);

    // maquininha.servirCopo200(); // -200
    // maquininha.servirCopo200(); // -200
    // maquininha.servirCopo200(); // -200
    // maquininha.servirCopo200(); // -200
    // maquininha.servirCopo200(); // -200

    // System.out.println(maquininha.agua() == 0);
    // System.out.println(maquininha.copos200() == 1);
    // System.out.println(maquininha.copos300() == 3);
    // // O método `serve` lança uma exceção se não for possível servir
    // try {
    //   maquininha.servirCopo200(); // deve lançar exceção
    //   System.out.println(false); // esta linha não deve ser executada
    // } catch (Exception e) {
    //   System.err.println("true " + e.getMessage()); // Não há água
    // }

    // maquininha.abastecerAgua();
    // System.out.println(maquininha.agua() == 1000);
    // System.out.println(maquininha.copos200() == 1);;
    // System.out.println(maquininha.copos300() == 3);

    // maquininha.servirCopo200(); // -200
    // System.out.println(maquininha.agua() == 800);
    // System.out.println(maquininha.copos200() == 0);

    // try {
    //   maquininha.servirCopo200(); // deve lançar exceção
    //   System.out.println(false); // esta linha não deve ser executada
    // } catch (Exception e) {
    //   System.err.println("true " + e.getMessage()); // Não há copos de 200mL
    // }


    // // Máquinas inválidas devem lançar exceção

    // try {
    //   MaquinaAgua maqinvalida = new MaquinaAgua(1000, 0, 3);
    //   System.out.println(false); // esta linha não deve ser executada
    // } catch (Exception e) {
    //   System.err.println("true " + e.getMessage()); // Copos de 200mL deve ser positivo
    // }

    // try {
    //   MaquinaAgua maqinvalida = new MaquinaAgua(1000, 10, 0);
    //   System.out.println(false); // esta linha não deve ser executada
    // } catch (Exception e) {
    //   System.err.println("true " + e.getMessage()); // Copos de 300mL deve ser positivo
    // }

    // try {
    //   MaquinaAgua maqinvalida = new MaquinaAgua(-1000, 10, 10);
    //   System.out.println(false); // esta linha não deve ser executada
    // } catch (Exception e) {
    //   System.err.println("true " + e.getMessage()); // Quantidade água deve ser positivo
    // }

    // // Máquina de 500 litros!
    // MaquinaAgua maquinao = new MaquinaAgua(500000, 3000, 2000);
    // maquinao.abastecerAgua();
    // maquinao.abastecerCopo300();
    // // Esvaziando a máquina
    // try { // servindo enquanto houver água
    //   while (true) {
    //     System.out.printf("Agua em %d e Copos %d - Servindo...", maquinao.agua(), maquinao.copos300());
    //     maquinao.servirCopo300();
    //     System.out.println(" servido.");
    //   }
    // } catch (Exception e) {
    //   System.err.println("true: acabou a água");
    // }
    // System.out.println(maquinao.agua() == 200);
    // System.out.println(maquinao.copos300() == 334);

    // ATM atm = new ATM(2344499);
    // System.out.println(atm.numeroSerie == 2344499);
    // // a linha a seguir não compila, comente-a
    // //atm.numeroSerie = 34883444;
    // // o ATM não tem dinheiro no início
    // System.out.println(atm.consultarValor()); // 0
    // System.out.println(atm.consultarValor() == 0);
    // // abastecendo com 33 notas de 100
    // atm.abastecer(33, 100);
    // // verificando a quantidade de cédulas de 100
    // System.out.println(atm.consultarQuantidade(100)); // 33
    // // espera-se 33 cédulas
    // System.out.println(atm.consultarQuantidade(100) == 33);
    // // espera-se nenhuma cédula de qualquer outro valor
    // System.out.println(atm.consultarQuantidade(5)); // 0
    // System.out.println(atm.consultarQuantidade(5) == 0);
    // System.out.println(atm.consultarQuantidade(50)); // 0
    // System.out.println(atm.consultarQuantidade(50) == 0);
    // // mesmo os que não existem podem ser consultados, mas retornam 0
    // System.out.println(atm.consultarQuantidade(3)); // 0
    // System.out.println(atm.consultarQuantidade(3) == 0);
    // // abastecimento de cédulas não existentes são rejeitados
    // atm.abastecer(8, 3); // 8 cédulas de R$ 3,00
    // System.out.println(atm.consultarQuantidade(3) == 0);
    // // consultando o valor
    // System.out.println(atm.consultarValor()); // 33 * 100 = 3300 reais
    // System.out.println(atm.consultarValor() == 3300);
    // // retirada rejeitada
    // atm.retirar(350); // não há cédulas de R$ 50,00
    // System.out.println(atm.consultarQuantidade(100) == 33);
    // System.out.println(atm.consultarValor() == 3300);
    // // retirada válida
    // atm.retirar(300); // 3 cédulas de 100
    // System.out.println(atm.consultarQuantidade(100));
    // System.out.println(atm.consultarQuantidade(100) == 30);
    // System.out.println(atm.consultarValor() == 3000);
    // // retirada rejeitada
    // atm.retirar(3100); // não há cédulas suficientes
    // System.out.println(atm.consultarQuantidade(100) == 30);
    // System.out.println(atm.consultarValor() == 3000);
    // // retirada válida
    // atm.retirar(3000); // vai esvaziar o ATM
    // System.out.println(atm.consultarQuantidade(100) == 0);
    // System.out.println(atm.consultarValor() == 0);
    // // abastecimento de R$ 50,00 e R$ 10,00
    // atm.abastecer(10, 10); // 10 cédulas de R$ 10,00
    // atm.abastecer(10, 50); // 10 cédulas de R$ 50,00
    // System.out.println(atm.consultarQuantidade(10) == 10);
    // System.out.println(atm.consultarQuantidade(50) == 10);
    // System.out.println(atm.consultarValor() == 600); // 10 * 10 + 10 * 50
    // // retirada prioriza cédulas de maior valor
    // atm.retirar(100); // retira 2 cédulas de R$ 50,00
    // System.out.println(atm.consultarQuantidade(10) == 10);
    // System.out.println(atm.consultarQuantidade(50) == 8);
    // System.out.println(atm.consultarValor() == 500); // 10 * 10 + 8 * 50
    // // retirada combinada
    // atm.retirar(90); // 1 cédula de R$ 50,00 e 4 cédulas de R$ 10,00
    // System.out.println(atm.consultarQuantidade(10) == 6);
    // System.out.println(atm.consultarQuantidade(50) == 7);
    // System.out.println(atm.consultarValor() == 410); // 6 * 10 + 7 * 50
    // incluir casos de teste pessoais com retiradas
    // quem combinam 3, 4 e 5 cédulas
    // ---------------------------------------------------
  //TV

  // 
  
  // Microondas

  Microondas microondas = new Microondas("consul");

  System.out.println(microondas.marca == "consul");
  System.out.println(microondas.tempo == 0);
  System.out.println(microondas.ligado == false);

  microondas.mais30();
  System.out.println(microondas.tempo == 30);
  System.out.println(microondas.ligado == true);

  microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick();
  microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick();
  microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick(); microondas.tick();
  microondas.tick();

  System.out.println(microondas.tempo == 0);
  System.out.println(microondas.ligado == false);

  microondas.aquecer(100);
  System.out.println(microondas.tempo == 143);
  System.out.println(microondas.ligado == true);

  microondas.aquecer(200);
  System.out.println(microondas.tempo == 429);

  microondas.cancel();
  System.out.println(microondas.tempo == 0);
  System.out.println(microondas.ligado == false);

  microondas.descongelar(100);
  System.out.println(microondas.tempo == 166);
  System.out.println(microondas.ligado == true);

  microondas.aquecer(200);
  System.out.println(microondas.tempo == 498);

  microondas.mais30();
  System.out.println(microondas.tempo == 528);

  microondas.cancel();
  microondas.arroz();
  System.out.println(microondas.tempo == 1105);

  microondas.cancel();
  microondas.vegetais();
  System.out.println(microondas.tempo == 275);

  microondas.cancel();
  microondas.massa();
  System.out.println(microondas.tempo == 665);

  microondas.cancel();
  microondas.peixe();
  System.out.println(microondas.tempo == 420);

  microondas.cancel();
  microondas.pipoca();
  System.out.println(microondas.tempo == 160);

  microondas.cancel();
  microondas.caneca();
  System.out.println(microondas.tempo == 120);

  }
}
