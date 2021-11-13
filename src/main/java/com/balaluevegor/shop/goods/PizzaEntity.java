package com.balaluevegor.shop.goods;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Getter
@Setter(AccessLevel.PROTECTED)
@ToString
@RequiredArgsConstructor
@Table(name = "PIZZA")
public class PizzaEntity {

    @Setter(AccessLevel.NONE)
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    @Column(name = "name")
    private String name;

    private BigDecimal calories;

    private String image;

    private BigDecimal price;

    private BigDecimal weight;

    private BigDecimal diameter;

    private String composition;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PizzaEntity that = (PizzaEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
