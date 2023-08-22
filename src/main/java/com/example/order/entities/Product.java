package com.example.order.entities;

import jakarta.persistence.*;
import jdk.jfr.Unsigned;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgURL;

    @Transient
    @Setter(AccessLevel.NONE)
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Set<Category> categories = new HashSet<>();
}
