import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameProgressTests {

    @Test
    public void testCreatingGameProgress () {

        //arrange
        GameProgress testGameProgress = new GameProgress(10, 10, 25, 405.5);

        //assert
        Assertions.assertNotNull(testGameProgress);
        System.out.println(testGameProgress);

    }

    @Test
    public void testCreatingFolder () {

        //arrange
        GameProgress testGameProgress = new GameProgress(10, 10, 25, 405.5);

        //assert
        Assertions.assertNotNull(testGameProgress);
        System.out.println(testGameProgress);

    }
}
