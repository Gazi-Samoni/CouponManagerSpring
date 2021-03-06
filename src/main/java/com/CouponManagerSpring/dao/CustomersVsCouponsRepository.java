package com.CouponManagerSpring.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersVsCouponsRepository extends JpaRepository<CustomersVsCoupons,CustomerVsCouponMultipleId > {
	
	public List<CustomersVsCoupons> findByCouponId(int couponID);
	public List<CustomersVsCoupons> findByCustomerId(int customerID);
	public void deleteByCouponId(int couponID);

}
