package io.gft.msavaliadorcredito.ex;

import lombok.Getter;

public class ErroComunicacaoMicroServicesException extends Exception{
    @Getter
    private Integer status;
    public ErroComunicacaoMicroServicesException(String msg,Integer status){
        super(msg);
        this.status = status;
    }



}
