package pregunta1;

public class Estudiante4 {
//título,mención, datos del
//estudiante)

    private static Estudiante4 ty = null;
    private String titulo;
    private String mencion;
    private String Datos;

    public Estudiante4(String titulo, String mencion, String datos) {
        this.titulo = titulo;
        this.Datos=datos;
        this.mencion=mencion;
    }

    public static Estudiante4 getInstance(){
        if (ty == null){
            ty = new Estudiante4("vagabundo","homeless","Luciano vargas");
        }
        return ty;
    }
}