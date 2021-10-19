package Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class demandesReader
{
    public static void main(String args[])
    {
        try
        {
            // Le fichier d'entrée
            File file = new File("C:\\Users\\yunap\\IdeaProjects\\TP_Duvivier_M2_2021\\src\\services.txt");
            // Créer l'objet File Reader
            FileReader fr = new FileReader(file);
            // Créer l'objet BufferedReader
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            while((line = br.readLine()) != null)
            {
                // ajoute la ligne au buffer
                sb.append(line);
                sb.append("\n");
            }
            fr.close();
            System.out.println("Contenu du fichier: ");
            System.out.println(sb.toString());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
