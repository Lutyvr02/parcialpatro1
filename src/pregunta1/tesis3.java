package pregunta1;

public class tesis3 {

    private static tesis3 ty= null;
    private String titulo;
    private String mencion;
    private Estudiante3 estu;
    private String hora;
    private String tema;
    public tesis3(String titulo, String mencion, Estudiante3 estu, String hora, String tema) {
        this.titulo = titulo;
        this.mencion = mencion;
        this.estu = estu;
        this.hora = hora;
        this.tema = tema;
    }
    public static tesis3 getInstance(){
        if (ty == null){
            ty = new tesis3("doctor","es bueno", new Estudiante3("profesor",
                    "muy malo explicando","Luciano vargas"),"10/12/12", "sicario");
        }
        return ty;
    }
}