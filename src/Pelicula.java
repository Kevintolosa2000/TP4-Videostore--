import java.time.LocalDate;
//region Parametros
public class Pelicula {
    private String titulo;
    private String genero;
    private String desc;
    private String pais;
    private String pegi;
    private Integer duracion;
    private Integer stock;

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", desc='" + desc + '\'' +
                ", pais='" + pais + '\'' +
                ", pegi='" + pegi + '\'' +
                ", duracion=" + duracion +
                ", stock=" + stock +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    private String fecha;
//endregion

    public Pelicula() {
        this.stock=5;
    }



    public Pelicula(String titulo, String genero, String desc, String pais, String pegi, Integer duracion, Integer stock, String fecha) {
        this.titulo = titulo;
        this.genero = genero;
        this.desc = desc;
        this.pais = pais;
        this.pegi = pegi;
        this.duracion = duracion;
        this.fecha = fecha;
        this.stock=stock;
    }
    //region getterSetters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPegi() {
        return pegi;
    }

    public void setPegi(String pegi) {
        this.pegi = pegi;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }




    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

//endregion

}
