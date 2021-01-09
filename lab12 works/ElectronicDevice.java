
package lab12;

//ElectronicDevice class

class ElectronicDevice extends  Product{
    private String model, warranty;

    public ElectronicDevice(String name, double price, String model, String warranty) {
        super(name, price);
        this.model = model;
        this.warranty = warranty;
    }

    public String getModel() {
        return model;
    }
    public String getWarranty() {
        return warranty;
    }
    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void setWarranty(String newWarranty) {
        this.warranty = newWarranty;
    }
    void changePrice(double percentage)
    {setPrice(getPrice()*(1+percentage));
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +'\'' +
                "model='" + model + '\'' +
                ", warranty='" + warranty + '\'' +
                '}';
    }
}