package pregunta1;

public class tesis1 {

    private static tesis1 ty= null;
    private String titulo;
    private String mencion;
    private Estudiante1 estu;
    private String hora;
    private String tema;
    public tesis1(String titulo, String mencion, Estudiante1 estu, String hora, String tema) {
        this.titulo = titulo;
        this.mencion = mencion;
        this.estu = estu;
        this.hora = hora;
        this.tema = tema;
    }

    public static tesis1 getInstance(){
        if (ty == null){
            ty = new tesis1("doctor","es bueno", new Estudiante1("inge","es malo",
                    "vinicius jr"),"10/12/12", "Exploracion");
        }
        return ty;
    }
}