package io.zgc.coupon.customer.service.intf;


import io.zgc.coupon.calculation.api.beans.ShoppingCart;
import io.zgc.coupon.calculation.api.beans.SimulationOrder;
import io.zgc.coupon.calculation.api.beans.SimulationResponse;
import io.zgc.coupon.customer.api.beans.RequestCoupon;
import io.zgc.coupon.customer.api.beans.SearchCoupon;
import io.zgc.coupon.customer.dao.entity.Coupon;
import io.zgc.coupon.template.api.beans.CouponInfo;

import java.util.List;

// 用户对接服务
public interface CouponCustomerService {

    // 领券接口
    Coupon requestCoupon(RequestCoupon request);

    // 核销优惠券
    ShoppingCart placeOrder(ShoppingCart info);

    // 优惠券金额试算
    SimulationResponse simulateOrderPrice(SimulationOrder order);

    void deleteCoupon(Long userId, Long couponId);

    // 查询用户优惠券
    List<CouponInfo> findCoupon(SearchCoupon request);
}
