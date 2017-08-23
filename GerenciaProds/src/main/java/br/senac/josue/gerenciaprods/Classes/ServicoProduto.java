/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.josue.gerenciaprods.Classes;

import br.senac.DAOs.daoCadastrar;
import br.senac.DAOs.daoConsultar;
import java.util.List;

/**
 *
 * @author Nakamura-PC
 */
public class ServicoProduto {
    //Insere um cliente na fonte de dados

    public static void cadastrarProduto(Produto produto)
            throws ProdutoException, DataException {

        //Chama o validador para verificar o produto
        ValidadorProd.validar(produto);

        try {
            //Realiza a chamada de inserção na fonte de dados
            daoCadastrar.inserir(produto);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataException("Erro na fonte de dados", e);
        }
    }

    public static void atualizarProduto(Produto produto)
            throws ProdutoException, DataException {

        //Chama o validador para verificar o produto
        ValidadorProd.validar(produto);

        try {
            //Realiza a chamada de atualização na fonte de dados
            daoCadastrar.inserir(produto);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataException("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um cliente por nome na fonte de dados
    public static List<Produto> procurarProduto(String descricao)
            throws ProdutoException, DataException {

        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do DB.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (descricao.equals("") || descricao == null) {
                return daoConsultar.consultar(descricao);
            } else {
                return daoConsultar.consultar(descricao);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataException("Erro na fonte de dados", e);
        }
    }

    //Exclui o cliente com ID informado do DB
    /*
    public static void excluirProduto(Integer id)
            throws ProdutoException, DataException {
        try {
            //Solicita ao DAO a exclusão do cliente informado
            daoProduto.excluir(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataException("Erro na fonte de dados", e);
        }
    }*/
}
