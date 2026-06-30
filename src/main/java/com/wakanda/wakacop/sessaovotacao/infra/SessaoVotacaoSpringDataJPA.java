package com.wakanda.wakacop.sessaovotacao.infra;

import com.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SessaoVotacaoSpringDataJPA extends JpaRepository<SessaoVotacao, UUID> {
}
