package pregunta1;

public class Estudiante2 {
//título,mención, datos del
//estudiante)

    private static Estudiante ty = null;
    private String titulo;
    private String mencion;
    private String Datos;

    public Estudiante2(String titulo, String mencion, String datos) {
        this.titulo = titulo;
        this.Datos=datos;
        this.mencion=mencion;
    }

    public static Estudiante getInstance(){
        if (ty == null){
            ty = new Estudiante("futbolista","el balon de oro","KArim benzema");
        }
        return ty;
    }
}