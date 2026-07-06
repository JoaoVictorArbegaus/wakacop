package com.wakanda.wakacop.sessaovotacao.application.service;

import com.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;

import java.util.UUID;

public interface SessaoVotacaoRepository {
    SessaoVotacao salva(SessaoVotacao sessaoVotacao);

    SessaoVotacao buscaPorId(UUID idSessao);
}
