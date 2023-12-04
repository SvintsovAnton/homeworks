package de.ait.homework55;

public class CatalogClient {
    public static void main(String[] args) {
        FashionShop fashionShop = new FashionShop();
        FashionItem fashionItemWatch = new FashionItem("Часы",2000,FashionCategory.ACCESSORIES,Season.ALLSEASON);
        FashionItem fashionItemCoat = new FashionItem("Пальто",250,FashionCategory.CLOTHES,Season.WINTER);
        FashionItem fashionItemBoots =new FashionItem("Туфли",500,FashionCategory.SHOES,Season.SUMMER);


        fashionShop.addFashionItem(fashionItemWatch);
        fashionShop.addFashionItem(fashionItemCoat);
        fashionShop.addFashionItem(fashionItemBoots);

        fashionShop.showInfoAboutSeason(Season.ALLSEASON);
        fashionShop.showInfoAboutSeason(Season.SUMMER);
        fashionShop.showInfoAboutSeason(Season.WINTER);
        fashionShop.showInfoAboutSeason(Season.SPRING);

    }
}
