/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesPolladas;

import java.io.Serializable;

/**
 *
 * @author juan.carranza
 */
public class Cliente implements Serializable{

    private String strNombre;
    private int intCantPollosCliente;
    private int intDeudaCantPollo;
    private double doubPrecioPolloda;
    private double doubCantidadKiloPollo;
    private double doubPrecioKiloPollo;
    private double doubCantidadKiloPapa;
    private double doubPrecioKiloPapa;
    private double doubCostoCondimentos;
    private double doubCostoLechuga;
    private double doubCostoLimon;
    private double doubCostoAji;
    private double  doubCostoAceite;
    private double inversionTotal;
            
    public Cliente(){
        
    }

    public Cliente( double doubCantidadKiloPollo, double doubPrecioKiloPollo, double doubCantidadKiloPapa, double doubPrecioKiloPapa, 
            double doubCostoCondimentos, double doubCostoLechuga, double doubCostoLimon, double doubCostoAji,double doubCostoAceite) {
       
        this.doubCantidadKiloPollo = doubCantidadKiloPollo;
        this.doubPrecioKiloPollo = doubPrecioKiloPollo;
        this.doubCantidadKiloPapa = doubCantidadKiloPapa;
        this.doubPrecioKiloPapa = doubPrecioKiloPapa;
        this.doubCostoCondimentos = doubCostoCondimentos;
        this.doubCostoLechuga = doubCostoLechuga;
        this.doubCostoLimon = doubCostoLimon;
        this.doubCostoAji = doubCostoAji;
        this.doubCostoAceite = doubCostoAceite;
    }

    public Cliente(String strNombre, int intCantPollosCliente, int intDeudaCantPollo, double doubPrecioPolloda) {
      this.setStrNombre(strNombre);
      this.setIntCantPollosCliente(intCantPollosCliente);
      this.setIntDeudaCantPollo(intDeudaCantPollo);
      this.setDoubPrecioPolloda(doubPrecioPolloda);
    }

    
    
    
    // getters and setters
    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }


    public int getIntCantPollosCliente() {
        return intCantPollosCliente;
    }

    public void setIntCantPollosCliente(int intCantPollosCliente) {
        this.intCantPollosCliente = intCantPollosCliente;
    }

    public int getIntDeudaCantPollo() {
        return intDeudaCantPollo;
    }

    public void setIntDeudaCantPollo(int intDeudaCantPollo) {
        this.intDeudaCantPollo = intDeudaCantPollo;
    }

    public double getDoubPrecioPolloda() {
        return doubPrecioPolloda;
    }

    public void setDoubPrecioPolloda(double doubPrecioPolloda) {
        this.doubPrecioPolloda = doubPrecioPolloda;
    }

    public double getDoubCantidadKiloPollo() {
        return doubCantidadKiloPollo;
    }

    public void setDoubCantidadKiloPollo(double doubCantidadKiloPollo) {
        this.doubCantidadKiloPollo = doubCantidadKiloPollo;
    }

    public double getDoubPrecioKiloPollo() {
        return doubPrecioKiloPollo;
    }

    public void setDoubPrecioKiloPollo(double doubPrecioKiloPollo) {
        this.doubPrecioKiloPollo = doubPrecioKiloPollo;
    }

    public double getDoubCantidadKiloPapa() {
        return doubCantidadKiloPapa;
    }

    public void setDoubCantidadKiloPapa(double doubCantidadKiloPapa) {
        this.doubCantidadKiloPapa = doubCantidadKiloPapa;
    }

    public double getDoubPrecioKiloPapa() {
        return doubPrecioKiloPapa;
    }

    public void setDoubPrecioKiloPapa(double doubPrecioKiloPapa) {
        this.doubPrecioKiloPapa = doubPrecioKiloPapa;
    }

    public double getDoubCostoCondimentos() {
        return doubCostoCondimentos;
    }

    public void setDoubCostoCondimentos(double doubCostoCondimentos) {
        this.doubCostoCondimentos = doubCostoCondimentos;
    }

    public double getDoubCostoLechuga() {
        return doubCostoLechuga;
    }

    public void setDoubCostoLechuga(double doubCostoLechuga) {
        this.doubCostoLechuga = doubCostoLechuga;
    }

    public double getDoubCostoLimon() {
        return doubCostoLimon;
    }

    public void setDoubCostoLimon(double doubCostoLimon) {
        this.doubCostoLimon = doubCostoLimon;
    }

    public double getDoubCostoAji() {
        return doubCostoAji;
    }

    public void setDoubCostoAji(double doubCostoAji) {
        this.doubCostoAji = doubCostoAji;
    }

    public double getDoubCostoAceite() {
        return doubCostoAceite;
    }

    public void setDoubCostoAceite(double doubCostoAceite) {
        this.doubCostoAceite = doubCostoAceite;
    }
    
    
    public double totalPollos(){
    return this.getDoubCantidadKiloPollo() * this.getDoubPrecioKiloPollo();
    }
    public double totalPapas(){
        return this.getDoubCantidadKiloPapa() * this.getDoubPrecioKiloPapa();
    }
    public double inversionTotal(){
        return this.totalPollos() + totalPapas()+ this.getDoubCostoCondimentos()+ this.getDoubCostoAceite()+ this.getDoubCostoAji()
               + this.getDoubCostoLechuga() + this.getDoubCostoLimon();
        
    }
    public double precioTotal(){
        return this.getDoubPrecioPolloda() * this.getIntCantPollosCliente();
    }

    public double getInversionTotal() {
        return inversionTotal;
    }

    public void setInversionTotal(double inversionTotal) {
        this.inversionTotal = inversionTotal;
    }
    
      
}
