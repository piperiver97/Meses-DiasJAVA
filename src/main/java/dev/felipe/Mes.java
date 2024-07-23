package dev.felipe;
public class Mes {
    public static String getNombreDelMes(int mes) {
        String[] nombres = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("El número del mes debe estar entre 1 y 12.");
        }
        return nombres[mes - 1];
    }

    public static int getDiasDelMes(int mes) {
        int[] dias = { 
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 
        };
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("El número del mes debe estar entre 1 y 12.");
        }
        return dias[mes - 1];
    }

    public static void main(String[] args) {
        int mes = 5; // Ejemplo de uso
        System.out.println("Mes: " + getNombreDelMes(mes));
        System.out.println("Días: " + getDiasDelMes(mes));
    }
}
