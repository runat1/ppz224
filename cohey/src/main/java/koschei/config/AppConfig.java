package koschei.config;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public static Duck5 getDuck5(){
        return new Duck5();
    }
    @Bean
    public static Egg6 getEgg6(){
        return new Egg6();
    }
    @Bean
    public static Needle7 getNeedle7(){
        return new Needle7();
    }

}
