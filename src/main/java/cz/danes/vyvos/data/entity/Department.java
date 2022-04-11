package cz.danes.vyvos.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    public void setDepartmentId(Long id) {
        this.departmentId = id;
    }

    @Column
    private String name;

    @Column
    private String comment;

    @Id
    public Long getDepartmentId() {
        return departmentId;
    }
}
