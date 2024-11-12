package Controller;

import Model.Cliente;
import Model.Equipamento;
import java.util.ArrayList;

public class Controller {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Equipamento> equipamentos = new ArrayList<>();

    //CRUD -> Criar, Ler, Atualizar, e Deletar

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void cadastrarEquipamento(Equipamento equipamento){
        equipamentos.add(equipamento);
    }
    public void removerCliente(Cliente cliente){
        clientes.remove(cliente);
    }
    public void removerEquipamento(Equipamento equipamento){
        equipamentos.remove(equipamento);
    }
    public void listarCliente(ArrayList<Cliente> clientes){
        if(clientes.isEmpty()){
            System.out.println("Sem cliente cadastrado");
        } else {
            System.out.println("Clientes cadastrados: ");
            for (Cliente cliente : clientes){
                System.out.println(" - " + cliente);
            }
        }
    }
    public void listarEquipamento(ArrayList<Equipamento> equipamentos){
        if(equipamentos.isEmpty()){
            System.out.println("Sem equipamento cadastrado");
        } else {
            System.out.println("Equipamentos cadastrados: ");
            for (Equipamento equipamento : equipamentos){
                System.out.println(" - " + equipamento);
            }
        }
    }
    public void alterarCliente(Cliente alterarcliente) {
        for (Cliente cliente : clientes){
            if (cliente.getId_cliente() == alterarcliente.getId_cliente()) { // Supondo que o Cliente tem um ID único
                cliente = alterarcliente;

                System.out.println("Cliente atualizado");
                break;
            }
        }
    }
    public void alterarEquipamento(Equipamento alterarequipamento){
        for (Equipamento equipamento : equipamentos){
            if (equipamento.getId() == alterarequipamento.getId()) { // Supondo que o Cliente tem um ID único
                equipamento = alterarequipamento;

                System.out.println("Equipamento atualizado");
                break;
            }
        }
    }
}
