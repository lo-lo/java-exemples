package FlenaganObjClasseInterface.ExePost;

/**
 * Этот класс представляет почтовый адрес человека. Он имеет поля для указания имени, адреса (улица, номер дома, номер квартиры).
 * города, штата и ZIP-кода. Метод toString() форматирует вывод.
 */

public class Post {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;

    public Post(String name, String address, String city, String state, int zip){
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }



    @Override
    public String toString(){
        return "Name: "+name+"\n"+"Address: "+address+"\n"+"City: "+city+"\n"+"State: "+state+"\n"+"ZIP: "+zip+"\n\n";
    }
}
