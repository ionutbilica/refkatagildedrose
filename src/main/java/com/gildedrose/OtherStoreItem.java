/**
 *  Copyright Murex S.A.S., 2003-2019. All Rights Reserved.
 *
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.gildedrose;

public class OtherStoreItem extends AbstractStoreItem {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Constructors
    //~ ----------------------------------------------------------------------------------------------------------------

    public OtherStoreItem(Item item) {
        super(item);
    }

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    @Override
    public void onDayPassed() {
        decreaseQuality();
        item.sellIn--;
        if (item.sellIn < 0) {
            decreaseQuality();
        }
    }
}
