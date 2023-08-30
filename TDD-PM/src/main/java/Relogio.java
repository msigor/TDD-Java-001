public class Relogio {
    private int horas;
    private int minutos;
    private int segundos;

    public void programarHorario(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Integer obterHorario() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
