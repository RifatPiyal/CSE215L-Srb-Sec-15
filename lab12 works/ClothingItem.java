
package lab12;

// ClothingItem class
class ClothingItem extends Product{
    private String fabricType;

    public ClothingItem(String name, double price, String fabricType) {
        super(name, price);
        this.fabricType = fabricType;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String newFabricType) {
        this.fabricType = newFabricType;
    }
    void changePrice(double percentage)
    {setPrice(getPrice()*(1+percentage));
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +'\'' +
                "fabricType='" + fabricType + '\'' +
                '}';
    }
}

