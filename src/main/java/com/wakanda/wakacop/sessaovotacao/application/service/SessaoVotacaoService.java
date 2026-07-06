package com.wakanda.wakacop.sessaovotacao.application.service;

import com.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaRequest;
import com.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaResponse;
import com.wakanda.wakacop.sessaovotacao.application.api.VotoRequest;
import com.wakanda.wakacop.sessaovotacao.application.api.VotoResponse;

import java.util.UUID;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);

    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);
}
