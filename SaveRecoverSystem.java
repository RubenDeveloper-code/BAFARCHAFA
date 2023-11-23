import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;

class SaveRecoverSystem {
    final static String fileName = "PRODUCTOS.DAT";
    SaveRecoverSystem() {
        createFile();
    }
    public void createFile() {
        File file = new File(fileName);
        if(file.exists())return;
        try {
            file.createNewFile();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void saveArray(Producto[] array) throws IOException, FileNotFoundException {
        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(array);
            out.close();
        }
    }
    public Producto[] readArray() throws IOException, ClassNotFoundException,FileNotFoundException {
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            in.close();
            return (Producto[])in.readObject();
        }
    }
}
