package com.ejemplo;


/**
 * Class Componente
 */
public class Componente {

  //
  // Fields
  //

  private String nombre;
  private String id;
  private int cantidad;
  
  //
  // Constructors
  //
  public Componente () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

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

  /**
   * Set the value of cantidad
   * @param newVar the new value of cantidad
   */
  public void setCantidad (int newVar) {
    cantidad = newVar;
  }

  /**
   * Get the value of cantidad
   * @return the value of cantidad
   */
  public int getCantidad () {
    return cantidad;
  }

  //
  // Other methods
  //

}
