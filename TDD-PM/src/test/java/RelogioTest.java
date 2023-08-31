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

}
