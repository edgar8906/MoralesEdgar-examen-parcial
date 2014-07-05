package com.edgar.web;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/servicio-calificaciones")
public class ControladorExamen {
    
    @RequestMapping(value="/todos", method=RequestMethod.GET, headers=("Accept=text/html")) 
    
    public @ResponseBody String buscartodos(){
        String mensajito="probando el metodo get para enviar a todos los usuarios";
        
        
        return mensajito;
    }
    
    
    @RequestMapping(value="/usuario2", method=RequestMethod.GET, headers=("Accept=Application/json"))
    
    public @ResponseBody ArrayList<Evaluacion> mostrar(){
        
        ArrayList<Evaluacion> array = GeneradorCalificaciones.generarCalificaciones();
        
        return array;
    }

}