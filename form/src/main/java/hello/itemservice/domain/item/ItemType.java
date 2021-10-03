package hello.itemservice.domain.item;

/**
 * Created by sskim on 2021/09/22
 * Github : http://github.com/sskim91
 */
public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
