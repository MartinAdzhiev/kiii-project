package mk.ukim.finki.kiiiproject.web;

import mk.ukim.finki.kiiiproject.service.HospitalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hospital")
public class HospitalController {

    private final HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping("/add")
    public String showAddPage() {
        return "addHospital";
    }

    @PostMapping("/add")
    public String add(@RequestParam String name,
                      @RequestParam String city) {
        this.hospitalService.add(name, city);

        return "redirect:/doctors/all";
    }
}
