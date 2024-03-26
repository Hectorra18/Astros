import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static HashMap<String,CuerpoCeleste> sistemaSolar = new HashMap<>();
    public static Set<CuerpoCeleste> planetas = new HashSet<>();
    public static Set<CuerpoCeleste> lunas = new HashSet<>();

    public static void main(String[] args) {


        CuerpoCeleste Mercurio = new CuerpoCeleste("Mercurio",88, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Venus = new CuerpoCeleste("Venus",225, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste LaTierra = new CuerpoCeleste("La Tierra",365, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Marte = new CuerpoCeleste("Marte",687, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Jupiter = new CuerpoCeleste("Jupiter",4332, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Saturno = new CuerpoCeleste("Saturno",10759, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Urano = new CuerpoCeleste("Urano",30660, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Neptuno = new CuerpoCeleste("Neptuno",1665, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Pluton = new CuerpoCeleste("Pluton",248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Plutón = new CuerpoCeleste("Plutón",884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO);
        //"Plutón" se me añade en la lista de planetas
        //Aun que "Plutón" sea un planeta enano, no se añade

        // 1er satelite
        CuerpoCeleste cuerpo1 = new CuerpoCeleste("Satelite1",27, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Satelite1",cuerpo1);
        LaTierra.addSatelite(cuerpo1);

        // Phobos y Deimos
        CuerpoCeleste Deimos = new CuerpoCeleste("Deimos",1.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste Phobos = new CuerpoCeleste("Phobos",0.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Deimos",Deimos);
        sistemaSolar.put("Phobos",Phobos);
        Marte.addSatelite(Deimos);
        Marte.addSatelite(Phobos);

        //Satelites Jupiter

        CuerpoCeleste Io = new CuerpoCeleste("Io",1.8, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste Europa = new CuerpoCeleste("Europa",3.5, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste Ganymede = new CuerpoCeleste("Ganymede",7.1, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste Callisto = new CuerpoCeleste("Callisto",16.7, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Io",Io);
        sistemaSolar.put("Europa",Europa);
        sistemaSolar.put("Ganymede",Ganymede);
        sistemaSolar.put("Callisto",Callisto);
        Jupiter.addSatelite(Io);
        Jupiter.addSatelite(Europa);
        Jupiter.addSatelite(Ganymede);
        Jupiter.addSatelite(Callisto);

        //Añadir los planetas al sistema solar

        sistemaSolar.put("Mercurio",Mercurio);
        sistemaSolar.put("Venus",Venus);
        sistemaSolar.put("La Tierra",LaTierra);
        sistemaSolar.put("Marte",Marte);
        sistemaSolar.put("Jupiter",Jupiter);
        sistemaSolar.put("Saturno",Saturno);
        sistemaSolar.put("Urano",Urano);
        sistemaSolar.put("Neptuno",Neptuno);
        sistemaSolar.put("Pluton",Pluton);
        sistemaSolar.put("Plutón",Plutón);


        //Añadir los planetas a "planetas"
        planetas.add(Mercurio);
        planetas.add(Venus);
        planetas.add(LaTierra);
        planetas.add(Marte);
        planetas.add(Jupiter);
        planetas.add(Saturno);
        planetas.add(Urano);
        planetas.add(Neptuno);
        planetas.add(Pluton);
        planetas.add(Plutón);


        // Añadir los satelites a "lunas"
        lunas.add(cuerpo1);
        lunas.add(Deimos);
        lunas.add(Phobos);
        lunas.add(Io);
        lunas.add(Europa);
        lunas.add(Ganymede);
        lunas.add(Callisto);

        System.out.println("Los planetas son:" + "\n");

        for (CuerpoCeleste cuerpoCeleste:
             planetas)
        {

            System.out.println(cuerpoCeleste);
        }

        System.out.println("\n" + "Las lunas son    :" + "\n");
        System.out.println(sistemaSolar.put("Marte",Marte).getSatelites());


    for (CuerpoCeleste cuerpoCeleste: lunas){

        System.out.println(cuerpoCeleste);
    }


    }
}
