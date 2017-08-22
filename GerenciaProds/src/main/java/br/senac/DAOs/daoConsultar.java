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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author josue.minacio
 */
public class daoConsultar {

    public static List<Produto> consultar(String valor)
            throws SQLException, Exception {
        //Monta a string de consulta de clientes no banco
        String sql = "SELECT * FROM prod WHERE nome=? ";
        //Lista de clientes de resultado
        List<Produto> listaProdutos = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setLong(1, Long.parseLong(valor));
            preparedStatement.setBoolean(2, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaClientes == null) {
                    listaClientes = new ArrayList<>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("cliente_id"));
                cliente.setNome(result.getString("nome"));
                cliente.setCpf(Long.toString(result.getLong("cpf")));
                cliente.setCep(Integer.toString(result.getInt("cep")));
                cliente.setEndereco(result.getString("endereco"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setGenero(result.getString("sexo"));
                cliente.setEstado(result.getString("estado"));
                cliente.setTelefone(result.getString("telefone"));
                cliente.setEmail(result.getString("email"));
                Date d = new Date(result.getTimestamp("data_nasc").getTime());
                cliente.setDataNascimento(d);
                //Adiciona a instância na lista
                listaClientes.add(cliente);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaClientes;
    }
