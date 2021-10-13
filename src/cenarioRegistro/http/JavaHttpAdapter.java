package cenarioRegistro.http;

import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class JavaHttpAdapter implements HttpAdapter {

	@Override
	public void post(String url, String dados) {
		URI uriApi = URI.create(url);
		HttpRequest request = HttpRequest.newBuilder()
				.header("Content-type", "application/x-www-form-urlencoded")
				.uri(uriApi)
				.POST(HttpRequest.BodyPublishers.ofString(dados)).build();

		try {
			HttpClient client = HttpClient.newBuilder().build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response);
		} catch (Exception e) {
			throw new RuntimeException("erro ao enviar dados!", e);
		}
	}

}
