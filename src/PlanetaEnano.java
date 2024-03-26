public class PlanetaEnano extends CuerpoCeleste {

    private String nombreplanetaenano;
    private double periodoorbital;

    public PlanetaEnano(String nombre, double periodoorbital, TipoCuerpoCeleste tipocuerpo, String nombreplanetaenano, double periodoorbital1) {
        super(nombre, periodoorbital, tipocuerpo);
        this.nombreplanetaenano = nombreplanetaenano;
        this.periodoorbital = periodoorbital1;
    }

    public String getNombreplanetaenano() {
        return nombreplanetaenano;
    }

    @Override
    public double getPeriodoorbital() {
        return periodoorbital;
    }

    @Override
    public String toString() {
        return "PlanetaEnano{" +
                "nombreplanetaenano='" + nombreplanetaenano + '\'' +
                ", periodoorbital=" + periodoorbital +
                '}';
    }
}
