package com.manage.api.repository.lancamento;

import java.util.List;

import com.manage.api.model.Lancamento;
import com.manage.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
