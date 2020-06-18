package adapter.myEjercicio;

public class Client {

    public static void main (String [] args){

        AutoElectrico autoElectrico = new AutoElectrico();

        AutoDiesel autoDiesel = new AutoDiesel();
        AutoGasolinaEspecial autoGasolinaEspecial =  new AutoGasolinaEspecial();
        AutoGasolina autoGasolina = new AutoGasolina();
        AdaptadorAutoElectrico adaptadorAutoElectrico = new AdaptadorAutoElectrico(autoElectrico);

        autoDiesel.llenarGasolina();
        autoDiesel.estadoCombustible();
        System.out.println("-----------------------");

        autoGasolina.llenarGasolina();
        autoGasolina.estadoCombustible();
        System.out.println("-----------------------");

        autoGasolinaEspecial.llenarGasolina();
        autoGasolinaEspecial.estadoCombustible();
        System.out.println("-----------------------");

        adaptadorAutoElectrico.llenarGasolina();
        adaptadorAutoElectrico.estadoCombustible();




    }


}
