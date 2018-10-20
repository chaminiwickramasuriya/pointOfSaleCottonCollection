package lk.ijse.maven.cotton.dto;


/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
public class CategoryDTO {
    private String catCode;
    private String catName;
    private String catType;
    private double catPrice;
    private int qtyOnHand;
    private String size;
    private String imgPath;

    public CategoryDTO() {
    }

    public CategoryDTO(String catCode, String catName, String catType, double catPrice, int qtyOnHand, String size, String imgPath) {
        this.catCode = catCode;
        this.catName = catName;
        this.catType = catType;
        this.catPrice = catPrice;
        this.qtyOnHand = qtyOnHand;
        this.size = size;
        this.imgPath = imgPath;
    }

    public String getCatCode() {
        return catCode;
    }

    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public double getCatPrice() {
        return catPrice;
    }

    public void setCatPrice(double catPrice) {
        this.catPrice = catPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "catCode='" + catCode + '\'' +
                ", catName='" + catName + '\'' +
                ", catType='" + catType + '\'' +
                ", catPrice=" + catPrice +
                ", qtyOnHand=" + qtyOnHand +
                ", size='" + size + '\'' +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }
}
