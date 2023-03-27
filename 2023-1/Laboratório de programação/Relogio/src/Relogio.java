public class Relogio {
    //atributos:
    Ponteiro ponteiroHora;
    Ponteiro ponteiroMinuto;
    Ponteiro ponteiroSegundo;

    //métodos:
    public Relogio(Ponteiro ponteiroHora, Ponteiro ponteiroMinuto, Ponteiro ponteiroSegundo){
        this.ponteiroHora = ponteiroHora;
        this.ponteiroMinuto = ponteiroMinuto;
        this.ponteiroSegundo = ponteiroSegundo;
    }

    /* metodo acertarRelogio, que recebe os valores hora, minuto e segundo, para posicionar os ponteiros do relógio
    através do metodo setPosicao(). */
    public void acertarRelogio(int hora, int minuto, int segundo){
        this.ponteiroHora.setPosicao(hora);
        this.ponteiroMinuto.setPosicao(minuto);
        this.ponteiroSegundo.setPosicao(segundo);
    }

    //método para retornar a posição de cada ponteiro
    public int lerHora(){
        return this.ponteiroHora.getPosicao();
    }

    public int lerMinuto(){
        return this.ponteiroMinuto.getPosicao() * 5;
    }

    public int lerSegundo(){
        return this.ponteiroSegundo.getPosicao() * 5;
    }
}
