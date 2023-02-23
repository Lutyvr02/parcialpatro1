package pregunta3;

public class Pelota implements ipro{

    public Pelota(String color, int tamano, int garantia) {
        this.color = color;
        this.tamano = tamano;
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    private int tamano;
    private String color;
    private int garantia;


    @Override
    public void create() {
      System.out.println("algo");
    }
}
