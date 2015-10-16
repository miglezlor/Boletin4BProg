
package boletin4b;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Consumo {
    //atributos
    private float kilometros;
    private float litros;
    private float velocidadMedia;
    private float precioGasolina;
    
    //constructores
    public Consumo(){
        
    }
    public Consumo(float km, float lit, float vMed, float pGas){
           kilometros=km;
           litros=lit;
           velocidadMedia=vMed;
           precioGasolina=pGas;
                   
    }
    public float getTempo (){
        return kilometros/velocidadMedia;
    }
    public float consumoMedio (){
        return litros*100/kilometros;
    }
    public float consumoEuros (){
        return precioGasolina*100/kilometros;
    }
    public void setKms (float km){
        kilometros=km;
    }
    public void setLitros (float lit){
        litros=lit;
    }
    public void setvMed (float vMed){
        velocidadMedia=vMed;
    }
    public void setpGas (float pGas){
        precioGasolina=pGas;
    }
    public float getLitros (){
        return litros;
    }
    public float getpGas(){
        return precioGasolina;
    }
    public float getvMed(){
        return velocidadMedia;
    }

}
