/**
 *  Copyright Murex S.A.S., 2003-2019. All Rights Reserved.
 * 
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.gildedrose;

class GildedRoseRef extends GildedRose {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Instance fields
    //~ ----------------------------------------------------------------------------------------------------------------

    private final StoreItemFactory storeItemFactory;

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Constructors
    //~ ----------------------------------------------------------------------------------------------------------------

    public GildedRoseRef(Item[] items) {
        super(items);
        storeItemFactory = new StoreItemFactory();

    }

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            StoreItem storeItem = storeItemFactory.wrapItem(items[i]);
            storeItem.onDayPassed();
        }
    }
}
