/**
 *  Copyright Murex S.A.S., 2003-2019. All Rights Reserved.
 *
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.gildedrose;

public class BackstagePassesStoreItem extends AbstractStoreItem {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Constructors
    //~ ----------------------------------------------------------------------------------------------------------------

    public BackstagePassesStoreItem(Item item) {
        super(item);
    }

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    @Override
    public void onDayPassed() {
        if (item.quality < 50) {
            item.quality++;
            if (item.sellIn <= 10) {
                increaseQuality();
            }
            if (item.sellIn <= 5) {
                increaseQuality();
            }
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
