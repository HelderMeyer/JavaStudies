package roteiro1.parte2;

public class Exercicio01 {
	
    public static void main(String [] args){
        double salarioBase = 2500;
        int numHorasExtras = 10;
        double horasPaga =  salarioBase/Double.valueOf(40);
        double salarioFinal = salarioBase+(Double.valueOf(numHorasExtras)*horasPaga);
        
        System.out.println("=======================================================");
        System.out.println("INFORMAÇÕES");
        System.out.println("Salário base: " + salarioBase);
        System.out.println("Número de Horas Extras: " + numHorasExtras);
        System.out.println("=======================================================");
        System.out.println("CÁLCULOS");
        System.out.println("Salário Base + (Número de Horas Extras X Horas Pagas)");
        System.out.println("2500 + (10 X " + salarioBase + "/40 horas)");
        System.out.println("2500 + (10 X (2500/40))");
        System.out.println("2500 + (10 X 62,5)");
        System.out.println("2500 + 625");
        System.out.println("=======================================================");
        System.out.println("RESULTADO");
        System.out.println("Salario total: " + salarioFinal);
        System.out.println("=======================================================");
    }
    
}
