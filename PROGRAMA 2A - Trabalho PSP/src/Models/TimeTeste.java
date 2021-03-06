package Models;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;


public class TimeTeste {
	Time time = new Time();
	
    @Test
    public void testeSetAtacante() {	
    	time.set_pontos(10);
    	int result = time.pontos;
     	assertEquals(result, 10);	
    }
    
    @Test
    public void testeSetInscricao() {	
    	time.set_inscricao(10);
    	int result = time.inscricao;
     	assertEquals(result, 10);	
    }
    
    @Test
    public void testeSetFeitos() {	
    	time.set_feitos(10);
    	int result = time.feitos;
     	assertEquals(result, 10);	
    }
    
    @Test
    public void testeSetTomados() {	
    	time.set_tomados(10);
    	int result = time.tomados;
     	assertEquals(result, 10);	
    }
    
    @Test
    public void testeGetAtacante() {	
    	time.set_pontos(10);
    	int result = time.get_pontos();
     	assertEquals(result, 10);	
    }
    
    @Test
    public void testeGetInscricao() {	
    	time.set_inscricao(10);
    	int result = time.get_inscricao();
     	assertEquals(result, 10);	
    }
    
    @Test
    public void testeGetFeitos() {	
    	time.set_feitos(10);
    	int result = time.get_feitos();
     	assertEquals(result, 10);	
    }
    
    @Test
    public void testeGetTomados() {	
    	time.set_tomados(10);
    	int result = time.get_tomados();
     	assertEquals(result, 10);	
    }
    
    @Test
    public void testeGetAverage() {	
    	time.set_feitos(10);
    	time.set_tomados(4);
    	double result = time.get_cesta_average();
     	assertEquals(result, 2,5);
    }

	@Test
    public void testeGetAverage0() {	
    	time.set_feitos(10);
    	time.set_tomados(0);
    	double result = time.get_cesta_average();
     	assertEquals(result, 10,0);
    }
    
}
