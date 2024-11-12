package Aula05;

/**
 * Banco
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        if (tipo.equals("cc")) {
            setSaldo(50);
        } else if (tipo.equals("cp")) {
            setSaldo(150);
        }
    }

    public void fecharConta(){
        if (saldo < 0 || saldo > 0) {
            if (saldo < 0) {
                System.out.println(" Para fechar a conta seu saldo não pode ser negativo! ");
            } else if (saldo > 0) {
                System.out.println(" Para fechar sua conta é preciso estar vazia! ");
            }
        } else if (saldo == 0) {
            setStatus(false);
            System.out.println("Conta foi fechada!");
        }
    }

    public void depositar(float dinheiro){
        if (status == true) {
            setSaldo(getSaldo() + dinheiro );
        } else{
            System.out.println("Conta fechada!");
        }
    }

    public void sacar(float dinheiro){
        if (status == true && saldo > 0 ) {
            setSaldo(getSaldo() - dinheiro);
        }
        else{
            System.out.println("Conta fechada!");
        }
    }

    public void pagarMensal(float valorCobrar){
        if (status == true) {
            if (tipo == "cc") {
                valorCobrar = 12;
            } else if (tipo == "cp") {
                valorCobrar = 20;
            }
        }

        if (saldo > valorCobrar) {
            setSaldo(getSaldo() - valorCobrar);
        } else if (saldo < valorCobrar) {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public String toString() {
        return "Banco [numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status="
                + status + "]";
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
}