package sg.gov.caas.ecommerce.application.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name="tbl_SubCategory")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SubCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subCategoryId;
    private String subCategoryName;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk",referencedColumnName = "subCategoryId")
    private List<Product> productList;
}
