package com.example.demo.model;

import java.io.Serializable;

public class BTResponseVO implements Serializable {

    BTClientResponseVO clientResponseVO;

    public BTClientResponseVO getClientResponseVO() {
        return clientResponseVO;
    }

    public void setClientResponseVO(BTClientResponseVO clientResponseVO) {
        this.clientResponseVO = clientResponseVO;
    }
}
