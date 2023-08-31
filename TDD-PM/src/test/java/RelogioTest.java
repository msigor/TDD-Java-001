import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RelogioTest {

    @Test
    public void testProgramarRelogio() {
        Relogio relogio = new Relogio();
        relogio.programarHorario(10, 30, 0);

        assertEquals("10:30:00", relogio.obterHorario());
    }
    @Test
    public void testReiniciarMeiaNoite() {
        Relogio relogio = new Relogio();
        relogio.reiniciarMeiaNoite();

        assertEquals("00:00:00", relogio.obterHorario());
    }

    @Test
    public void testMarcarIntervaloTempo() {
        Relogio relogio = new Relogio();

        // Marcar intervalo de tempo de 5 segundos
        relogio.programarHorario(10, 0, 0);
        relogio.marcarInicioIntervalo();
        // Simular aguardar por 5 segundos (pode variar de acordo com a abordagem)
        relogio.programarHorario(10, 0, 5);
        relogio.marcarFimIntervalo();

        assertEquals("00:00:05", relogio.obterHorario());
    }

    @Test
    public void testImprimirHoraFormato24h() {
        Relogio relogio = new Relogio();
        relogio.programarHorario(14, 30, 0); // 2:30 PM

        String horaFormato24h = relogio.obterHorarioFormato24h();

        assertEquals("14:30:00", horaFormato24h);
    }

    @Test
    public void testAtualizarHorarioPassagemTempo() {
        Relogio relogio = new Relogio();
        relogio.programarHorario(12, 0, 0); // Inicializar o relógio para 12:00:00

        // Simular passagem de 1 hora e 30 minutos pelo Sistema Operacional
        relogio.atualizarHorarioPassagemTempo(1, 30, 0);

        assertEquals("13:30:00", relogio.obterHorario());
    }


}
