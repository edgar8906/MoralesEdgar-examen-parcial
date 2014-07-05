package com.edgar.web;

import java.util.ArrayList;

public class GeneradorCalificaciones {
    
    public static ArrayList<Evaluacion> generarCalificaciones(){
        
        ArrayList<Evaluacion> arregloevaluacion= new ArrayList<Evaluacion>();
        
        Evaluacion e1;
        
        e1 = new Evaluacion("petra", (float) 5.8);
        arregloevaluacion.add(e1);
        
        e1 = new Evaluacion("jose", (float) 7.4);
        arregloevaluacion.add(e1);
        
        e1 = new Evaluacion("roberta", (float) 8.6);
        arregloevaluacion.add(e1);
        
        return arregloevaluacion;
    }    
}