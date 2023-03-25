package DataModels;

public class Item {
    String itemName;
    String itemId;
    String price;

    public Item() {
    }

    public Item(String itemName, String itemId, String price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
