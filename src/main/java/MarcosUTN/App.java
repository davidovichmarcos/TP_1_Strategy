package MarcosUTN;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Humano vikingo = new Vikingo("Ragnar",43,80,new OrinarVikingoImpl(),new BeberVikingoImpl(),100);
        System.out.println( "Hello World!" );
        List<Vikingo> vikingos = Arrays.asList(new Vikingo("Ragnar",43,80,new OrinarVikingoImpl(),new BeberVikingoImpl(),100),
                new Vikingo("Ragnar",43,80,new OrinarVikingoImpl(),new BeberVikingoImpl(),100));



    }
    }
