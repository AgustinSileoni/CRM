package com.agustin.CRM.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;


@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cliente_id;

    @Column(unique = true)
    private Integer numero_cliente;

    @NotNull
    private String razon_social;

    @NotNull
    @Column(unique = true)
    private Integer dni;

    @NotNull
    @Column(unique = true)
    private Long cuit;

    @NotNull
    private Integer telefono;

    @NotNull
    @Email
    private String email;

    private String observacion;

    private LocalDate fecha_nacimiento;

    @NotNull
    private LocalDate fecha_registro;


    @NotNull
    @ManyToOne
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "regimen_fiscal_id")
    private Regimen_fiscal regimen_fiscal;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tipo_cliente_id")
    private Tipo_cliente tipo_cliente;

    @OneToMany(mappedBy = "cliente")
    private Set<Cliente_contacto> contactos;

    public UUID getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(UUID cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Integer getNumero_cliente() {
        return numero_cliente;
    }

    public void setNumero_cliente(Integer numero_cliente) {
        this.numero_cliente = numero_cliente;
    }

    public @NotNull String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(@NotNull String razon_social) {
        this.razon_social = razon_social;
    }

    public @NotNull Integer getDni() {
        return dni;
    }

    public void setDni(@NotNull Integer dni) {
        this.dni = dni;
    }

    public @NotNull Long getCuit() {
        return cuit;
    }

    public void setCuit(@NotNull Long cuit) {
        this.cuit = cuit;
    }

    public @NotNull Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(@NotNull Integer telefono) {
        this.telefono = telefono;
    }

    public @NotNull @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotNull @Email String email) {
        this.email = email;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public @NotNull LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(@NotNull LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public @NotNull Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(@NotNull Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public @NotNull Regimen_fiscal getRegimen_fiscal() {
        return regimen_fiscal;
    }

    public void setRegimen_fiscal(@NotNull Regimen_fiscal regimen_fiscal) {
        this.regimen_fiscal = regimen_fiscal;
    }

    public @NotNull Tipo_cliente getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(@NotNull Tipo_cliente tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public Set<Cliente_contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Set<Cliente_contacto> contactos) {
        this.contactos = contactos;
    }
}
