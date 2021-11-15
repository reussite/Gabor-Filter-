/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpchapitre2;

import ij.IJ;
import ij.ImagePlus;
import ij.io.Opener;
import ij.process.ImageConverter;
import ij.process.ImageProcessor;

/**
 *
 * @author CHARMEL
 */
public class Tpchapitre2 {

    /**
     * @param args the command line arguments
     */
    public Tpchapitre2(String path){

        Opener opener = new Opener();
        ImagePlus imp = opener.openImage(path);
        imp.show();
        IJ.wait(2000);
        new ImageConverter(imp).convertToGray8();
        ImageProcessor ip = imp.getProcessor();
        IJ.log("nvg before invert = " +ip.get(100,500));
       // imp.show();
        ip.invert();
        imp.show();
        IJ.wait(2000);
        IJ.log("nvg after invert = " +ip.get(100,500));
        ip.invert();
        imp.show();
        
        /*
        
        /*
            La classe Opener permet de rechercher et de sélectionner un fichier ;
            La classe ImagePlus représente l’image ;
            L’instruction new ImageConverter(imp).convertToGray8() convertit l’image
            contenu dans l’objet ImagePlus en image 8 bits niveau de gris ;
            La classe ImageProcessor permet de faire des opérations sur les pixels.
        */
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Tpchapitre2("");
    }
    
}
