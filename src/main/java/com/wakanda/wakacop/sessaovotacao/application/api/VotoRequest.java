package com.wakanda.wakacop.sessaovotacao.application.api;

import com.wakanda.wakacop.sessaovotacao.domain.OpcaoVoto;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class VotoRequest {

    private String cpfAssociado;
    private OpcaoVoto opcaoVoto;
}
