package principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int listado = 0;
        while (listado != 8){
            System.out.println(
                    "\nBienventidos al conversor de monedas\n\n" +
                    "Ingresa el tipo de cambio que deseas realizar:\n\n"+
                    "1.Dolar Estadounidense a Peso Argentino\n"+
                    "2.Peso Argentino a Dolar Estadounidense\n"+
                    "3.Dolar Estadounidense a Peso Chileno\n"+
                    "4.Peso Chileno a Dolar Estadounidense\n"+
                    "5.Peso Chileno a Dolar Australiano\n"+
                    "6.Dolar Australiano a Peso Chileno\n"+
                    "7.Convertir otra moneda\n"+
                    "8.Salir");
            listado = entrada.nextInt();
            entrada.nextLine();

            switch (listado){
                case 1:
                    ConvertirMoneda.convertir("USD","ARS",consulta,entrada);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS","USD",consulta,entrada);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","CLP",consulta,entrada);
                    break;
                case 4:
                    ConvertirMoneda.convertir("CLP","USD",consulta,entrada);
                    break;
                case 5:
                    ConvertirMoneda.convertir("CLP","AUD",consulta,entrada);
                    break;
                case 6:
                    ConvertirMoneda.convertir("AUD","CLP",consulta,entrada);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta,entrada);
                    break;
                case 8:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Seleccione otra opción");
            }




        }
    }
}
