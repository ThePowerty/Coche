package poo;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asiento_cuero;
    private boolean climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 250;
        motor = 1600;
        peso_plataforma = 700;
    }

    public String getRuedas() {
        return "ruedas: " + ruedas;
    }

    public String getLargo() {
        return "largo: " + largo + "cm";
    }

    public String getAncho() {
        return "ancho: " + ancho + "cm";
    }

    public String getAsientos() {
        if (this.asiento_cuero) {
            return "con asientos de cuero";
        } else {
            return "sin asientos de cuero";
        }
    }
    
    public String getClimatizador(){
        if (this.climatizador) {
            return "con climatizador";
        } else {
            return "sin climatizador";
        }
    }
    
    public String getColor(){
        return "color: " + color;
    }

    public String getPeso() {
        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;
        if (asiento_cuero) {
            peso_total += 50;
        }
        if (climatizador) {
            peso_total += 15;
        }
        return "Peso: " + peso_total + " kg";
    }
    
    public String getDatos(){
        return "Coche con: " + getRuedas() + " " + getColor() + " " + getPeso() + " " + getAsientos() + " " + getClimatizador();
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setAsientos(String asientos){
        this.asiento_cuero = asientos.equalsIgnoreCase("si");
    }
    
    public void setClimatizador(String climatizador){
        this.climatizador = climatizador.equalsIgnoreCase("si");
    }

}
