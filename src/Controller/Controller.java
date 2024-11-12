package Controller;

import Model.Cliente;
import Model.Equipamento;
import java.util.ArrayList;

//CRUD -> Criar, Ler, Atualizar, e Deletar

public class Controller {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Equipamento> equipamentos = new ArrayList<>();
    private Cliente cliente;
    private Equipamento equipamento;
    private Cliente alterarcliente;
    private Equipamento alterarequipamento;


    public void cadastrarCliente(){
        clientes.add(cliente);
    }
    public void cadastrarEquipamento(){
        equipamentos.add(equipamento);
    }
    public void removerCliente(){
        clientes.remove(cliente);
    }
    public void removerEquipamento(){
        equipamentos.remove(equipamento);
    }
    public void listarCliente(){
        if(clientes.isEmpty()){
            System.out.println("Sem cliente cadastrado");
        } else {
            System.out.println("Clientes cadastrados: ");
            for (Cliente cliente : clientes){
                System.out.println(" - " + cliente);
            }
        }
    }
    public void listarEquipamento(){
        if(equipamentos.isEmpty()){
            System.out.println("Sem equipamento cadastrado");
        } else {
            System.out.println("Equipamentos cadastrados: ");
            for (Equipamento equipamento : equipamentos){
                System.out.println(" - " + equipamento);
            }
        }
    }
    public void alterarCliente() {
        for (Cliente cliente : clientes){
            if (cliente.getId_cliente() == alterarcliente.getId_cliente()) { // Supondo que o Cliente tem um ID único
                cliente = alterarcliente;

                System.out.println("Cliente atualizado");
                break;
            }
        }
    }
    public void alterarEquipamento(){
        for (Equipamento equipamento : equipamentos){

            // Supondo que o Cliente tem um ID único
            if (equipamento.getId_equipamento() == alterarequipamento.getId_equipamento()) {
                equipamento = alterarequipamento;

                System.out.println("Equipamento atualizado");
                break;
            }
        }
    }
}
