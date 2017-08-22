package br.senac.josue.gerenciaprods.Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.senac.josue.gerenciaprods.Classes.ProdutoException;

/**
 *
 * @author rafael.rsilva22
 */
public class ValidadorProd {
    public static void validar (Produto prod) throws ProdutoException{
         
        if (prod == null) {
            throw new ProdutoException("Não foi informado um produto.");
        }
        if(prod.getDescricao() == null || prod.getDescricao().length()>25){
            throw new ProdutoException("Não foi informado uma descrição válida para o produto.");
        }
        if(prod.getNome()== null || prod.getNome().length()>50){
            throw new ProdutoException("Não foi informado uma nome válida para o produto.");
        }
        if(prod.getCategoria() == null || prod.getCategoria().length()>30){
            throw new ProdutoException("Não foi informado uma categoria válida para o produto.");
        }
        if(prod.getValorCompra() == 0d || prod.getValorCompra() < 0d){
            throw new ProdutoException("Não foi informado um valor de compra válido.");
        }
        if(prod.getValorVenda()== 0d || prod.getValorVenda()< 0d){
            throw new ProdutoException("Não foi informado um valor de compra válido.");
        }
    }
}
