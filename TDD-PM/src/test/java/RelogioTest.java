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

}
