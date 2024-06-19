package controlador;

import javax.swing.JTextField;
import modelo.borrador;
import vista.ventaborrador;

public class controlador {
    
    public void total_pagar(JTextField TextPrecio, JTextField TextCantidad, ventaborrador venta){
        
        borrador borr = new borrador();
        int total_anterior = Integer.parseInt(venta.TextTotal.getText());
        int precio = Integer.parseInt(venta.TextPrecio.getText());
        borr.setPrecio(precio);
        int cantidad = Integer.parseInt(TextCantidad.getText());         
        int total_actual =  borr.getPrecio() * cantidad;
        int total_nuevo = total_anterior + total_actual;
        venta.TextTotal.setText(String.valueOf(total_nuevo));
        
}
    
    public static void main(String[] args){
        
        ventaborrador vista = new ventaborrador();
        vista.setTitle("VENTA BORRADOR");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        borrador borr = new borrador();
        vista.TextMarca.setText(borr.getMarca());
        vista.TextModelo.setText(borr.getModelo());
        vista.TextForma.setText(borr.getForma());
        vista.TextColor.setText(borr.getColor());
        
    }  
}