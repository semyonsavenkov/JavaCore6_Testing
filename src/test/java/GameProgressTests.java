import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GameProgressTests {

    GameProgress sut;

    @Test
    @BeforeEach
    public void testCreatingGameProgress () {

        //arrange
        sut = new GameProgress(10, 10, 25, 405.5);

        //assert
        Assertions.assertNotNull(sut);

    }

    @org.junit.jupiter.api.Test
    public void testDateToString () {

        // given:
        SimpleDateFormat expectedDate = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String expectedStringDate = expectedDate.format(new Date());

        //when
        String actualStringDate = Main.getStringDate();

        //then
        Assertions.assertEquals(expectedStringDate, actualStringDate );

    }

    @org.junit.jupiter.api.Test
    public void testSaveGame () {
        Main.saveGame(sut);
    }

}
