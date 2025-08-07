/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2;

/**
 *
 * @author isaacherrera
 */
import javax.swing.JOptionPane;

public class CasoEstudio2 {

    public static void main(String[] args) {

       // Creamos una matriz de 2 pisos con 3 habitaciones por piso
        Habitacion[][] hotel = new Habitacion[2][3];

        // Precarga de datos manual
        hotel[0][0] = new Habitacion("Libre", "Simple", "50");
        hotel[0][1] = new Habitacion("Ocupada", "Doble", "60");
        hotel[0][2] = new Habitacion("Sucia", "Simple", "40");

        hotel[1][0] = new Habitacion("Libre", "Doble", "70");
        hotel[1][1] = new Habitacion("Libre", "Simple", "45");
        hotel[1][2] = new Habitacion("Sucia", "Doble", "65");

        imprimirMatrizDeHabitaciones(hotel);
    }

    public static void imprimirMatrizDeHabitaciones(Habitacion[][] hotel) {
        StringBuilder resultado = new StringBuilder();

        for (int piso = 0; piso < hotel.length; piso++) {
            resultado.append("PISO ").append(piso + 1).append("\n");
            for (int hab = 0; hab < hotel[0].length; hab++) {
                int numHabitacion = (piso * hotel[0].length) + hab + 1;
                resultado.append("Hab ").append(numHabitacion).append(": ");
                resultado.append(hotel[piso][hab].getEstado()).append(" ");
                resultado.append(hotel[piso][hab].getTipo()).append(" $");
                resultado.append(hotel[piso][hab].getPrecio()).append("\n");
            }
            
        }

         JOptionPane.showMessageDialog(null, resultado.toString());
    }
}