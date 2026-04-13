package com.ejemplo;


import java.util.*;


/**
 * Class Venta
 */
public class Venta {

  //
  // Fields
  //

  private ArrayList<Dispositivo> dispositivos;
  private double precio;
  private String id;
  
  //
  // Constructors
  //
  public Venta () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of dispositivos
   * @param newVar the new value of dispositivos
   */
  public void setDispositivos (ArrayList<Dispositivo> newVar) {
    dispositivos = newVar;
  }

  /**
   * Get the value of dispositivos
   * @return the value of dispositivos
   */
  public ArrayList<Dispositivo> getDispositivos () {
    return dispositivos;
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
