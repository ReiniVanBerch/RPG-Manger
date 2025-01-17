
package inc.prettyhatemachin.e.App;

import inc.prettyhatemachin.e.Quality.*;
import inc.prettyhatemachin.e.Quality.FixedValue;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.*;
import java.util.ArrayList;

public class Character implements Serializable {







        private final StringProperty name;
        private final IntegerProperty health;
        private final IntegerProperty constitution;
        private final IntegerProperty strength;
        private final ArrayList<StringProperty> items = new ArrayList<>();
        public FixedValue name_value;
        public ChangingValue health_value;
        public ChangingValue constitution_value;
        public ChangingValue strength_value;

        public Character (String name, int health, int constitution, int strength, ArrayList<String> itemsin) {
            this.name = new SimpleStringProperty(name);
            this.health = new SimpleIntegerProperty(health);
            this.constitution = new SimpleIntegerProperty(constitution);
            this.strength = new SimpleIntegerProperty(strength);
            for(String item : itemsin){
                items.add(new SimpleStringProperty(item));
            }
        }

        public String getName() {
            return name.get();
        }

        public StringProperty nameProperty() {
            return name;
        }

        public int getHealth() {
            return health.get();
        }

        public IntegerProperty healthProperty() {
            return health;
        }

        public int getConstitution() {
            return constitution.get();
        }

        public IntegerProperty constitutionProperty() {
            return constitution;
        }

        public int getStrength() {
            return strength.get();
        }

        public IntegerProperty strengthProperty() {
            return strength;
        }

        public ArrayList<String> getItems() {
            //return items;
            return new ArrayList<>();
        }

    public ArrayList<StringProperty> itemsProperty() {
        return items;
    }
    public void setName(String newname) {
        name.set(newname);
    }
    public void setHealth(int newhealth){
        health.set(newhealth);
    }
    public void setConstitution(int newconst){
        constitution.set(newconst);
    }
    public void setStrength(int newstrength){
        strength.set(newstrength);
    }
    public void addItems(String newitems){
        items.add(new SimpleStringProperty(newitems));
    }



    public static void saveCharacter(Character object, String filename) {
            try (FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Character loadChar(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Character) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Fehler beim Laden: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    /*

List <> sachen
    Claudius von Vengaberg  Cool RPG
    Trevor Michael
    RPG for Bros
    -> Ideen für Sachen HP (int) XP ranged Value Name fixed String Background Story
    Character Bild
    Sachen:
    Morbit
    Character + Closebutton
    Flo
    Startseite JavaFX
    Hera
    Characterpage - JavaFX
    Ayden


*/


}

