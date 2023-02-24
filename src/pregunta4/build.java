package pregunta4;

public abstract class build {
    protected produ pr;

    public produ getPr(){
        return pr;
    }

    public void createprodu(){
        pr = new produ();
    }

    public abstract void buildcosto();
    public abstract void buildempresa();
    public abstract void buildlistacanales();

}
