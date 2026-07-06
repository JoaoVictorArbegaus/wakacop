package com.wakanda.wakacop.sessaovotacao.application.service;

import com.wakanda.wakacop.pauta.application.service.PautaRepository;
import com.wakanda.wakacop.pauta.application.service.PautaService;
import com.wakanda.wakacop.pauta.domain.Pauta;
import com.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaRequest;
import com.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaResponse;
import com.wakanda.wakacop.sessaovotacao.application.api.VotoRequest;
import com.wakanda.wakacop.sessaovotacao.application.api.VotoResponse;
import com.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import com.wakanda.wakacop.sessaovotacao.domain.VotoPauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@Log4j2
@RequiredArgsConstructor
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {

    private final SessaoVotacaoRepository sessaoVotacaoRepository;
    private final PautaService pautaService;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
        log.info("[start] SessaoVotacaoApplicationService - abreSessao");

        Pauta pauta = pautaService.getPautaPorId(sessaoAberturaRequest.getIdPauta());
        SessaoVotacao sessaoVotacao = sessaoVotacaoRepository.salva(new SessaoVotacao(sessaoAberturaRequest, pauta));

        log.info("[finish] SessaoVotacaoApplicationService - abreSessao");
        return new SessaoAberturaResponse(sessaoVotacao);
    }

    @Override
    public VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto) {
        log.info("[start] SessaoVotacaoApplicationService - recebeVoto");

        SessaoVotacao sessao = sessaoVotacaoRepository.buscaPorId(idSessao);
        VotoPauta voto = sessao.recebeVoto(novoVoto);
        sessaoVotacaoRepository.salva(sessao);

        log.info("[finish] SessaoVotacaoApplicationService - recebeVoto");
        return new VotoResponse(voto);
    }
}
