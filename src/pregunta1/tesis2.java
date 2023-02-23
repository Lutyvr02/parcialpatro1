package pregunta1;

public class tesis2 {

    private static tesis2 ty= null;
    private String titulo;
    private String mencion;
    private Estudiante2 estu;
    private String hora;
    private String tema;
    public tesis2(String titulo, String mencion, Estudiante2 estu, String hora, String tema) {
        this.titulo = titulo;
        this.mencion = mencion;
        this.estu = estu;
        this.hora = hora;
        this.tema = tema;
    }
    public static tesis2 getInstance(){
        if (ty == null){
            ty = new tesis2("doctor","es bueno", Estudiante2.getInstance(),"10/12/12", "gastronomia");
        }
        return ty;
    }
}