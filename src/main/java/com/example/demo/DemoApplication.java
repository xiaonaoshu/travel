package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.demo.mapper")
@SpringBootApplication(scanBasePackages={"com.example.demo.*"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        System.out.println("(♥◠‿◠)ﾉﾞ  启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   ____    _   _    ____    ____   _____   ____    ____          \n" +
                "  / ___|  | | | |  / ___|  / ___| | ____| / ___|  / ___|         \n" +
                "  \\___ \\  | | | | | |     | |     |  _|   \\___ \\  \\___ \\   \n" +
                "   ___) | | |_| | | |___  | |___  | |___   ___) |  ___) |        \n" +
                "  |____/   \\___/   \\____|  \\____| |_____| |____/  |____/      ");
    }

}

