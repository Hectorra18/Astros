import java.util.Set;

public class Planeta extends CuerpoCeleste {

    private String nombreplaneta;
    private double periodoorbital;

    public Planeta(String nombre, double periodoorbital, TipoCuerpoCeleste tipocuerpo, String nombreplaneta, double periodoorbital1) {
        super(nombre, periodoorbital, tipocuerpo);
        this.nombreplaneta = nombreplaneta;
        this.periodoorbital = periodoorbital1;

    }


    public boolean addSatelite(Set<CuerpoCeleste> satelites) {


        return satelites.add(this);
    }

    public String getNombreplaneta() {
        return nombreplaneta;
    }

    @Override
    public double getPeriodoorbital() {
        return periodoorbital;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombreplaneta='" + nombreplaneta + '\'' +
                ", periodoorbital=" + periodoorbital +
                '}';
    }
}

