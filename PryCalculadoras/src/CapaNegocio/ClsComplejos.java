/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author Fredd
 */
public class ClsComplejos extends ClsOperaciones{
    private double _entero;
    private double _imag;

    public ClsComplejos(double _entero, double _imag) {
        this._entero = _entero;
        this._imag = _imag;
    }
    public ClsComplejos(){
        _entero=0;
        _imag=1;
    }
    public ClsComplejos(ClsComplejos s){
        _entero=s._entero;
        _imag=s._imag;
    }
    public double getEntero() {
        return _entero;
    }
    public void setEntero(double _entero) {
        this._entero = _entero;
    }
    public double getImag() {
        return _imag;
    }
    public void setImag(double _imag) {
        this._imag = _imag;
    }
    public ClsComplejos Conjugado(){
        ClsComplejos u = new ClsComplejos(this._entero,-(this._imag));
        return u;
    }
    @Override
    public String ToString(){
        String resp= "";
        resp+=this._entero;
        if(this._imag>0){
            resp+="+" + this._imag + "i";
        }else{
            resp+=this._imag + "i";
        }
        return resp;
    }

    @Override
    public Object mas(Object op) {
     ClsComplejos q= (ClsComplejos)op;  
     ClsComplejos u= new ClsComplejos((this._entero+q._entero),(this._imag+q._imag));
     return u;
    }

    @Override
    public Object menos(Object op) {
        ClsComplejos q=(ClsComplejos)op;
        ClsComplejos u= new ClsComplejos((this._entero-q._entero),(this._imag-q._imag));
        return u;
    }

    @Override
    public Object por(Object op) {
        ClsComplejos q=(ClsComplejos)op;
        ClsComplejos u = new ClsComplejos(((this._entero*q._entero)-(this._imag*q._imag)),((this._entero*q._imag)+(this._imag*q._entero)));
        return u;
    }

    @Override
    public Object para(Object op) {
        ClsComplejos q=(ClsComplejos)op;
        double a=((this._entero*q._entero)+(this._imag*q._imag))/((q._entero*q._entero)+(q._imag*q._imag));
        double b=((this._imag*q._entero)-(this._entero*q._imag))/((q._entero*q._entero)+(q._imag*q._imag));
        ClsComplejos u = new ClsComplejos(a,b);
        return u;
    }

}    