package pregunta1;

public class Estudiante1 {
//título,mención, datos del
//estudiante)

    private static Estudiante ty = null;
    private String titulo;
    private String mencion;
    private String Datos;

    public Estudiante1(String titulo, String mencion, String datos) {
        this.titulo = titulo;
        this.Datos=datos;
        this.mencion=mencion;
    }

    public static Estudiante getInstance(){
        if (ty == null){
            ty = new Estudiante("inge","es malo","vinicius jr");
        }
        return ty;
    }
}
