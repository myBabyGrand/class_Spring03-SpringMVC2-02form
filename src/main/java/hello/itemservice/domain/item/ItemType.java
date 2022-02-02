package hello.itemservice.domain.item;

public enum ItemType {
    
    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String Description;

    ItemType(String description) {
        Description = description;
    }

    public String getDescription() {
        return Description;
    }
}
