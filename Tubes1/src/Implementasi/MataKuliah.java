/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementasi;

/**
 *
 * @author Yoga Widi Pamungkas
 */
public class MataKuliah {
    private int kodeMk;
    private String namaMk;
    private int SKS;
    private Dosen[] dosenMk;

    public void addDosen(Dosen d){
        
    }
    public int getDosenByIdx(int idx){
        return SKS;
    }
    public void setKodeMk(int kodeMk) {
        this.kodeMk = kodeMk;
    }

    public void setNamaMk(String namaMk) {
        this.namaMk = namaMk;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public void setDosenMk(Dosen[] dosenMk) {
        this.dosenMk = dosenMk;
    }

    public int getKodeMk() {
        return kodeMk;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public int getSKS() {
        return SKS;
    }

    public Dosen[] getDosenMk() {
        return dosenMk;
    }
    
    
}
