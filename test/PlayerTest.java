import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void ZaZhiRivenIsBetterThanMe() {
        var riven = new Champion("riven", 0, 1, 2, -1, 3, ChampionType.WARRIOR);

        var ZaZhi = Player.createPlayer("ZhZhi", 2, 0, 3, 0, 3, riven);
        var Me = Player.createPlayer("Me", 0, 2, 4, 0, 0, riven);
        assertEquals(true, ZaZhi.isBetterThan(Me));
    }
    @Test(expected = IllegalArgumentException.class)
    public void CanNotCompareZaZhiToUZI() {
        var riven = new Champion("riven", 0, 1, 2, -1, 3, ChampionType.WARRIOR);
        var VN = new Champion("VN", 0, 1, 2, -1, 3, ChampionType.ADC);

        var ZaZhi = Player.createPlayer("ZhZhi", 2, 0, 3, 0, 3, riven);
        var UZI = Player.createPlayer("UZI", 0, 2, 4, 0, 0, VN);
        assertEquals(true, ZaZhi.isBetterThan(UZI));
    }

    @Test
    public void ZaZhiAbilityIsBetterThanMe() {
        var riven = new Champion("riven", 0, 1, 2, -1, 3, ChampionType.WARRIOR);

        var ZaZhi = Player.createPlayer("ZhZhi", 2, 0, 3, 0, 3, riven);
        var Me = Player.createPlayer("Me", 0, 2, 4, 0, 0, riven);
        assertEquals(true, ZaZhi.ability() > Me.ability());
    }
//
//    @Test
//    public void UseStaticGenerationFunctionToCreateObject() {
//        var riven = new Champion("riven", 0, 1, 2, -1, 3, ChampionType.WARRIOR);
//
//        var ZaZhi = Player.createPlayer("ZhZhi", 2, 0, 3, 0, 3, riven);
//        var Me = Player.createPlayer("Me", 0, 2, 4, 0, 0, riven);
//        assertEquals(false, ZaZhi.equals(Me));
//    }
}
