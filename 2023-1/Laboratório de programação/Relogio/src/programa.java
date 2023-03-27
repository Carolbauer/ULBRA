public class programa {
    public static void main(String[] args) {
        /*criando os tres objetos da classse Ponteiro, um para poneteiroHora, ponteiroMinuto e ponteiroSegundo*/
        Ponteiro ponteiroHora = new Ponteiro(5);
        Ponteiro ponteiroMinuto = new Ponteiro(6);
        Ponteiro ponteiroSegundo = new Ponteiro(3);

        /*criando o objeto da classe Relogio, recebendo os objetos criados da classe Ponteiro*/
        Relogio relogio = new Relogio(ponteiroHora, ponteiroMinuto, ponteiroSegundo);

        /*acertando o relógio, chamndo o método acertarRelogio da classe Relogio,
        recebendo como p   arametros os valores da hora, minutos e segundos*/
        relogio.acertarRelogio(5,6,3);

        /*imprimindo os valores do relogio utlizando os métodos lerHora, lerMinuto e lerSegungo da classe Relogio*/
        System.out.println("São " + relogio.lerHora() + "horas, " + relogio.lerMinuto() + "minutos e " + relogio.lerSegundo() + "segundos. ");
    }
}
