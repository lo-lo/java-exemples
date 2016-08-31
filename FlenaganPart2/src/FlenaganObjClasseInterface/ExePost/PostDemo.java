package FlenaganObjClasseInterface.ExePost;

public class PostDemo {
    public static void main(String[] args) {
        Post[] postArr = new Post[2];
        postArr[0] = new Post("Dima", "Kirova,6 - 21", "Moscow", "Moscow", 123456);
        postArr[1] = new Post("Liza", "Gagarina,121 - 211", "Bor", "NN", 123123);
        for(int i = 0; i < postArr.length; i++) {
            System.out.println(postArr[i].toString());
        }
    }
}
