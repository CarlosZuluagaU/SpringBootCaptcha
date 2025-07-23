// src/main/java/com/google/SpringBootRecaptcha/controller/EmployeeController.java
package com.google.SpringBootRecaptcha.controller;

import com.google.SpringBootRecaptcha.controller.dto.EmployeeDTO;
import com.google.SpringBootRecaptcha.entities.EmployeeEntity; // Usar el paquete que proporcionaste
import com.google.SpringBootRecaptcha.service.EmployeeService; // Usar el paquete que proporcionaste
import com.google.SpringBootRecaptcha.service.RecaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController; // ¡Eliminar esta anotación!

import java.util.List;


@Controller // Esta es la anotación correcta para devolver vistas
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService; // Inyecta el servicio de empleados

    @Autowired
    private RecaptchaService recaptchaService;


    @GetMapping(path = {"/", "/all"})
    public String showAll(Model model) {
        // Obtiene la lista de empleados del servicio
        List<EmployeeEntity> employeeEntityList = employeeService.findAll();


        model.addAttribute("employees", employeeEntityList);

        return "index";
    }
    @GetMapping("/create/form")
    public String createForm(Model model){
        model.addAttribute("employee", new EmployeeEntity());
        return "form";
    }

    @PostMapping("create/process")
    public String createProcess(@ModelAttribute(name = "employee") EmployeeDTO employeeDTO, @RequestParam(name = "g-recaptcha-response")String captcha, Model model){
        //Esto esta recibiendo un DTO, que tien los stings

        //Objeto de transferencia de datos

        boolean captchaValid = recaptchaService.validateRecaptcha(captcha);


        //Si se quiere verificar el captcha
        //lo unico que hay que hacer es negarlo

        //Como se hace esto con

        //!captchaValid dentro del if y ya , por si se quiere someter a pruebas
        if (captchaValid){
            EmployeeEntity employeeEntity = EmployeeEntity.builder()
                    .name(employeeDTO.getName())
                    .lastName(employeeDTO.getLastName())
                    .dateOfBirth(employeeDTO.getDateOfBirth())
                    .build();
            employeeService.createEmployee(employeeEntity);
            return  "redirect:/all";
        }else{

            model.addAttribute("message", "Captch invalido");
            return "error";
        }

    }
}
