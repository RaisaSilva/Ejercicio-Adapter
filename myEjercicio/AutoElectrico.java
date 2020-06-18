package adapter.myEjercicio;

public class AutoElectrico {

    int numCarga;
    int estadoElec;

    public AutoElectrico() {
        this.estadoElec= (int)(Math.random()*100+1);
        this.numCarga= (int)(Math.random()*100+1);
    }

    public void cargar() {
        System.out.println("Cargar...porcentaje de carga: "+numCarga+" %");
    }

    public void estadoElectrico(){
        System.out.println("Estado de electricidad... "+estadoElec);

    }



}
