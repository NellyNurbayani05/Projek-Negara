package com.example.project;

import java.io.Serializable;

public class NamaNegara implements Serializable {
    private String common;
    private String official;

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }
}
