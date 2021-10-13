package cenarioRegistro;

import java.math.BigDecimal;

import cenarioRegistro.http.ApacheHttpAdapter;
import cenarioRegistro.http.JavaHttpAdapter;
import cenarioRegistro.orcamento.Orcamento;
import cenarioRegistro.orcamento.RegistroOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpAdapter());
		registro.registrar(orcamento);
	}

}
