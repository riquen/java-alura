package exercicios1;

public class Aposentadoria {
    public static void main(String[] args) {
        double salario = 3213.21;
        double acrescimoSalario;
        int tempoEmpresa = 35;
        String nome = "Henrique";
        int anoEntrada = 2021 - tempoEmpresa;
        int idadeAtual = 55;
        int idadeEntrada = idadeAtual - tempoEmpresa;
        double salarioAcrescimo;

        if (idadeAtual < 18) {
            System.out.println(nome + ", voc� n�o est� eleg�vel para trabalhar.");
        } else if (tempoEmpresa > 34) {
            acrescimoSalario = salario * 0.25;
            salarioAcrescimo = salario + acrescimoSalario;
            System.out.println(nome + ", voc� entrou na empresa em " + anoEntrada + " quando tinha " + idadeEntrada + " anos e completa hoje " + tempoEmpresa + " anos de casa.");
            System.out.print("Por isso, ganhou um acr�scimo de 25% ");
            System.out.printf("totalizando R$%.2f", acrescimoSalario);
            System.out.print(". Seu sal�rio atualmente � de R$" + salario);
            System.out.printf(", com o reajuste, foi para R$%.2f %n", salarioAcrescimo);
            System.out.println("Desejamos os parab�ns, mas est� na hora de aposentar!");
        } else if (tempoEmpresa >= 30) {
            acrescimoSalario = salario * 0.15;
            salarioAcrescimo = salario + acrescimoSalario;
            System.out.println(nome + ", voc� entrou na empresa em " + anoEntrada + " quando tinha " + idadeEntrada + " anos e completa hoje " + tempoEmpresa + " anos de casa.");
            System.out.print("Por isso, ganhou um acr�scimo de 15% ");
            System.out.printf("totalizando R$%.2f", acrescimoSalario);
            System.out.print(". Seu sal�rio atualmente � de R$" + salario);
            System.out.printf(", com o reajuste, foi para R$%.2f %n", salarioAcrescimo);
            System.out.println("Desejamos os parab�ns!");
        } else if (tempoEmpresa >= 20) {
            acrescimoSalario = salario * 0.07;
            salarioAcrescimo = salario + acrescimoSalario;
            System.out.println(nome + ", voc� entrou na empresa em " + anoEntrada + " quando tinha " + idadeEntrada + " anos e completa hoje " + tempoEmpresa + " anos de casa.");
            System.out.print("Por isso, ganhou um acr�scimo de 7% ");
            System.out.printf("totalizando R$%.2f", acrescimoSalario);
            System.out.print(". Seu sal�rio atualmente � de R$" + salario);
            System.out.printf(", com o reajuste, foi para R$%.2f %n", salarioAcrescimo);
            System.out.println("Desejamos os parab�ns!");
        } else if (tempoEmpresa >= 15) {
            acrescimoSalario = salario * 0.05;
            salarioAcrescimo = salario + acrescimoSalario;
            System.out.println(nome + ", voc� entrou na empresa em " + anoEntrada + " quando tinha " + idadeEntrada + " anos e completa hoje " + tempoEmpresa + " anos de casa.");
            System.out.print("Por isso, ganhou um acr�scimo de 5% ");
            System.out.printf("totalizando R$%.2f", acrescimoSalario);
            System.out.print(". Seu sal�rio atualmente � de R$" + salario);
            System.out.printf(", com o reajuste, foi para R$%.2f %n", salarioAcrescimo);
            System.out.println("Desejamos os parab�ns!");
        } else if (tempoEmpresa >= 10) {
            acrescimoSalario = salario * 0.02;
            salarioAcrescimo = salario + acrescimoSalario;
            System.out.println(nome + ", voc� entrou na empresa em " + anoEntrada + " quando tinha " + idadeEntrada + " anos e completa hoje " + tempoEmpresa + " anos de casa.");
            System.out.print("Por isso, ganhou um acr�scimo de 2% ");
            System.out.printf("totalizando R$%.2f", acrescimoSalario);
            System.out.print(". Seu sal�rio atualmente � de R$" + salario);
            System.out.printf(", com o reajuste, foi para R$%.2f %n", salarioAcrescimo);
            System.out.println("Desejamos os parab�ns!");
        } else {
            System.out.println(nome + ", n�o houve altera��o salarial.");
        }
    }
}
