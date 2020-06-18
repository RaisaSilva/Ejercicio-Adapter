package adapter.myEjercicio;

public class AutoGasolinaEspecial implements IEmpresaAutos {
    int monto;
    int estado;

    public AutoGasolinaEspecial() {
        this.monto= (int)(Math.random()*100+1);
        this.estado= (int)(Math.random()*100+1);
    }

    @Override
    public void llenarGasolina() {
        System.out.println("llenar gasolina...capacidad "+monto);
    }

    @Override
    public void estadoCombustible() {
        System.out.println("Estado del combustible: "+estado);
    }

}
