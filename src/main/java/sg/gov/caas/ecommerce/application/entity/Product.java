package sg.gov.caas.ecommerce.application.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name="tbl_product")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pId;
    private String productName;
    private String description;
    @OneToMany(targetEntity = Tag.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk",referencedColumnName = "pId")
    private List<Tag> tagList;
}
