/**
 *  Copyright Murex S.A.S., 2003-2019. All Rights Reserved.
 *
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TexttestFixture {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    @Test
    public void test() {
        Item[] items = buildInventory();
        Item[] items2 = buildInventory();
        String expected = getOutput(new GildedRose(items), items);
        String actual = getOutput(new GildedRoseRef(items2), items2);
        Assertions.assertEquals(expected, actual);
    }

    private static String getOutput(GildedRose app, Item[] items) {
        StringBuilder out = new StringBuilder();

        int days = 200;

        for (int i = 0; i < days; i++) {
            out.append("-------- day " + i + " --------\n");
            out.append("name, sellIn, quality\n");
            for (Item item : items) {
                out.append(item + "\n");
            }
            out.append("\n");
            app.updateQuality();
        }

        return out.toString();
    }

    private static Item[] buildInventory() {
        return new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6)
            };
    }

}
