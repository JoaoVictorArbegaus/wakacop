package com.wakanda.wakacop.pauta.application.service;

import com.wakanda.wakacop.pauta.application.api.NovaPautaRequest;
import com.wakanda.wakacop.pauta.application.api.PautaCadastraResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {
    @Override
    public PautaCadastraResponse cadastraPauta(NovaPautaRequest novaPauta) {
        return null;
    }
}
