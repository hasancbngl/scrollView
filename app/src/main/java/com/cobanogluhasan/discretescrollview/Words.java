package com.cobanogluhasan.discretescrollview;

import java.util.Arrays;
import java.util.List;

public class Words {

        public static Words get() {
            return new Words();
        }





        public List<Item> getData() {
            return Arrays.asList(

                    new Item("a", "Everyday Candle",  R.drawable.bg),
                    new Item("2", "Small Porcelain Bowl",  R.drawable.bg),
                    new Item("3", "Favourite Board",  R.drawable.bg),
                    new Item("4", "Earthenware Bowl",  R.drawable.bg),
                    new Item("5", "Porcelain Dessert Plate",  R.drawable.bg),
                    new Item("6", "Detailed Rolling Pin",  R.drawable.bg));

        }

}
