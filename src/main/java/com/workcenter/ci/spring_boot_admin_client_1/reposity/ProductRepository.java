package com.workcenter.ci.spring_boot_admin_client_1.reposity;

import com.workcenter.ci.spring_boot_admin_client_1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
