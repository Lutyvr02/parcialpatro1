package pregunta2;

public class celular1 implements celproto{

    //: modelo,
    //tamaño, peso, cámara (foco,lente) , imei, origen

    private String modelo;
    private int tamano;
    private int peso;
    private int foco;
    private int lente;
    private int imei;
    private String origen;

    public celular1(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getLente() {
        return lente;
    }

    public void setLente(int lente) {
        this.lente = lente;
    }

    public int getFoco() {
        return foco;
    }

    public void setFoco(int foco) {
        this.foco = foco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public celular clone() {
        celular ty = new celular();
        ty.setFoco(this.getFoco());
        ty.setImei(this.getImei());
        ty.setLente(this.getLente());
        ty.setPeso(this.getPeso());
        ty.setModelo(this.getModelo());
        ty.setOrigen(this.getOrigen());
        return ty;
    }

}