package pregunta1;

public class Estudiante3 {
//título,mención, datos del
//estudiante)

    private static Estudiante3 ty = null;
    private String titulo;
    private String mencion;
    private String Datos;

    public Estudiante3(String titulo, String mencion, String datos) {
        this.titulo = titulo;
        this.Datos=datos;
        this.mencion=mencion;
    }

    public static Estudiante3 getInstance(){
        if (ty == null){
            ty = new Estudiante3("profesor","muy malo explicando","Luciano vargas");
        }
        return ty;
    }
}