/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Spiel.model.Entities;

import Spiel.model.Entities.monsterpack.EvilMonk;
import Spiel.model.Entities.monsterpack.Knight;
import Spiel.model.Entities.monsterpack.Ork;
import Spiel.model.Entities.monsterpack.Skelett;
import Spiel.model.Entities.monsterpack.Troll;
import Spiel.model.MainModel;
import Spiel.model.Room;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Klasse zur Generierung von Monstern für den Dungeon
 * @author Lukas
 */
public class MonsterFactory {
      private MainModel main;
      private Monster monster;

      /**
    *
    * @param main
    */
   public MonsterFactory(MainModel main) {
           this.main=main;




      }

      /**
    * Füllt den Dungeon mit Gegnern
    * @param rooms Liste die  befüllt werden sollen
    * @return Liste von Gegnern
    */
   public LinkedList populateDungeon(LinkedList<Room> rooms) {
            LinkedList monsters= new LinkedList<>();
            for (Room room : rooms) {
                  int size = room.getBreite()*room.getHoehe();
                  int anzahl= (int)(Math.ceil(size*0.02*main.getCurrentDungeonLevel()));

                  for (int i = 0; i < anzahl;) {
                      double random=(double) Spiel.model.UtilFunctions.randomizer(1, 100)/100;
                      monster=null;
                      if (random < EvilMonk.spawnrate*main.getCurrentDungeonLevel()) {
                        monster=  new EvilMonk(room.getX1()+1, room.getY1()+1, room.getBreite()-2, room.getHoehe()-2,main);
                       } else if (random < Knight.spawnrate*main.getCurrentDungeonLevel()) {
                           monster= new Knight(room.getX1()+1, room.getY1()+1, room.getBreite()-2, room.getHoehe()-2,main);
                       } else if (random < Ork.spawnrate*main.getCurrentDungeonLevel()) {
                           monster= new Ork(room.getX1()+1, room.getY1()+1, room.getBreite()-2, room.getHoehe()-2,main);
                       } else if (random < Skelett.spawnrate*main.getCurrentDungeonLevel()) {
                           monster= new Skelett(room.getX1()+1, room.getY1()+1, room.getBreite()-2, room.getHoehe()-2,main);
                       } else if (random < Troll.spawnrate*main.getCurrentDungeonLevel()) {
                           monster= new Troll(room.getX1()+1, room.getY1()+1, room.getBreite()-2, room.getHoehe()-2,main);
                       }
                      if (monster!=null) {
                       room.getEntities().add(monster);
                       monster.setRoom(room);
                       monsters.add(monster);
                       i++;

                     }

                  }

            }
            return monsters;
      }



}
