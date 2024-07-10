package principal;

import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultaMoneda consulta, Scanner entrada) {
        double cantidad;
        double cantidadConvertida;

        TipoCambio moneda = consulta.buscarMoneda(monedaBase,monedaTarget);
        System.out.println("El tipo de cambio para hoy: "+monedaBase+"="+moneda.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(entrada.nextLine());
        cantidadConvertida = moneda.conversion_rate() * cantidad;
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadConvertida+" "+moneda.target_code());

    }

    public static void convertirOtraMoneda(ConsultaMoneda consulta, Scanner entrada) {
        System.out.println("Ingrese el tipo de cambio para la moneda base: ");
        String monedaBase = entrada.nextLine().toUpperCase();
        System.out.println(("Ingrese la moneda que requiere: "));
        String monedaRequerida = entrada.nextLine().toUpperCase();
        convertir(monedaBase,monedaRequerida,consulta,entrada);
    }
}
