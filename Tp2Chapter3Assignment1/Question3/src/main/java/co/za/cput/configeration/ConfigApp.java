package co.za.cput.configeration;





import co.za.cput.implementations.BmwM2Impl;
import co.za.cput.implementations.FordFocusRsImpl;
import co.za.cput.implementations.MercedesA45Impl;
import co.za.cput.services.CarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
public class ConfigApp {

   @Bean(name = "BmwM2")
   public CarService getBmwM2()
   {
       return new BmwM2Impl();
   }

    @Bean(name = "FordFocusRS")
    public CarService getFordFocusRs()
    {
        return new FordFocusRsImpl();
    }

    @Bean(name = "MercedesA45")
    public CarService getMercedesA45()
    {
       return new MercedesA45Impl();
    }




}
