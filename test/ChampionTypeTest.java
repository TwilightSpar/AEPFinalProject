import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ChampionTypeTest {
    @Test
    public void TANKShouldHaveMoreHealthThanWARRIOR() throws Exception{
        assertEquals(true, ChampionType.TANK.hasMoreHealthThan(ChampionType.WARRIOR));
    }

    @Test(expected = IllegalArgumentException.class)
    public void CompareWARRIORWithADCWillThrowException() throws Exception{
        assertEquals(true, ChampionType.WARRIOR.hasMoreHealthThan(ChampionType.ADC));
    }

    @Test
    public void ADCShouldHaveMoreDamageThanTANK(){
        assertEquals(true, ChampionType.ADC.hasMoreDamageThan(ChampionType.TANK));
    }

    @Test
    public void DifferenceBetweenADCAndWorrier(){
        int[] diff = ChampionType.WARRIOR.difference(ChampionType.ADC);
        int[] a = {2, 2, -1, 0, 2};
         assertEquals(true, Arrays.equals(a, diff));
    }
}
