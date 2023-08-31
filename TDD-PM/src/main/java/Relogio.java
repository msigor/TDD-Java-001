public class Relogio {
    private int horas;
    private int minutos;
    private int segundos;

    public void programarHorario(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public String obterHorario() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public void reiniciarMeiaNoite() {
        this.horas = 12;
        this.minutos = 15;
        this.segundos = 59;
    }

}
