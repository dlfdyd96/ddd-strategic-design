package kitchenpos.order.takeout.domain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import kitchenpos.order.eatin.domain.OrderTable;

public interface TakeOutOrderRepository {

    TakeOutOrder save(TakeOutOrder order);

    Optional<TakeOutOrder> findById(UUID id);

    List<TakeOutOrder> findAll();

    boolean existsByOrderTableAndStatusNot(OrderTable orderTable, TakeOutOrderStatus status);
}

