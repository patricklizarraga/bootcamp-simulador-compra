package com.compras.simulador.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String nombreUsuario;
    private String nombreCompleto;
    private String dniUsuario;
    private String tipoTarjeta;
    private String codigoMoneda;
    private String montoCompra;
    private String cuotaCompra;
    private String teaCompra;
    private String diaPago;

    public User() {

    }

    public User(Long id, String nombreUsuario, String nombreCompleto, String dniUsuario, String tipoTarjeta, String codigoMoneda, String montoCompra, String cuotaCompra, String teaCompra, String diaPago) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.nombreCompleto = nombreCompleto;
        this.dniUsuario = dniUsuario;
        this.tipoTarjeta = tipoTarjeta;
        this.codigoMoneda = codigoMoneda;
        this.montoCompra = montoCompra;
        this.cuotaCompra = cuotaCompra;
        this.teaCompra = teaCompra;
        this.diaPago = diaPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public String getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(String montoCompra) {
        this.montoCompra = montoCompra;
    }

    public String getCuotaCompra() {
        return cuotaCompra;
    }

    public void setCuotaCompra(String cuotaCompra) {
        this.cuotaCompra = cuotaCompra;
    }

    public String getTeaCompra() {
        return teaCompra;
    }

    public void setTeaCompra(String teaCompra) {
        this.teaCompra = teaCompra;
    }

    public String getDiaPago() {
        return diaPago;
    }

    public void setDiaPago(String diaPago) {
        this.diaPago = diaPago;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", dniUsuario='" + dniUsuario + '\'' +
                ", tipoTarjeta='" + tipoTarjeta + '\'' +
                ", codigoMoneda='" + codigoMoneda + '\'' +
                ", montoCompra='" + montoCompra + '\'' +
                ", cuotaCompra='" + cuotaCompra + '\'' +
                ", teaCompra='" + teaCompra + '\'' +
                ", diaPago='" + diaPago + '\'' +
                '}';

    }
}
