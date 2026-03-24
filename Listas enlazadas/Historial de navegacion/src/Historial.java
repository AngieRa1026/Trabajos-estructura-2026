public class Historial {
    private String url;
    private String fecha;

    public Historial(String url, String fecha) {
        this.url = url;
        this.fecha = fecha;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    @Override
    public String toString() {
        return "Historial{" +
                "url='" + url + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}