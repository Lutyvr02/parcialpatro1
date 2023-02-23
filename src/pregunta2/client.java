package pregunta2;

public class client {
    public static void main(String[] args) {
        celular ty = new celular();
        ty.setOrigen("bolivia");
        ty.setModelo("M1");
        ty.setLente(40);
        ty.setPeso(56);
        ty.setTamano(5656);
        ty.setImei(10002);
        ty.setFoco(12);


        celular ty1 = new celular();
        ty1.setOrigen("bolivia");
        ty1.setModelo("M1");
        ty1.setLente(40);
        ty1.setPeso(56);
        ty1.setTamano(5656);
        ty1.setImei(10003);
        ty1.setFoco(12);


        celular ty2 = new celular();
        ty2.setOrigen("bolivia");
        ty2.setModelo("M1");
        ty2.setLente(40);
        ty2.setPeso(56);
        ty2.setTamano(5656);
        ty2.setImei(10003);
        ty2.setFoco(12);


        celular ty3 = new celular();
        ty3.setOrigen("bolivia");
        ty3.setModelo("M1");
        ty3.setLente(40);
        ty3.setPeso(56);
        ty3.setTamano(5656);
        ty3.setImei(10002);
        ty3.setFoco(12);


        celular ty4 = new celular();
        ty4.setOrigen("bolivia");
        ty4.setModelo("M1");
        ty4.setLente(40);
        ty4.setPeso(56);
        ty4.setTamano(5656);
        ty4.setImei(10003);
        ty4.setFoco(12);

        System.out.println("celu1: "+ty.getImei()+"celu2: "+ty1.getImei()+"celu3: "+ty2.getImei()+"celu4: "+ty3.getImei()+
                "celu5: "+ty4.getImei());
    }
}
