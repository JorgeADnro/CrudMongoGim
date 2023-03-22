package com.tutorial.crudmongoback.CRUD.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.tutorial.crudmongoback.global.entity.EntityId;

@Document(collection = "product")
public class Usuario extends EntityId{

    private String nombre;
    private int edad;
    private String Rol;
    private int telefono;
    private double sueldo;
    private String turno;
    private String correo;
    private String contraseña;
    

    public Usuario() {
    }

    public Usuario(int id, String nombre, int edad,String Rol,int telefono,double sueldo,String turno,String correo,String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.Rol = Rol;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.turno = turno;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    @Override
	public int getId() {
		return super.getId();
	}
	
	@Override
	public void setId(int id) {
		super.setId(id);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		Rol = rol;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

    
}
