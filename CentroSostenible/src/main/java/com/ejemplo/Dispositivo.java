package com.ejemplo;


/**
 * Class Dispositivo
 */
public class Dispositivo {

  //
  // Fields
  //

  private String id;
  private UsuarioDonante usuarioDonante;
  private String nombre;
  private double precio;
  
  //
  // Constructors
  //
  public Dispositivo () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (String newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public String getId () {
    return id;
  }

  /**
   * Set the value of usuarioDonante
   * @param newVar the new value of usuarioDonante
   */
  public void setUsuarioDonante (UsuarioDonante newVar) {
    usuarioDonante = newVar;
  }

  /**
   * Get the value of usuarioDonante
   * @return the value of usuarioDonante
   */
  public UsuarioDonante getUsuarioDonante () {
    return usuarioDonante;
  }

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of precio
   * @param newVar the new value of precio
   */
  public void setPrecio (double newVar) {
    precio = newVar;
  }

  /**
   * Get the value of precio
   * @return the value of precio
   */
  public double getPrecio () {
    return precio;
  }

  //
  // Other methods
  //

}
