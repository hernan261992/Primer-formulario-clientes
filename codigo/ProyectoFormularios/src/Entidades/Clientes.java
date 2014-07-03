package Entidades;

public class Clientes {
    //declarar atributos
    private String codigo;
    //declarar atributos
    private String nombres;
    //declarar atributos
    private String apellidos;
    //declarar atributos
    private String tipo;
    //declarar atributos
    private String telefono;
    private String direccion;
    private String fechaNac;
    private String fechaIng;
    private String sexo;
    private String cargos;
    private String afiliado;
    private String estudios;
    
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public String getFechaNac() {
        return fechaNac;
    }

    
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    
    public String getFechaIng() {
        return fechaIng;
    }

    
    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    
    public String getSexo() {
        return sexo;
    }

    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    public String getCargos() {
        return cargos;
    }

   
    public void setCargos(String cargos) {
        this.cargos = cargos;
    }

    
    public String getAfiliado() {
        return afiliado;
    }

   
    public void setAfiliado(String afiliado) {
        this.afiliado = afiliado;
    }

    
    public String getEstudios() {
        return estudios;
    }

    
    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
