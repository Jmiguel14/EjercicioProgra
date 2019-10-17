/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author Usuario
 */
public class ClsPunto extends ClsOperaciones{
    //atributos 
    private float _cx;
    private float _cy;
    //constructores
    public ClsPunto(float cx, float cy){
        _cx=cx;
        _cy=cy;
    }
    public ClsPunto(){
        _cx=0;
        _cy=0;
    }
    public ClsPunto(ClsPunto r){
        _cx=r._cx;
        _cy=r._cy;
    }
    //metodos get y set
    //set
    public float cx(){return _cx;}
    //get
    public void cx(float valor){_cx=valor;}
    public float cy(){return _cy;}
    public void cy(float valor){_cy=valor;}
    //metodos de usuario
    public void moverx(float valor){_cx+=valor;}
    public void movery(float valor){_cy+=valor;}

    public float angulo(){
        float ang;
        ang=(float)((Math.atan(_cy/_cx))*(180/Math.PI));
        return ang;
    }
    public float distancia(){
        return (float) Math.sqrt(_cx*_cx+_cy*_cy); 
    }
    public String polar(){
        String p="coordenadas polares:  angulo=" + angulo() + "distancia=" + distancia();
        return p;
    }
    @Override
    public String ToString(){
        String r= "Coordenadas Rectangulares:   x= " + _cx + " y= " +_cy;
        return r;
    }

    @Override
    public Object mas(Object op) {
        ClsPunto r=new ClsPunto();
        ClsPunto d=(ClsPunto)op;
        r._cx=_cx+d._cx;
        r._cy=_cy+d._cy;
        return r;
    }

    @Override
    public Object menos(Object op) {
        ClsPunto r=new ClsPunto();
        ClsPunto d=(ClsPunto)op;
        r._cx=_cx-d._cx;
        r._cy=_cy-d._cy;
        return r;
    }

    @Override
    public Object por(Object op) {
        ClsPunto r=new ClsPunto();
        ClsPunto d=(ClsPunto)op;
        r._cx=_cx*d._cx;
        r._cy=_cy*d._cy;
        return r;
    }

    @Override
    public Object para(Object op) {
        ClsPunto r=new ClsPunto();
        ClsPunto d=(ClsPunto)op;
        r._cx=_cx/d._cx;
        r._cy=_cy/d._cy;
        return r;
    }

 
}
