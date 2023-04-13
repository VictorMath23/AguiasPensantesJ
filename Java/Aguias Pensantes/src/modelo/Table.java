/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vsilva18
 */
public class Table extends AbstractTableModel{

    private List<Proposta> dados_proposta = new ArrayList<>();
    private String[] colunas = { "id", "dono", "proposta", "area_id", "beneficio_id", "gestor_id", "data_ideia", "status", "dias"};
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }        
            
            
    @Override
    public int getRowCount() {
        return dados_proposta.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
       
        switch(coluna){
            case 0:
                return dados_proposta.get(linha).getId();
            case 1:
                return dados_proposta.get(linha).getDono();
            case 2:
                return dados_proposta.get(linha).getProposta();
            case 3:
                return dados_proposta.get(linha).getArea_id();
            case 4:
                return dados_proposta.get(linha).getBeneficio_id();
            case 5:
                return dados_proposta.get(linha).getGestor_id();
            case 6:
                return dados_proposta.get(linha).getData_ideia();
            case 7:
                return dados_proposta.get(linha).getStatus(); 
            case 8:
                return dados_proposta.get(linha).getDias();
        }
            return null;
    }
    
    public void addRow(Proposta pp){
        this.dados_proposta.add(pp);
        fireTableDataChanged();
        fireTableStructureChanged();
    }
    
    public void removeRow(int linha){
        
        this.dados_proposta.remove(linha);
        fireTableDataChanged();
        
    }
    public void removeDados(){
        
        this.dados_proposta.clear();
        fireTableDataChanged();
    
    }
    
    public void atualizaDados(){
        
    }
    
    public void preencheTabela(List<Proposta> proposta){
        this.dados_proposta = proposta;
        fireTableDataChanged();
    }
}
