package com.wakanda.wakacop.pauta.application.api;

import com.wakanda.wakacop.pauta.application.service.PautaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PautaController implements PautaAPI {
    private final PautaService pautaService;

    @Override
    public PautaCadastraResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[start] PautaController - cadastraPauta");
        PautaCadastraResponse pautaCadastrada = pautaService.cadastraPauta(novaPauta);
        log.info("[finish] PautaController - cadastraPauta");
        return pautaCadastrada;
    }
}
