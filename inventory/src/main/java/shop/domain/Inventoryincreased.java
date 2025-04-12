package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Inventoryincreased extends AbstractEvent {

    private Long id;

    public Inventoryincreased(Inventory aggregate) {
        super(aggregate);
    }

    public Inventoryincreased() {
        super();
    }
}
//>>> DDD / Domain Event
