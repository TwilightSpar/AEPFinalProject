import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void ZaZhiRivenIsBetterThanMe() {
        var riven = new Champion("riven", 0, 1, 2, -1, 3, ChampionType.WARRIOR);

        var ZaZhi = new Player("ZhZhi", 2, 0, 3, 0, 3, riven);
        var Me = new Player("Me", 0, 2, 4, 0, 0, riven);
        assertEquals(true, ZaZhi.isBetterThan(Me));
    }
}
