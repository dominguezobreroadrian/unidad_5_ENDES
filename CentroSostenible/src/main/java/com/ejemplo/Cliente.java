package com.ejemplo;


/**
 * Class Cliente
 */
public class Cliente {

  //
  // Fields
  //

  private String dni;
  private String nombre;
  
  //
  // Constructors
  //
  public Cliente () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of dni
   * @param newVar the new value of dni
   */
  public void setDni (String newVar) {
    dni = newVar;
  }

  /**
   * Get the value of dni
   * @return the value of dni
   */
  public String getDni () {
    return dni;
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

  //
  // Other methods
  //

}
