/*Recomendam-se estudantes para bolsas de estudo em função de seu coeficiente de
rendimento (CR). A natureza das recomendações é baseada na seguinte tabela:

Média Recomendação
CR < 9,0 Altamente recomendado
8,0 < CR < 9,0 Fortemente recomendado
7,0 < CR < 8,0 Recomendado
CR < 7,0 Não recomendado

Solicite ao usuário o coeficiente de rendimento (CR) de um aluno e
determine sua recomendação. */

Scanner input = new Scanner (System.in);
double coeficRend;
		    System.out.println ("infome seu coeficiente de rendimento: ");
		    coeficRend = input.nextDouble();

		      if (coeficRend >= 9.0) {
		      System.out.println("O aluno é altamente recomendado");
		      }
		      else if (coeficRend <= 8.0) {
		        System.out.println("o aluno é fortemente recomendado");
		      }
		        
		      else if (coeficRend <= 7.0) {
		        System.out.println("o aluno é recomendado");
		      }
		      else {
		        System.out.println("o aluno não é recomendado");
		      }   


	   

	}

}
