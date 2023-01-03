/*O Futebol Clube do Recife deseja aumentar o salário de seus jogadores. O ajuste salarial
deve obedecer à seguinte tabela:

Salário Atual 
Até R$ 1.900,00 Aumento de 20%
Acima de R$ 1900,00 até R$3.300,00

Aumento de 15%
Acima de R$ 3.300,00 até R$5.800,00

Aumento de 10% 
Acima de 5.800,00 Aumento de 5%
Calcular o aumento e o novo salário de um jogador a partir de seu
salário atual. */

Scanner input = new Scanner (System.in);
    double salario, salTotal, aumento;
    System.out.println("infome seu salário: ");
    salario = input.nextDouble();
    aumento = input.nextDouble();

      if (salario <= 1.900) {
        aumento = salario*0.20;
        salTotal = salario + 0.20;
      System.out.println("O jogador terá aumento de R$" + aumento + "e passará a receber R$" + salTotal );
      }
      else if (salario <= 3.300) {
        aumento = salario*0.15;
        salTotal = salario + 0.15;
        System.out.println("O jogador terá aumento de R$"+ aumento +"e passará a receber R$" + salTotal);
      }
        
      else if (salario <= 5.800) {
        aumento = salario*0.10;
        salTotal = salario + 0.10;
        System.out.println("O jogador terá aumento de R$" + aumento+ "e passará a receber R$" + salTotal);
      }
    
      else {
        aumento = salario*0.05;
        salTotal = salario + 0.05;
        System.out.println("O jogador terá aumento de R$"+ aumento+ "e passará a receber R$" + salTotal);
      }   
  }
}

