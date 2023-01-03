/*Considere a situação em que um cliente faz uma compra em uma loja. Ao realizar o
pagamento, lhe são oferecidas as seguintes opções:
Opção 1 - Pagamento à vista – 15% de desconto sobre o valor total da compra.
Opção 2 - Pagamento com cheque pré-datado para 30 dias – 10% de desconto sobre o valor total
da compra.
Opção 3 – Pagamento parcelado em 03 vezes – 5% de desconto sobre o valor total da compra.
Opção 4 - Pagamento parcelado em 06 vezes – não tem desconto.
Opção 5 - Pagamento parcelado em 12 vezes - 8% de acréscimo sobre o valor total da compra.
De acordo com a opção escolhida pelo cliente, calcule o valor final da compra e, se a escolha for
pelo pagamento parcelado, calcule o valor das parcelas. O programa deve apresentar ao usuário
uma mensagem com o valor total da compra, o valor final da compra, a diferença entre os dois,
identificando como desconto ou juros, de acordo com a opção do usuário. Exibir também a
quantidade e o valor das parcelas, se for o caso. */

Scanner input = new Scanner (System.in);
		double valCompra, valFinal, desconto, valParcelas, opcao;
		int qtdParcelas = 0;
	    System.out.println("digite o valor da compra: ");
	    valCompra = input.nextDouble();
	    System.out.println("opções de pagamento");
	    System.out.println("1- desconto de 15% ");
	    System.out.println("2- desconto de 10% ");
	    System.out.println("3- desconto de 5%, parcelado em 3x ");
	    System.out.println("4- parcelado em 6x ");
	    System.out.println("5- juros de 8%. parcelado em 12x ");
	    System.out.println("informe a opção desejada: ");
	    opcao = input.nextDouble();

	    if (opcao == 1){
	      desconto = valCompra*0.15;
	      valFinal = valCompra - desconto;
	      System.out.println("o valor total da compra é de " + valCompra + " o valor final da compra é de " + valFinal + " o desconto é de " + desconto );
	    }
	    else if (opcao == 2) {
	      desconto = valCompra*0.10;
	      valFinal = valCompra - desconto;
	      System.out.println("o valor total da compra é de " + valCompra + " o valor final da compra é de " + valFinal + " o desconto é de " + desconto);
	    }
	    else if (opcao == 3) {
	      desconto = valCompra*0.05;
	      valFinal = valCompra - desconto;
	      qtdParcelas = 3;
	      valParcelas = valFinal/ qtdParcelas;
	      System.out.println("o valor total da compra é de " + valCompra + " o valor final da compra é de " + valFinal + " o desconto é de " + desconto + " 3 parcelas de " + valParcelas);
	      }
	    else if (opcao == 4) {
	      desconto = 0;
	      valFinal = valCompra;
	      qtdParcelas = 6;
	      valParcelas = valFinal/ qtdParcelas;
	      System.out.println("o valor total da compra é de " + valCompra + " o valor final da compra é de " + valFinal + " o desconto é de " + desconto + " 6 parcelas de " + valParcelas);
	      }
	    if (opcao == 5) {
	      desconto = valCompra*0.08;
	      valFinal = valCompra + desconto; 
	      qtdParcelas = 12;
	      valParcelas = valFinal/ qtdParcelas; 
	      System.out.println("o valor total da compra é de " + valCompra + " o valor final da compra é de " + valFinal + " o desconto é de " + desconto + " 12 parcelas de " + valParcelas);
	    }

	   
	}

}
