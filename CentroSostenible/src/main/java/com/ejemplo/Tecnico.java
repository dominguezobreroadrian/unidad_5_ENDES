package com.ejemplo;


/**
 * Class Tecnico
 */
public class Tecnico {

  //
  // Fields
  //

  private String dni;
  private String nombre;
  private String id;
  
  //
  // Constructors
  //
  public Tecnico () { };
  
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

  //
  // Other methods
  //

}
