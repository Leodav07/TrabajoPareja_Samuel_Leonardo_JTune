package jtunes_trabajoparejas;

import javax.swing.ImageIcon;

public class JTunes {

    private static JTunes instancia;
    SongClass canciones[];

    private JTunes() {
        canciones = new SongClass[10];
    }

    public static JTunes getInstance() {
        if (instancia == null) {
            instancia = new JTunes();
        }
        return instancia;
    }

    public boolean addSong(int codigo, String nombre, double precio, ImageIcon imagenDisco) {

        if (searchSong(codigo) == null) {
            for (int i = 0; i < canciones.length; i++) {
                if (canciones[i] == null) {
                    canciones[i] = new SongClass(codigo, nombre, precio, imagenDisco);
                    return true;
                }
            }

            return false;
        }

        return false;
    }

    public SongClass searchSong(int codigo) {
        for (SongClass cancion : canciones) {
            if (cancion != null && cancion.getCodigo() == codigo) {
                return cancion;
            }
        }
        return null;
    }

    public void rateSong(int codigo, int stars) {
        SongClass cancion = searchSong(codigo);
        if (cancion != null) {
            cancion.addStars(stars);
        }
    }

    public SongClass[] getAllSongs() {
        int contador = 0;
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                contador++;
            }
        }

        SongClass cancionesDisponibles[] = new SongClass[contador];
        int indx = 0;

        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                cancionesDisponibles[indx] = canciones[i];
                indx++;
            }
        }
        return cancionesDisponibles;
    }
}
