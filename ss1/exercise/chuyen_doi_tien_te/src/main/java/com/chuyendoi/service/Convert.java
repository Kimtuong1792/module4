package com.chuyendoi.service;

import org.springframework.stereotype.Service;

@Service
public class Convert implements IConvert{
    @Override
    public Double money(Double usd) {

        return usd * 23000   ;
    }
}
