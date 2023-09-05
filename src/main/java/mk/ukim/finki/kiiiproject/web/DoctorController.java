package mk.ukim.finki.kiiiproject.web;

import mk.ukim.finki.kiiiproject.service.DepartmentService;
import mk.ukim.finki.kiiiproject.service.DoctorService;
import mk.ukim.finki.kiiiproject.service.HospitalService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;
    private final DepartmentService departmentService;
    private final HospitalService hospitalService;

    public DoctorController(DoctorService doctorService, DepartmentService departmentService, HospitalService hospitalService) {
        this.doctorService = doctorService;
        this.departmentService = departmentService;
        this.hospitalService = hospitalService;
    }

    @GetMapping("/all")
    public String getAllDoctorsPage (Model model,
                                     @RequestParam(defaultValue = "") String department,
                                     @RequestParam(defaultValue = "") String hospital,
                                     @RequestParam(defaultValue = "1") Integer page,
                                     @RequestParam(defaultValue = "10") Integer size) {
        model.addAttribute("departments", this.departmentService.findAll());
        model.addAttribute("hospitals", this.hospitalService.findAll());
        model.addAttribute("page", this.doctorService.filterAndPaginate(department, hospital, page, size));

        return "listDoctors";

    }

    @GetMapping("/add")
    public String showAddPage(Model model) {
        model.addAttribute("departments", this.departmentService.findAll());
        model.addAttribute("hospitals", this.hospitalService.findAll());

        return "addDoctor";
    }

    @PostMapping("/add")
    public String add(@RequestParam String name,
                      @RequestParam String surname,
                      @RequestParam Long departmentId,
                      @RequestParam Long hospitalId) {

        this.doctorService.add(name, surname, departmentId, hospitalId);

        return "redirect:/doctors/all";
    }
}
