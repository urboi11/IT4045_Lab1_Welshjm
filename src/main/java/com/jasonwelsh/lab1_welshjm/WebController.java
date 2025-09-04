package com.jasonwelsh.lab1_welshjm;

import java.io.FileWriter;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        try {
            
            return "about";
            
        } catch (Exception e) {
            try{
                FileWriter myWriter = new FileWriter("debug.txt");
                myWriter.write(e.toString());
                myWriter.close();
            }
            catch(IOException e2) {
                System.out.println(e2);
            }

            System.out.println(e.getMessage());
        }
        return "";
    }

}
