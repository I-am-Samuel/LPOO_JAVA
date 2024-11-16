package Aula06;

/**
 * ControleRemoto
 */
public class ControleRemoto implements Controlador{
    private int  volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }
    
    public boolean getLigado(){
        return this.ligado = true;
    }

    public boolean getTocando() {
        return this.tocando = true;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (ligado) {
            System.out.println(" \nON "
            + "Volume: ");
            for (int i = 0; i < 10; i++){
                System.out.println("|");
            }
            }
        }

    @Override
    public void fecharMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fecharMenu'");
    }

    @Override
    public void maisVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maisVolume'");
    }

    @Override
    public void menosVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'menosVolume'");
    }

    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligarMudo'");
    }

    @Override
    public void desligarMudo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desligarMudo'");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pause'");
    }

    
}