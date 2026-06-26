package com.wakanda.wakacop.pauta.application.service;

import com.wakanda.wakacop.pauta.application.api.NovaPautaRequest;
import com.wakanda.wakacop.pauta.application.api.PautaCadastraResponse;

public interface PautaService {
    PautaCadastraResponse cadastraPauta(NovaPautaRequest novaPauta);
}
