package Aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, float ponta){
        this.modelo = modelo;
        this.ponta = ponta;
        tampar();
    }

    public void status(){
        System.out.println("Modelo: " + getModelo() + " | Ponta: " + getPonta());
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar(){
        tampada = true;
    }

    public void destampar(){
        tampada = false;
    }

    public void rabiscar(){
        if (tampada) {
            System.out.println("Precisa destampar a caneta!");
        } else{
            System.out.println("Rabiscando");
        }
    }
}
