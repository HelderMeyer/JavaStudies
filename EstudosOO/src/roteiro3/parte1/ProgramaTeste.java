package roteiro3.parte1;

import java.util.Scanner;

public class ProgramaTeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); 
       
        double sb, grat, imp, sr;
        
        System.out.println("Informe o Sal�rio Base :");
        sb = entrada.nextDouble();
        grat = sb * 5/100;
        imp = sb * 7/100;
        sr = sb + grat - imp;
        entrada.close();
        System.out.println("Sal�rio a receber : " + sr);
    }
    
}

