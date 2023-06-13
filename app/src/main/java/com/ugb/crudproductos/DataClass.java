package com.ugb.crudproductos;
public class DataClass {
    private String dataTitle; //nombre
    private String dataDesc; //descripcion
    private String dataLang; //Precio
    private String dataImage; //imagen
    private String dataMarca; //Marca
    private String datadisp; //disponibilidad
    private String dataespecs; //especificaciones

    public String getDataMarca() {
        return dataMarca;
    }

    public String getDatadisp() {
        return datadisp;
    }

    public String getDataespecs() {
        return dataespecs;
    }

    private String key;
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getDataTitle() {
        return dataTitle;
    }
    public String getDataDesc() {
        return dataDesc;
    }
    public String getDataLang() {
        return dataLang;
    }
    public String getDataImage() {
        return dataImage;
    }
    public DataClass(String dataTitle, String dataDesc, String dataLang, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataLang = dataLang;
        this.dataImage = dataImage;
    }
    public DataClass(){
    }
}
