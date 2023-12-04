package de.ait.homework55;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

public class FashionShop {



      private EnumMap<FashionCategory, Set<FashionItem>> catalog = new EnumMap<>(FashionCategory.class);//Инициализацию проводить лучше в конструкторе, чем в полях    // = new EnumMap<>(FashionItem.class);

    public FashionShop(){
      //  catalog = new EnumMap<>(FashionCategory.class);
        for(FashionCategory category:FashionCategory.values()){
            catalog.put(category,new HashSet<>());
        }
        }

    public void addFashionItem(FashionItem fashionItem){
        catalog.get(fashionItem.getFashionCategory()).add(fashionItem);

    }

    public void showInfoAboutSeason(Season season){
        for (FashionCategory fashionCategory: FashionCategory.values()){
            for(FashionItem item:  catalog.get(fashionCategory)){
                if (item.getSeason().equals(season)){
                    System.out.println(item.toString());
                }
            }
        }
    }



        FashionItem dress = new FashionItem("Платье Dolce Gabanna",2999,FashionCategory.CLOTHES,Season.SUMMER);






}
