package com.wakanda.wakacop.pauta.application.service;

import com.wakanda.wakacop.pauta.application.api.NovaPautaRequest;
import com.wakanda.wakacop.pauta.application.api.PautaCadastraResponse;
import com.wakanda.wakacop.pauta.domain.Pauta;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public interface PautaService {
    PautaCadastraResponse cadastraPauta(NovaPautaRequest novaPauta);
    Pauta getPautaPorId(UUID idPauta);
}
