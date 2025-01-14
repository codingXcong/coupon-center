package io.zgc.coupon.calculation.api.beans;

import io.zgc.coupon.template.api.beans.CouponInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

// 封装了订单信息
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {


    // 当前订单的商品列表
    @NotEmpty
    private List<Product> products;

    private Long couponId;

    private long cost;

    // 目前只支持单张优惠券
    // 但是为了以后的扩展考虑，你可以添加多个优惠券的计算逻辑
    private List<CouponInfo> couponInfos;

    @NotNull
    private Long userId;

}
