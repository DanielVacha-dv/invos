package cz.danes.vyvos.physicalstructure.controller;

import cz.danes.vyvos.data.entity.DepartmentED;
import cz.danes.vyvos.physicalstructure.service.ServiceDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/v1/department")
public class ControllerDepartment {

    @Autowired
    private ServiceDepartment departmentService;

    //http://localhost:8090/v1/department/getall  /swagger-ui/index.html
    @GetMapping("/getall")
    public ResponseEntity<List<DepartmentED>> testMySql() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Credentials", "true");
        return new ResponseEntity<>(departmentService.getAll(), headers,
                HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteDepartment(@RequestParam(name = "departmentId") Long departmentID) {
        HttpHeaders headers = new HttpHeaders();
        departmentService.deleteById(departmentID);
        headers.add("Access-Control-Allow-Credentials", "true");
        return  ResponseEntity.ok()
                .header("Custom-Header", "").body("");
    }
    @PostMapping("/add")
    public ResponseEntity<String> addDepartment(@Valid DepartmentED department) {
        HttpHeaders headers = new HttpHeaders();
        departmentService.add(department);
        headers.add("Access-Control-Allow-Credentials", "true");
        return  ResponseEntity.ok()
                .header("Custom-Header", "").body("");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateDepartment(@Valid DepartmentED department) {
        HttpHeaders headers = new HttpHeaders();
        if  (department!=null && department.getDepartmentId()!=null && department.getDepartmentId()>=0) {
            departmentService.update(department);
            headers.add("Access-Control-Allow-Credentials", "true");
            return  ResponseEntity.ok()
                    .header("Custom-Header", "").body("");
        }  else {
            headers.add("Access-Control-Allow-Credentials", "true");
            return  ResponseEntity.status(404)
                    .header("Custom-Header", "").body("");
        }
    }
}