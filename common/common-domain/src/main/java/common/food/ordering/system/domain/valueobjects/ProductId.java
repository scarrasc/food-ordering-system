package common.food.ordering.system.domain.valueobjects;

import java.util.UUID;

public class ProductId extends BaseId<UUID> {

    public ProductId(UUID value) {
        super(value);
    }
}
