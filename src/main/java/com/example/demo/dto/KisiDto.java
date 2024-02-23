package com.example.demo.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.List;
@Data
@ApiModel(value = "User Api model documentation", description = "Model")
public class KisiDto {

    @ApiModelProperty(value = "Unique id field of user object")
    private Long id;
    @ApiModelProperty(value = "Name field of user object")
    private String adi;
    @ApiModelProperty(value = "Surname field of user object")
    private String soyadi;
    @ApiModelProperty(value = "Adres field of user object")
    private List<String> adresler;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public List<String> getAdresler() {
        return adresler;
    }

    public void setAdresler(List<String> adresler) {
        this.adresler = adresler;
    }



}
