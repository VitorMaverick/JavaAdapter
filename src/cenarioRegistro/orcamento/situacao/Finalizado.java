package cenarioRegistro.orcamento.situacao;

import java.math.BigDecimal;

import cenarioRegistro.DomainException;
import cenarioRegistro.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
