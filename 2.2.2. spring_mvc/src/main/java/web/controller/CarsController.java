package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String PrintCars(@RequestParam(value = "locale", required = false) String locale, ModelMap model){
        CarService cars = new CarServiceImp();
        if(locale == null){
            locale = "en";
        }
        model.addAttribute("messages", cars.listCar());
        model.addAttribute("locales", locale);
        return "cars";
    }
}
