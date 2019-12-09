/**
 *  Copyright Murex S.A.S., 2003-2019. All Rights Reserved.
 *
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.gildedrose;

public abstract class AbstractStoreItem implements StoreItem {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Instance fields
    //~ ----------------------------------------------------------------------------------------------------------------

    protected final Item item;

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Constructors
    //~ ----------------------------------------------------------------------------------------------------------------

    public AbstractStoreItem(Item item) {
        this.item = item;
    }

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    protected void decreaseQuality() {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    protected void increaseQuality() {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}
