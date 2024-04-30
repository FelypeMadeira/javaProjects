import java.util.Scanner;
public class SAC {
public static void main(String Args[]) {
	double saldoInicial , taxaJuros, amortizacao, saldoDevedor, valorPago= 0;
	   int numParcelas;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Simulação do SAC(Sistem de Amortização Contínua)");
	   System.out.println("Digite o valor do imóvel para o financeamento");
	   saldoInicial = sc.nextDouble();
	   System.out.println("Digite o número de parcelas para o financeamento");
	   numParcelas=sc.nextInt();
	   amortizacao = saldoInicial/numParcelas;
	   saldoDevedor = saldoInicial;
	   int i=1;
	   while(i<=numParcelas) {
		   taxaJuros = saldoDevedor*0.0072;
		   double valorParcela = amortizacao+taxaJuros;
		   saldoDevedor -=amortizacao;
		   valorPago+=valorParcela;
		   System.out.println("Parcela: "+i);
		   System.out.println("O valor da parcela foi: "+valorParcela);
		   System.out.println("O valor total pago é: "+valorPago);
		   System.out.println("O saldo Devedor agora é de: "+saldoDevedor);
		   
		   
		i++;   
		   
		   
	   }
}
}