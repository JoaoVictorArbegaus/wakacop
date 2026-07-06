package com.wakanda.wakacop.pauta.infra;

import com.wakanda.wakacop.pauta.application.service.PautaRepository;
import com.wakanda.wakacop.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
@RequiredArgsConstructor
@Log4j2
public class PautaInfraRepository implements PautaRepository {
    private final PautaSpringDataJPARepository pautaSpringDataJPARepository;

    @Override
    public Pauta salva(Pauta pauta) {
        log.info("[start] PautaInfraRepository - salva");

        pautaSpringDataJPARepository.save(pauta);

        log.info("[finish] PautaInfraRepository - salva");
        return pauta;
    }

    @Override
    public Pauta buscaPautaPorId(UUID idPauta) {
        log.info("[start] PautaInfraRepository - buscaPautaPorId");

        Pauta pautaPorID = pautaSpringDataJPARepository.findById(idPauta)
                .orElseThrow(() -> new RuntimeException("Pauta nao encontrada"));

        log.info("[finish] PautaInfraRepository - buscaPautaPorId");
        return pautaPorID;
    }
}
