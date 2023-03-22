package com.tutorial.crudmongoback.CRUD.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class UsuarioDto {
    @NotBlank(message = "El nombre es requerido")
    private String nombre;
    @Min(value = 1, message = "La edad es requerida")
    private int edad;
    @NotBlank(message = "El rol es requerido")
    private String Rol;
    @Min(value = 1, message = "El telefono es requerido")
    private int telefono;
    @Min(value = 1, message = "El sueldo es requerido")
    private double sueldo;
    @NotBlank(message = "El turno es requerido")
    private String turno;
    @NotBlank(message = "El correo es requerido")
    private String correo;
    @NotBlank(message = "La contraseña es requerida")
    private String passwd;

    public UsuarioDto() {
    }

    public UsuarioDto(String nombre, int edad,String Rol,int telefono,double sueldo,String turno,String correo,String passwd) {
        this.nombre = nombre;
        this.edad = edad;
        this.Rol = Rol;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.turno = turno;
        this.correo = correo;
        this.passwd = passwd;
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

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


    
}
