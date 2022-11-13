package com.kantor.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AccountBallanceDto {

    private Long id;
    private Long userId;
    private LocalDateTime datetime;
    private double pln;
    private double usd;
    private double eur;
    private double chf;
    private double btc;

    public AccountBallanceDto(double pln, double usd, double eur, double chf, double btc) {
        this.pln = pln;
        this.usd = usd;
        this.eur = eur;
        this.chf = chf;
        this.btc = btc;
    }

    public AccountBallanceDto(LocalDateTime datetime, double pln, double usd, double eur, double chf, double btc) {
        this.datetime = datetime;
        this.pln = pln;
        this.usd = usd;
        this.eur = eur;
        this.chf = chf;
        this.btc = btc;
    }
}
