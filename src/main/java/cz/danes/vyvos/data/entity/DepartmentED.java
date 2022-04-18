package cz.danes.vyvos.data.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "department")
public class DepartmentED {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "departmentId",unique=true, nullable = false)
    private Long departmentId;

    @NotBlank
    @Column
    private String name;

    @Column
    private String comment;

}
