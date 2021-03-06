/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Spiel.View;

import Spiel.model.Entities.Items.Armor.Armor;
import Spiel.model.Entities.Items.Item;
import Spiel.model.Entities.Items.Waffe;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Gamer
 */
public class ItemListRenderer extends JLabel implements ListCellRenderer{
        
       public ItemListRenderer() {
        setOpaque(true);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
    } 
        
        

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Item item = (Item) value;

                if (isSelected) {
                        setBackground(list.getSelectionBackground());
                        setForeground(list.getSelectionForeground());
                } else {
                        setBackground(list.getBackground());
                        setForeground(list.getForeground());
                }

                String name = item.getName();
                if (item instanceof Armor) {
                    if (Itemwindow.armoritem[item.getSubimagex()][item.getSubimagey()]!=null) {
                            setIcon(Itemwindow.armoritem[item.getSubimagex()][item.getSubimagey()]);

                    }

                }
                if (item instanceof Waffe) {

                    if (Itemwindow.singleitem[item.getSubimagex()][item.getSubimagey()]!=null) {
                            setIcon(Itemwindow.singleitem[item.getSubimagex()][item.getSubimagey()]);

                    }

                }


                setText(name + " +"+ item.showStat());

                
                setFont(list.getFont());

                return this;
        }
}
