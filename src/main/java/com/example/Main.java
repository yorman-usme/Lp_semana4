package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Ingresa el valor de tu cuenta incluido el IVA: ");
        double valorCuenta = scanner.nextDouble();

        System.out.println("Ingresar el porcentaje de propina que desea dar del 10% al 15% sin el %: ");
        double porcentajePropina = scanner.nextDouble();
        porcentajePropina = porcentajePropina / 100;
        double valorPropina = valorCuenta * porcentajePropina;
        double valorTotal = valorCuenta + valorPropina;

        System.out.println("El valor de su cuenta es: " + valorCuenta);
        System.out.println("EL porcentaje de propina es: " + porcentajePropina * 100 + '%');
        System.out.println("El valor de la propina es: " + valorPropina);
        System.out.println("El valor total a pagar es de: "+ valorTotal);




        scanner.nextLine();


        

        System.out.println("Ingrese la distancia de viaje: ");
        double distancia = scanner.nextDouble();

        System.out.println("Ingrese el tiempo que espera pasar en trafico: ");
        double tiempoEspera = scanner.nextDouble();

        int tarifaBase = 4000;
        int valorKilometro = 800;
        int valorMinuto = 300;

        distancia = distancia * valorKilometro;
        tiempoEspera = tiempoEspera * valorMinuto;
        double precioTotal = tarifaBase + distancia + tiempoEspera;

        System.out.println("El precio Base de la carrera es: " + '$' + tarifaBase);
        System.out.println("El precio de distancia por kilometro es: " + '$' + distancia);
        System.out.println("El precio de tiempo de espera es de: " + '$' + tiempoEspera);
        System.out.println("El precio total del viajes es de: " + '$' + precioTotal);




        scanner.nextLine();




        System.out.println("Quieres decodificar un mensaje codificado? (si/no): ");
        String confirmar = scanner.nextLine().trim().toLowerCase();

        if (confirmar.equals("si")) {
        
        System.out.println("Ingrese mensaje codificado para decodificar: ");
        String mensajeCodificado = scanner.nextLine();

        String mensajeDecodificado = mensajeCodificado
        .replace("0", "o")
        .replace("3", "e")
        .replace("4", "a")
        .trim()
        .replaceAll("\\s+", " ")
        .toUpperCase();

        System.out.println("El mensaje decodificado es: " + mensajeDecodificado);

        }else {
            System.out.println("BUENO");
        }


        scanner.close();

    }

}