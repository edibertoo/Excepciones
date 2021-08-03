package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class App {
    public static void main( String[] args) throws FileNotFoundException{
        //Creacion de variable donde guardara nuestro archivo de texto
        File MiArchivo;
        MiArchivo = new File("Archivo1.txt");
    }
    //Creacion del Archivo
    public static void createFile(File MiArchivo){
        try{
            if(MiArchivo.createNewFile()){
                System.out.println("Archivo Creado Correctamente: " + MiArchivo.getName());
            }else {
                System.out.println("Este archivo ya existe ");
            }
        }catch (IOException e){
            System.out.println("Error ");
            e.printStackTrace();
        }
    }

    //Contenido del Archivo de pruba
    public static void writeContent(File MiArchivo, String contents){
        FileWriter writer = null;
        try{
            writer = new FileWriter(MiArchivo);
            writer.write(contents);
            System.out.println("Editar Archivo " + contents);
            writer.close();
        }catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }


    //Lectura de contenido del archivo
    public static void readContent(File MiArchivo) throws FileNotFoundException{
        try{
            Scanner reader = new Scanner(MiArchivo);
            System.out.println("Cargando Archivo de Texto");
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }


    //Ruta del archivo
    public static  void getPath(File MiArchivo){
        System.out.println("Ruta de Archivo " + MiArchivo.getAbsolutePath());
    }


    //Eliminación del archivo
    public static void deleteFile(File MiArchivo){
        if(MiArchivo.delete()){
            System.out.println("Borrar el Archivo de Texto" + MiArchivo.getName());
        }else {
            System.out.println("Error");
        }
    }
}
