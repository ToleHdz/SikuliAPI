package sikuliapi;
import org.sikuli.script.*;

public class SikuliAPI 
{
    public static void main(String[] args) 
    {
        //System.out.println("Hola Mundo");
        
        Screen s = new Screen();
                
        try
        {
            /*s.click("src/img/inicio.png", 0);
            //s.wait("src/img/calculadora.png");
            s.click("src/img/calculadora.png", 0);
            s.wait("src/img/calculadora.png");
            s.click("src/img/limpiar.png", 0);
            s.type(null, "225", 0);
            s.click("src/img/multiplicar.png", 0);
            s.wait("src/img/multiplicar.png", 0);
            s.type(null, "100", 0);
            s.click("src/img/multiplicar.png", 0);*/
            
            s.click("src/img/consola.png", 2);
            s.click("src/img/nuevaVentana",0);
            s.wait("src/img/consola.png");
            s.type(null, "cd Documents/GitHub/SikuliAPI\n");
            //s.wait("2");
            s.type(null, "ls\n");
            //s.wait("2");
            s.type(null, "git status\n");
            s.type(null, "git checkout Tole.SikuliPrueba\n");
            s.type(null, "git add .\n");
            s.type(null, "git commit -m \"Realizado desde sikuli\"\n");
            s.type(null, "git push origin Tole.SikuliPrueba\n");
            //s.wait("2");
            
            Match existeCalculadora = s.exists("src/img/calculadora.png");
            
            if (existeCalculadora != null) 
            {
                System.out.println("Se encuentra la imagen en esta pantalla ");
            }
            else
            {
                System.out.println("No se encuentra esta imagen en la pantalla");
            }
        }
        catch(FindFailed e)
        {
            e.printStackTrace();
        }
    }
    
}
