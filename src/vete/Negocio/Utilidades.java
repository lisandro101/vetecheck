package vete.Negocio;

import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 * Clase Utilidades
 * @author Grupo 7
 * @version 1.0
 */
public class Utilidades {

    static Utilidades instancia = null;

    public Utilidades() {
    }

    public static synchronized Utilidades getInstancia() {

        if (instancia == null) {
            instancia = new Utilidades();
        }

        return instancia;

    }


    /**
     * Limpia los campos de el contenedor.
     * @param contenedor
     */
    public void limpiarCampos(Container contenedor) {

        List<Component> componentes = arrayToList(contenedor.getComponents());

        for (Component component : componentes) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText("");
            } else if (component instanceof JComboBox) {
                ((JComboBox) component).setSelectedIndex(0);
            }
        }
    }

    public <T extends Object> List<T> arrayToList(T[] objetos) {

        List<T> resultados = new ArrayList<T>();

        for (int i = 0; i < objetos.length; i++) {

            resultados.add(objetos[i]);

        }

        return resultados;
    }

    /**
     * Metodo est�tico que convierte un tipo Date a un String
     * @param fecha Date a convertir en String
     * @return Se devuelve un String con la fecha
     * @see java.util.Date
     */
    public static String dateToString(Date fecha) {
        Calendar cale = Calendar.getInstance();
        cale.setTime(fecha);

        int dia;
        int mes;
        int anio;

        dia = cale.get(Calendar.DAY_OF_MONTH);
        mes = cale.get(Calendar.MONTH) + 1;
        anio = cale.get(Calendar.YEAR);

        String fechaCadena = anio + "-" + mes + "-" + dia;

        return fechaCadena;
    }

    /**
     * Metodo est�tico que convierte un tipo String a un Date
     * @param fecha String a convertir a un Date
     * @return Se devuelve un Date con la fecha
     * @see java.util.Date
     */
    public static Date stringToDate(String fecha) {
        int dia = 0;
        int mes = 0;
        int anio = 0;
        int bandera = 0;
        Date fechaDate;
        Calendar cal = Calendar.getInstance();
        String resto = "";

        for (int x = 0; x < fecha.length(); x++) {
            if (fecha.substring(x, x + 1).compareTo("-") == 0 && bandera == 0) {
                anio = Integer.parseInt(fecha.substring(0, x));
                resto = fecha.substring(x + 1, fecha.length());
                bandera = 1;
            }
        }

        for (int x = 0; x < resto.length(); x++) {
            if (resto.substring(x, x + 1).compareTo("-") == 0) {
                mes = Integer.parseInt(resto.substring(0, x));
                dia = Integer.parseInt(resto.substring(x + 1, resto.length()));
            }
        }

        cal.set(anio + 1900, mes, dia);
        fechaDate = cal.getTime();

        return fechaDate;
    }

    /**
     * Metodo estatico que calcula la diferencia en d�as entre dos fechas del tipo Date
     * @param fechaInicial Date que contiene la fecha inicial
     * @param fechaFinal Date que contiene la fecha final
     * @return Se devuelve un int con la diferencia en d�as entre la fecha inicial y la final
     * @see java.util.Date
     */
    public static int diferenciaDiasEntreFechas(Date fechaInicial, Date fechaFinal) {
        long dias = (fechaFinal.getTime() - fechaInicial.getTime()) / (24 * 60 * 60 * 1000);
        return (int) dias;
    }

}
