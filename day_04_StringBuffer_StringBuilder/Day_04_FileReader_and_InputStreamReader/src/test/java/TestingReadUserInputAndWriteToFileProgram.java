import org.junit.jupiter.api.Test;
import readuserinput.ReadUserInputAndWriteToFile;

public class TestingReadUserInputAndWriteToFileProgram
{
    @Test
    void f()
    {
        ReadUserInputAndWriteToFile obj = new ReadUserInputAndWriteToFile();
        //obj.writeDataInFile();
        obj.readDataInFile();
    }
}
