/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.DAOs;

import br.senac.josue.gerenciaprods.Classes.Produto;
import br.senac.utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author josue.minacio
 */
public class daoCadastrar {
        public static void inserir(Produto produto)
            throws SQLException, Exception {
        //Monta a string de inserção de um prod no BD,
        //utilizando os dados do prods passados como parâmetro
        String sql = "INSERT INTO prod (nome, descricao, "
                + "vl_compra, vl_venda, categoria, dt_inclusao) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setDouble(3, produto.getValorCompra());
            preparedStatement.setDouble(4, produto.getValorVenda());
            preparedStatement.setString(5, produto.getCategoria());
            Timestamp t = new Timestamp(produto.getDatacadastro().getTime());
            preparedStatement.setTimestamp(6, t);
            //Executa o comando no banco de dados
            preparedStatement.execute();

        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
}