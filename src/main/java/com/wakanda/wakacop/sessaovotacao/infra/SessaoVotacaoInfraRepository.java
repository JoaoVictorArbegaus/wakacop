package com.wakanda.wakacop.sessaovotacao.infra;

import com.wakanda.wakacop.sessaovotacao.application.service.SessaoVotacaoRepository;
import com.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2

public class SessaoVotacaoInfraRepository implements SessaoVotacaoRepository {
    private final SessaoVotacaoSpringDataJPA sessaoVotacaoSpringDataJPA;

    @Override
    public SessaoVotacao salva(SessaoVotacao sessaoVotacao) {
        log.info("[start] SessaoVotacaoInfraRepository - salva");
        sessaoVotacaoSpringDataJPA.save(sessaoVotacao);
        log.info("[finish] SessaoVotacaoInfraRepository - salva");
        return sessaoVotacao;
    }

    @Override
    public SessaoVotacao buscaPorId(UUID idSessao) {
        log.info("[start] SessaoVotacaoInfraRepository - buscaPorId");
        SessaoVotacao sessao = sessaoVotacaoSpringDataJPA.findById(idSessao)
                .orElseThrow(() -> new RuntimeException("Sessão não encontrada!"));
        log.info("[finish] SessaoVotacaoInfraRepository - buscaPorId");
        return sessao;
    }
}
