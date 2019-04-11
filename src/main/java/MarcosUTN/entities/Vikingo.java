package MarcosUTN.entities;

import MarcosUTN.interfaces.Beber;
import MarcosUTN.interfaces.Orinar;

public class Vikingo extends Humano {
    private Integer bebedorProfesional;

    public Vikingo() {

    }

    public Vikingo(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber, Integer bebedorProfesional) {
        super(nombre, edad, peso, orinar, beber);
        this.bebedorProfesional = bebedorProfesional;
    }

    public Integer getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(Integer bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }

    @Override
    public String toString()
    {
        return super.toString()+" Bebedor Profesional: ".concat(bebedorProfesional.toString());
    }

    @Override
    public Integer fight() {
        return this.getBeber().Beber() + this.getBebedorProfesional() - this.getOrinar().Orinar();
    }
}
