class Shop
{

static String Shopname="Raman";
int price;
int discount;

public static void main(String[] args)
{
Shop product1= new Shop();
Shop product2= new Shop();
Shop product3= new Shop();

product1.price=100;
product1.discount=20;
product2.price=200;
product2.discount=10;

product1.sell();
product2.sell();
int actualprice=product2.sell();
System.out.println=("actual price is" + actualprice);
product2.bill();
Shop.clean();

}


void bill()
{

}

static void clean()
{
System.out.println("cleaning");
//System.out.println(this.discount);
}



int sell()
{
int discount=30;
//System.out.println(price);
//System.out.println(discount);
//System.out.println(this.discount);
System.out.println(this.price-this.discount);
return this.price - this.discount;



}



}
