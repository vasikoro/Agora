package domains.Enums;

public enum OsEnum {

    ANDROID("1", "Android"),
    IOS("2", "iOS");

    private String itemCode;
    private String description;

    OsEnum(String itemCode, String description) {
        this.itemCode = itemCode;
        this.description = description;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static OsEnum get(String itemCode){
        for(OsEnum osEnum : values()){
            if(osEnum.itemCode.equals(itemCode)){
                return osEnum;
            }
        }
        return null;
    }
}
