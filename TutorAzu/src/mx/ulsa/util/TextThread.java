package mx.ulsa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

class TextThread extends Thread {
    private String fileNameIn;
    private String fileNameOut;

    private String pathOut;
    public TextThread(String fileNameIn, String fileNameOut, String pathOut){
        this.fileNameIn = fileNameIn;
        this.fileNameOut = fileNameOut;
        this.pathOut = pathOut;
    }

    public void run()  {
        File source = new File(fileNameIn); //"archivos\\Captura de pantalla_20230201_130735.png";
        File destination = new File(pathOut + "/" + fileNameOut); ///"\\\\175.1.59.30\\archivos\\multimedia\\equipo2.png"

        try (FileChannel sourceChannel = new FileInputStream(source).getChannel();
             FileChannel destinationChannel = new FileOutputStream(destination).getChannel()) {
            destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            System.out.println("Ha terminado la ejecucción");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}