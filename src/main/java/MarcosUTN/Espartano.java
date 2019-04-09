package MarcosUTN;

public class Espartano extends Humano {
    private Integer toleranciaExtra;

    public Espartano() {

    }

    public Espartano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber, Integer toleranciaExtra) {
        super(nombre, edad, peso, orinar, beber);
        this.toleranciaExtra = toleranciaExtra;
    }

    public Integer getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    @Override
    public String toString()
    {
        return super.toString()+" Tolerancia Extra: ".concat(toleranciaExtra.toString());
    }
}
