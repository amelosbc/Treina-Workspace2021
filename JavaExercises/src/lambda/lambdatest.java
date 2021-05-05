package lambda;

public class lambdatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcao1 funcao1 = (Funcao1) valor -> {
			System.out.println(valor);
			System.out.println(valor);
			return valor;
		};
		String valor;
		funcao1.gerar(valor: "Alexandre");
	}
}

@FunctionalInterface
interface Funcao1 {
	String gerar(String Valor);
}