package com.mycompany.calculadora;

public class Metodos {
    
    private String cadena;
    private double resultados;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean raiz;
    private boolean seno;
    private boolean coseno;
    private boolean tangente;
    private boolean cuadrado;
    private boolean potencia;
    private boolean logaritmo;
    
    
    public Metodos(){
        
        cadena = "";
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        raiz = false;
        seno = false;
        coseno = false;
        tangente = false;
        cuadrado = false;
        potencia = false;
        logaritmo = false;
    }
    
    public String concatenar(String cadena){
        this.cadena = this.cadena + cadena;
        return this.cadena;
    }
    
    public void suma(String cadena){
       this.resultados = Double.parseDouble(cadena);
       suma = true;
       this.cadena = "";
    }
    
    public void resta(String cadena){
       this.resultados = Double.parseDouble(cadena);
       resta = true;
       this.cadena = "";
    }
    
    public void multiplicacion(String cadena){
       this.resultados = Double.parseDouble(cadena);
       multiplicacion = true;
       this.cadena = "";
    }
    
    public void division(String cadena){
       this.resultados = Double.parseDouble(cadena);
       division = true;
       this.cadena = "";
    }
    
    public void raiz(String cadena){
       this.resultados = Double.parseDouble(cadena);
       raiz = true;
       this.cadena = "";
    }
    
    public void seno(String cadena){
       this.resultados = Double.parseDouble(cadena);
       seno = true;
       this.cadena = "";
    }
    
    public void coseno(String cadena){
       this.resultados = Double.parseDouble(cadena);
       coseno = true;
       this.cadena = "";
    }
    
    public void tangente(String cadena){
       this.resultados = Double.parseDouble(cadena);
       tangente = true;
       this.cadena = "";
    }
    
    public void cuadrado(String cadena){
       this.resultados = Double.parseDouble(cadena);
       cuadrado = true;
       this.cadena = "";
    }
    
    public void potencia(String cadena){
       this.resultados = Double.parseDouble(cadena);
       potencia = true;
       this.cadena = "";
    }
    
    public void logaritmo(String cadena){
       this.resultados = Double.parseDouble(cadena);
       logaritmo = true;
       this.cadena = "";
    }
    ////////////////////////////////////////////////////////////////////////
    
    
    public double resultado(String numero){
        
        if(suma == true){
            resultados = resultados + Double.parseDouble(numero);
        }
        else if(resta == true){
            resultados = resultados - Double.parseDouble(numero);
        }
        else if(multiplicacion == true){
            resultados = resultados * Double.parseDouble(numero);
        }
        else if(division == true){
            resultados = resultados / Double.parseDouble(numero);
        }
        else if(raiz == true){
            resultados = Math.sqrt(Double.parseDouble(numero));
        }
        else if(seno == true){
            double seno = Math.toRadians(resultados);
            resultados = Math.sin(seno);
        }
        else if(coseno == true){
            double coseno = Math.toRadians(resultados);
            resultados = Math.cos(coseno);
        }
        else if(tangente == true){
            double tangente = Math.toRadians(resultados);
            resultados = Math.tan(tangente);
        }
        else if(cuadrado == true){
            resultados = Math.pow(resultados, 2);
        }
        else if(potencia == true){
            resultados = Math.pow(resultados, Double.parseDouble(numero));
        }
        else if(logaritmo == true){
            resultados = Math.log(Double.parseDouble(numero));
        }
        
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        raiz = false;
        seno = false;
        coseno = false;
        tangente = false;
        cuadrado = false;
        potencia = false;
        logaritmo = false;
        
        return resultados; 
    }
}