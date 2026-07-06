package com.wakanda.wakacop.pauta.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pauta")
public interface PautaAPI {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    PautaCadastraResponse cadastraPauta(@RequestBody NovaPautaRequest novaPauta);
}
