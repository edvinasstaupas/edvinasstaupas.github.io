package lt.roaringlionentertainment.fuelprice.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@SpringBootApplication
public class ServerApplication {

    @GetMapping
    public String home() {
        return DateTimeFormatter.ISO_DATE_TIME.format(OffsetDateTime.now());
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
