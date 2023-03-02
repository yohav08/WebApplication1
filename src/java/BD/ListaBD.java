/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.util.ArrayList;
import java.util.List;
import modelo.SesionDTO;

/**
 *
 * @author ESTUDIANTE
 */
public class ListaBD {
    public static List <SesionDTO> lista = new ArrayList<SesionDTO>();
    public static void cargarDatos(){
        SesionDTO d1 =  new SesionDTO("Yohav08@gmail.com", "1234567", "Yohana", "3104839109");
        SesionDTO d2 =  new SesionDTO("Mora@gmail.com", "1234567", "Andres", "3104839107");
        SesionDTO d3 =  new SesionDTO("azucargmail.com", "1234567", "Diana", "3104839108");
        lista.add(d1);
        lista.add(d2);
        lista.add(d3);
        
    }
    
    
}
