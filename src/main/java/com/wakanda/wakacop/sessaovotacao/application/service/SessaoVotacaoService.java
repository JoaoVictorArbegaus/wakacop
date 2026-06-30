package com.wakanda.wakacop.sessaovotacao.application.service;

import com.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaRequest;
import com.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaResponse;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);
}
