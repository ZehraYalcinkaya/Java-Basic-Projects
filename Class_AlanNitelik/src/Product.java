public class Product{


    //Attribute & Field
    // yeni bir "tip" oluşturuyoruz(ex: int, string)

    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _color;
    private String _code;

    // Parametreli Constructor
    public Product(int id, String name, String description, double price, int stockAmount, String color,String code)
    {
        System.out.println("Yapıcı (constructor) blok çalıştı");

        _id = id;
        _name = name;
        _description = description;
        _price = price;
        _stockAmount = stockAmount;
        _color = color;
        _code = code;
    }


    //Parametresiz Constructor (overloading)
    public Product() {}




        public int getId () {     //id'yi okuyabilir artık (readonly)
            return _id;
        }


        public void setId ( int id){
            //this.id = id;             //this = bulunduğunm classtaki...
            _id = id;
        }


        public String getName () {
            return _name;
        }


        public void setName (String name){
            //this.id = id;
            _name = name;
        }


        public String getDescription () {
            return _description;
        }


        public void setDescription (String description){

            _description = description;
        }


        public double getPrice () {
            return _price;
        }


        public void setPrice ( double price){
            //this.id = id;
            _price = price;
        }


        public int getStockAmount () {
            return _stockAmount;
        }


        public void setStockAmount ( int stockAmount){

            _stockAmount = stockAmount;
        }


        public String getColor () {
            return _color;
        }


        public void setColor (String color){

            _color = color;
        }


        public String getCode () {
            return _code;
        }


        public void setCode (String code){

            _code = code;
        }

}
