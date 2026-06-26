package com.wakanda.wakacop.pauta.application.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pauta")
public interface PautaAPI {

    @PostMapping
    PautaCadastraResponse cadastraPauta(@RequestBody NovaPautaRequest novaPauta);
}
