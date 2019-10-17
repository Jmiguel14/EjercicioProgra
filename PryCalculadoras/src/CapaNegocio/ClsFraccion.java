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
public class ClsFraccion extends ClsOperaciones{
    private int _num, _den;

    public ClsFraccion(int num, int den) {
        this._num = num;
        if(den != 0){
            this._den = den;
        }
    }
    public ClsFraccion (){
        _num=0;
        _den=1;
    }
    public ClsFraccion(ClsFraccion s){
        _num=s._num;
        _den=s._den;
    }

    public void setNum(int _num) {
        this._num = _num;
    }

    public void setDen(int _den) {
        this._den = _den;
    }

    public int getNum() {
        return _num;
    }

    public int getDen() {
        return _den;
    }
    public double valor(){
        double res=(double)_num/_den;
        return res;
    }
    public void Simplificar(){
        int div=2;
        while(_num>=div && _den>=div){
            while (_num%div==0 && _den%div==0){
                _num=_num/div;
                _den=_den/div;
            }
            div+=1;
        }
    }
    @Override
    public String ToString(){
        String resp = " ";
        if (_num>_den){
            resp= (_num/_den)+ "  ";
        }
        resp=resp+_num%_den + "/" + _den;;
        return resp;
    }

    @Override
    public Object mas(Object op) {
        ClsFraccion r=new ClsFraccion();
        ClsFraccion a1=((ClsFraccion)op);
        r._num=(_den*a1._num)+(_num*a1._den);
        r._den=(_den*a1._den);
        return r;
    }

    @Override
    public Object menos(Object op) {
        ClsFraccion r = new ClsFraccion();
        ClsFraccion q= (ClsFraccion)op;
        r._den=_den*q._den;
        r._num= (_num*q._den)-(q._num*_den);
        return r;           
    }

    @Override
    public Object por(Object op) {
        ClsFraccion r = new ClsFraccion();
        ClsFraccion q=(ClsFraccion)op;
        r._den=_den*q._den;
        r._num= _num*q._num;
        return  r;     
    }

    @Override
    public Object para(Object op) {
        ClsFraccion r = new ClsFraccion();
        ClsFraccion q= (ClsFraccion)op;
        r._num=_num*q._den;
        r._den= _den*q._num;
        return  r;   
    }



}
