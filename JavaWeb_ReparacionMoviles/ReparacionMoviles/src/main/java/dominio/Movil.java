package dominio;

public class Movil {

    private int idMovil;
    private String marca;
    private String modelo;
    private String imei;
    private String tipoReparacion;
    private String estado;
    private double precio;
    private String nombreCliente;
    private String telefonoCliente;
    
    public Movil(){}
    
    public Movil(int idMovil){
        this.idMovil = idMovil;
    }

    public Movil(String marca, String modelo, String imei, String tipoReparacion, String estado, double precio, String nombreCliente, String telefonoCliente) {
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
        this.tipoReparacion = tipoReparacion;
        this.estado = estado;
        this.precio = precio;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
    }

    public Movil(int idMovil, String marca, String modelo, String imei, String tipoReparacion, String estado, double precio, String nombreCliente, String telefonoCliente) {
        this.idMovil = idMovil;
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
        this.tipoReparacion = tipoReparacion;
        this.estado = estado;
        this.precio = precio;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
    }

    public int getIdMovil() {
        return idMovil;
    }

    public void setIdMovil(int idMovil) {
        this.idMovil = idMovil;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(String tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    
    

    
}
