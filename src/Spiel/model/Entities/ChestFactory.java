/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Spiel.model.Entities;

import Spiel.model.Entities.Items.Armor.Armor;
import Spiel.model.Entities.Items.Armor.Armor.Armortype;
import Spiel.model.Entities.Items.Armor.BodyArmor;
import Spiel.model.Entities.Items.Armor.Gloves;
import Spiel.model.Entities.Items.Armor.Helmet;
import Spiel.model.Entities.Items.Armor.Shield;
import Spiel.model.Entities.Items.Armor.Shoes;
import Spiel.model.Entities.Items.Heiltrank;
import Spiel.model.Entities.Items.Schwert;
import Spiel.model.Entities.Items.Trank;
import Spiel.model.MainModel;
import Spiel.model.Room;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lukas
 */
public class ChestFactory {
       private LinkedList chestlist;
       private MainModel main;
       private ArrayList items= new ArrayList();
       
      public ChestFactory(MainModel main) {
        this.main = main;
            for (Armortype t: Armortype.values()) {
                for (int i = 0; i < 10; i++) {

                }
          }
            items.add(new Heiltrank(Trank.Size.GROß,null));
            items.add(new Heiltrank(Trank.Size.MITTEL,null));
            items.add(new Heiltrank(Trank.Size.KLEIN,null));
            items.add(new Schwert.Dolch());
            items.add(new Schwert.Kurzschwert());
            items.add(new Schwert.Flammenschwert());
            items.add(new Schwert.Frostschwert());
            items.add(new Schwert.Grasklinge());
            items.add(new Schwert.Donnerschwert());
            items.add(new Schwert.MagischesSchwert());
            items.add(new Schwert.Zweihänder());
            items.add(new BodyArmor.LHemd());
            items.add(new BodyArmor.DHemd());
            items.add(new BodyArmor.Lederrüstung());
            items.add(new BodyArmor.Eisenrüstung());
            items.add(new BodyArmor.Bronzerüstung());
            items.add(new BodyArmor.Silberrüstung());
            items.add(new BodyArmor.Goldrüstung());
            items.add(new Gloves.Lederhandschuhe());
            items.add(new Gloves.GLederhandschuhe());
            items.add(new Gloves.VLederhandschuhe());
            items.add(new Gloves.BrauneLederhandschuhe());
            items.add(new Gloves.BlutroteHandschuhe());
            items.add(new Gloves.GenieteteHandschuhe());
            items.add(new Gloves.EisenplattenHandschuhe());
            items.add(new Shoes.Stoffschuhe());
            items.add(new Shoes.WaldläuferSchuhe());
            items.add(new Shoes.GepanzerteSandalen());
            items.add(new Shoes.Plattenschuhe());
            items.add(new Shoes.HermesStiefel());
            items.add(new Shoes.SchwarzeStiefel());
            items.add(new Shoes.BlutroteSchuhe());
            items.add(new Shield.Holzschild());
            items.add(new Shield.VerstärktesHolzschild());
            items.add(new Shield.Wappenschild());
            items.add(new Shield.VerstärktesWappenschild());
            items.add(new Shield.RundesEisenschild());
            items.add(new Shield.GehärtetesRundesEisenschild());
            items.add(new Shield.EisernesWappenschild());
            items.add(new Shield.Plattenschild());
            items.add(new Shield.RundesPlattenschild());
            items.add(new Shield.GoldenesSchild());
            items.add(new Helmet.Kappe());
            items.add(new Helmet.LederHelm());
            items.add(new Helmet.Eisenhelm());
            items.add(new Helmet.Kriegshelm());
            items.add(new Helmet.Ritterhelm());



      
      }
      
      

      
    public LinkedList populateDungeon(LinkedList<Room> rooms) {
        LinkedList chests = new LinkedList<>();

        for (Room room : rooms) {
            int size = room.getBreite() * room.getHoehe();
            int anzahl = (int)(size*0.01);

            for (int i = 0; i <= anzahl; i++) {
                //  Chance das Chest gespawnt wird.
                if (Spiel.model.Utilites.randomizer(1, 10) < 4) {
                    
                    Chest chest = new Chest(0, 0, 'C', main,items);

                    chest.setstartposition(room.getX1() + 1, room.getY1() + 1, room.getBreite() - 2, room.getHoehe() - 2);

                    chests.add(chest);
                }
            }
        }
        return chests;
    }

      public LinkedList getChestlist() {
            return chestlist;
      }

      public void setChestlist(LinkedList chestlist) {
            this.chestlist = chestlist;
      }     
}
