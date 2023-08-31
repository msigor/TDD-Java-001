public class Relogio {
    private int horas;
    private int minutos;
    private int segundos;

    private int horaInicioIntervalo;
    private int minutoInicioIntervalo;
    private int segundoInicioIntervalo;

    public void programarHorario(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public String obterHorario() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public void reiniciarMeiaNoite() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    public void marcarInicioIntervalo() {
        horaInicioIntervalo = horas;
        minutoInicioIntervalo = minutos;
        segundoInicioIntervalo = segundos;
    }

    public void marcarFimIntervalo() {
        int horasDecorridas = horas - horaInicioIntervalo;
        int minutosDecorridos = minutos - minutoInicioIntervalo;
        int segundosDecorridos = segundos - segundoInicioIntervalo;


        // Ajustar para lidar com subtrações negativas
        if (segundosDecorridos < 0) {
            segundosDecorridos += 60;
            minutosDecorridos--;
        }
        if (minutosDecorridos < 0) {
            minutosDecorridos += 60;
            horasDecorridas--;
        }
        if (horasDecorridas < 0) {
            horasDecorridas += 24; // Lidar com o caso de passar da meia-noite
        }

        horas = horasDecorridas;
        minutos = minutosDecorridos;
        segundos = segundosDecorridos;

    }
}
