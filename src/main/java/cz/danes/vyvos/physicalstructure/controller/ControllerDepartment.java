package cz.danes.vyvos.physicalstructure.controller;

import cz.danes.vyvos.data.entity.Department;
import cz.danes.vyvos.physicalstructure.service.ServiceDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/v1/department")
public class ControllerDepartment {

    final String SELECT_BY_ID = "select * from department ";

    @Autowired
    private ServiceDepartment departmentService;

    //http://localhost:8090/v1/department/getall
    @GetMapping("/getall")
    public ResponseEntity<List<Department>> testMySql() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Credentials", "true");
        return new ResponseEntity<List<Department>>(departmentService.getAll(), headers,
                HttpStatus.OK);
    }

    @GetMapping("/deleteid")
    public ResponseEntity<String> deleteDepartment(@RequestParam(name = "id") Long departmentID) {
        HttpHeaders headers = new HttpHeaders();
        departmentService.deleteById(departmentID);
        headers.add("Access-Control-Allow-Credentials", "true");
        return  ResponseEntity.ok()
                .header("Custom-Header", "foo").body("");
    }
}