/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author gabri
 */
public class PedidoDTO {
    private String cod_ped;
    private String dataPedido;
    private String gasto;
    private String cpf;
    private String cod_end;
    private String numero;

    public PedidoDTO() {
    }

    public String getCod_ped() {
        return cod_ped;
    }

    public void setCod_ped(String cod_ped) {
        this.cod_ped = cod_ped;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getGasto() {
        return gasto;
    }

    public void setGasto(String gasto) {
        this.gasto = gasto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCod_end() {
        return cod_end;
    }

    public void setCod_end(String cod_end) {
        this.cod_end = cod_end;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
