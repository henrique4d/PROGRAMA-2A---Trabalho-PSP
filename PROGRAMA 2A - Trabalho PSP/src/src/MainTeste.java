package src;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class MainTeste {	
	@Test
    public void testeMain() {	
		Main app = new Main();
		ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    	
		System.setIn(new ByteArrayInputStream("5\n 1 102 2 62\n 1 128 3 127\n 1 144 4 80\n 1 102 5 101\n 2 62 3 61\n 2 100 4 80\n 2 88 5 82\n 3 79 4 90\n 3 87 5 100\n 4 110 5 99".getBytes()));
    	System.setOut(new PrintStream(outputStreamCaptor));
    	app.main(null);
    	assertEquals("1 2 4 5 3",outputStreamCaptor.toString().trim());
	}
}
