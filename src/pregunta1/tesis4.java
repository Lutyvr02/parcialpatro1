package pregunta1;

public class tesis4 {

    private static tesis4 ty= null;
    private String titulo;
    private String mencion;
    private Estudiante4 estu;
    private String hora;
    private String tema;
    public tesis4(String titulo, String mencion, Estudiante4 estu, String hora, String tema) {
        this.titulo = titulo;
        this.mencion = mencion;
        this.estu = estu;
        this.hora = hora;
        this.tema = tema;
    }

    public static tesis4 getInstance(){
        if (ty == null){
            ty = new tesis4("doctor","es bueno", new Estudiante4("vagabundo","homeless","Luciano vargas")
                    ,"10/12/12", "exploracion");
        }
        return ty;
    }
}
