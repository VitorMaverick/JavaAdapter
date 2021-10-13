package cenarioRegistro.http;

import java.util.Map;

public class ApacheHttpAdapter implements HttpAdapter {

	@Override
	public void post(String url, String dados) {
		// Chamada a API via Apache HTTP Client...
		System.out.println("Registrando orcamento via Apache HTTP Client");
	}

}
