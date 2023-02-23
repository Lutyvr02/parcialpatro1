package pregunta1;

public class tesis {

    private static tesis ty= null;
    private String titulo;
    private String mencion;
    private Estudiante estu;
    private String hora;
    private String tema;
    public tesis(String titulo, String mencion, Estudiante estu, String hora, String tema) {
        this.titulo = titulo;
        this.mencion = mencion;
        this.estu = estu;
        this.hora = hora;
        this.tema = tema;
    }

    public static tesis getInstance(){
        if (ty == null){
            ty = new tesis("doctor","es bueno", new Estudiante("doctor","es bueno",
                    "Lucho santos"),"10/12/12", "fiestero");
        }
        return ty;
    }


}
