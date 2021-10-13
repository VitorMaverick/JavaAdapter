package cenarioRegistro.orcamento;

import java.util.Map;

import cenarioRegistro.DomainException;
import cenarioRegistro.http.HttpAdapter;

public class RegistroOrcamento {

	private HttpAdapter httpAdapter;

	public RegistroOrcamento(HttpAdapter httpAdapter) {
		this.httpAdapter = httpAdapter;
	}

	public void registrar(Orcamento orcamento) {
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento nao finalizado nao pode ser registrado!");
		}

		String urlApi = "https://jsonplaceholder.typicode.com/posts";
		String dadosApi =
			"valor=" + orcamento.getValor() +
			"&quantidadeItens=" + orcamento.getQuantidadeItens();


		httpAdapter.post(urlApi, dadosApi);
	}

}
