package xyz.terrific.utils.jframe;

import javax.swing.table.AbstractTableModel;

/**
 * @author TerrificTable55
 */
public class TableModel extends AbstractTableModel {

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    public boolean isCellEditable(int row, int column){
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

}
