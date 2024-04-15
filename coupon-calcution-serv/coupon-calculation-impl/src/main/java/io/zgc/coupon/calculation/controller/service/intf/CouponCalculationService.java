package io.zgc.coupon.calculation.controller.service.intf;

import io.zgc.coupon.calculation.api.beans.ShoppingCart;
import io.zgc.coupon.calculation.api.beans.SimulationOrder;
import io.zgc.coupon.calculation.api.beans.SimulationResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface CouponCalculationService {

    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);

    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
