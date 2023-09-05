package mk.ukim.finki.kiiiproject.web;

import mk.ukim.finki.kiiiproject.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/add")
    public String showAddPage() {
        return "addDepartment";
    }

    @PostMapping("/add")
    public String add(@RequestParam String name) {
        this.departmentService.add(name);

        return "redirect:/doctors/all";
    }
}
