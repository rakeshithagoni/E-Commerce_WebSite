
package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int requiredQuantity;

    @ManyToOne
    @JoinColumn
    Cart cart;

    @OneToOne
    @JoinColumn
    Product product;

    @ManyToOne
    @JoinColumn
    Ordered order;
}