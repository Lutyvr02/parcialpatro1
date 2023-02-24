package pregunta4;

public class produ {

    private int costo;
    private String empresa;
    private String canale;

    public String getCanale() {
        return canale;
    }

    public void setCanale(String canale) {
        this.canale = canale;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void showinfo(){
        System.out.println("costo: "+getCosto()+"empresa: "+getEmpresa()+ "canales: "+getCanale());
    }
}
