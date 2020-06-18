package adapter.myEjercicio;

public class AdaptadorAutoElectrico implements IEmpresaAutos {

    private AutoElectrico autoElectrico;

    public AdaptadorAutoElectrico(AutoElectrico autoElectrico) {
        this.autoElectrico = autoElectrico;
    }

    @Override
    public void llenarGasolina() {
        this.autoElectrico.cargar();
    }

    @Override
    public void estadoCombustible() {
        this.autoElectrico.estadoElectrico();
    }


}
