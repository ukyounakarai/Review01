public class Review01 {

public static void main(String[] args) {
//値段//
int ne = 1500;
//税率//
int zei = 10;
int result;
//結果を代入//
result = taxMethod(ne, zei);

System.out.println(ne + "円の商品の税込価格は" + (ne + result)+ "円（消費税は" + result + "円）です。");

}
public static int taxMethod(int ne, int zei) {

int result = (int) (ne * (int)zei / (1000 * 0.1)) ;
return result; //
}
}