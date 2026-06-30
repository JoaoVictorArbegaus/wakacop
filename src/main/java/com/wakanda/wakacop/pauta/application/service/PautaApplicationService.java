package com.wakanda.wakacop.pauta.application.service;

import com.wakanda.wakacop.pauta.application.api.NovaPautaRequest;
import com.wakanda.wakacop.pauta.application.api.PautaAPI;
import com.wakanda.wakacop.pauta.application.api.PautaCadastraResponse;
import com.wakanda.wakacop.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {
    private final PautaRepository pautaRepository;

    @Override
    public PautaCadastraResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[start] PautaApplicationService - cadastraPauta");

        Pauta pauta = pautaRepository.salva(new Pauta(novaPauta));

        log.info("[finish] PautaApplicationService - cadastraPauta");
        return new PautaCadastraResponse(pauta);
    }

    @Override
    public Pauta getPautaPorId(UUID idPauta) {

        log.info("[start] PautaApplicationService - getPautaPorId");

        Pauta pautaPorId = pautaRepository.buscaPautaPorId(idPauta);

        log.info("[finish] PautaApplicationService - getPautaPorId");

        return null;
    }
}
