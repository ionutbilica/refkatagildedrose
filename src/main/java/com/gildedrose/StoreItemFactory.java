/**
 *  Copyright Murex S.A.S., 2003-2019. All Rights Reserved.
 *
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.gildedrose;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;


public class StoreItemFactory {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Static fields/initializers
    //~ ----------------------------------------------------------------------------------------------------------------

    private static final Map<String, Function<Item, StoreItem>> ITEM_NAMES_TO_BUILDERS = new HashMap<String, Function<Item, StoreItem>>() {

        {
            put("Aged Brie", item -> new AgedBrie(item));
            put("Backstage passes to a TAFKAL80ETC concert", item -> new BackstagePassesStoreItem(item));
            put("Sulfuras, Hand of Ragnaros", item -> new SulfurasStoreItem(item));
        }
    };

    private static final Function<Item, StoreItem> DEFAULT_STORE_ITEM = item -> new OtherStoreItem(item);

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    public StoreItem wrapItem(Item item) {
        return Optional.ofNullable(ITEM_NAMES_TO_BUILDERS.get(item.name)).orElse(DEFAULT_STORE_ITEM).apply(item);
    }
}
