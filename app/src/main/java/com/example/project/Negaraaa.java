package com.example.project;

import java.io.Serializable;
import java.util.List;

public class Negaraaa implements Serializable {
    private Bendera flags;
        private  Logo coatOfArms;
        private String region;
        private Lokasi maps;
        private NamaNegara name;
        private Float area;
        private  Float population;
        private List<String> continents;
        private String flag;

    public Bendera getFlags() {
        return flags;
    }

    public void setFlags(Bendera flags) {
        this.flags = flags;
    }

    public Logo getCoatOfArms() {
        return coatOfArms;
    }

    public void setCoatOfArms(Logo coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Lokasi getMaps() {
        return maps;
    }

    public void setMaps(Lokasi maps) {
        this.maps = maps;
    }

    public NamaNegara getName() {
        return name;
    }

    public void setName(NamaNegara name) {
        this.name = name;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Float getPopulation() {
        return population;
    }

    public void setPopulation(Float population) {
        this.population = population;
    }

    public List<String> getContinents() {
        return continents;
    }

    public void setContinents(List<String> continents) {
        this.continents = continents;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
