/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadordescuento15;
/**
 * @author juanse
 * fecha creación: sabado 06 de septiembre de 2025
 * Requerimientos: En un supermercado, algunos productos tienen un descuento especial del 15% si su precio unitario es mayor a $20.000.
 * Pide al usuario la cantidad de productos que comprará, su precio unitario y cantidad. 
 * Cuenta cuántos productos obtuvieron ese descuento y muéstralo al final. Todo usando for.
 */
import javax.swing.JOptionPane;
public class ContadorDescuento15 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 
        int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos \n que desea comprar: "));
        int cantidadDescuento = 0;
        for (int i=1; i<=cantidadProductos; i++) {
            int precioUnitario = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio por unidad del producto # " + i));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades del producto # " + i));
            if (precioUnitario >= 20000) {
                cantidadDescuento = cantidadDescuento + cantidad;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de productos con descuento \n es de: " + cantidadDescuento);
    }
}
