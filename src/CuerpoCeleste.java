import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {

    enum TipoCuerpoCeleste {
        ESTRELLA,PLANETA,PLANETA_ENANO,LUNA,COMETA,ASTEROIDE
    }

    private String nombre;
    private double periodoorbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipocuerpo;

    public CuerpoCeleste(String nombre, double periodoorbital, TipoCuerpoCeleste tipocuerpo) {
        this.nombre = nombre;
        this.periodoorbital = periodoorbital;
        this.tipocuerpo = tipocuerpo;
        this.satelites=new HashSet<CuerpoCeleste>();


    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoorbital() {
        return periodoorbital;
    }

    public TipoCuerpoCeleste getTipocuerpo() {
        return tipocuerpo;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return satelites;
    }

    public boolean addSatelite(CuerpoCeleste satelite){

        return satelites.add(satelite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CuerpoCeleste)) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return nombre.equals(that.nombre) && tipocuerpo == that.tipocuerpo;
    }

    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + tipocuerpo.hashCode();
        result = 31 * result + 1234;
        return result;
    }

    @Override
    public String toString() {
        return "CuerpoCeleste: " +
                "nombre='" + nombre + '\'' +
                ", periodoorbital=" + periodoorbital +
                ", satelites=" + satelites +
                ", tipocuerpo=" + tipocuerpo +
        ".";
    }
}
