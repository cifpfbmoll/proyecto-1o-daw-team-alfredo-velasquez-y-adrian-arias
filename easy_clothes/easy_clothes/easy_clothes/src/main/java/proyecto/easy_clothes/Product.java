/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.easy_clothes;

/**
 *
 * @author Mamey
 */
public class Product {
    /**
    * El id del producto
    */
    private Integer id;
    /**
    * El nombre del producto
    */
    private String name;
    /**
    * Los colores del producto
    */
    private String colors[];
    /**
    * Las tallas del producto
    */
    private String sizes[];
    /**
    * Las categorías del prodcuto
    */
    private String category;
    /**
    * El precio del producto
    */
    private Double price;
    /**
    * El descuento del producto
    */
    private Double discount;
    /**
    * El género del producto
    */
    private String gender;
    /**
    * El stock del producto
    */
    private Integer stock;

    /**
    * <p>Metodo constructor creación de usuario con parametros
    * </p>
     * @param name
     * @param colors
     * @param sizes
     * @param category
     * @param price
     * @param discount
     * @param gender
     * @param stock
    * @since 1.0
    */
    public Product(String name, String[] colors, String[] sizes, String category, Double price, Double discount, String gender, Integer stock) {
        this.name = name;
        this.colors = colors;
        this.sizes = sizes;
        this.category = category;
        this.price = price;
        this.discount = discount;
        this.gender = gender;
        this.stock = stock;
    }

    /**
    * <p>Metodo que devuelve el id del producto
    * </p>
    * @return id
    * @since 1.0
    */
    public Integer getId() {
        return id;
    }

    /**
    * <p>Metodo que setea el id del producto
    * </p>
     * @param id
    * @since 1.0
    */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
    * <p>Metodo que devuelve el nombre del producto
    * </p>
    * @return name
    * @since 1.0
    */
    public String getName() {
        return name;
    }

    /**
    * <p>Metodo que setea el nombre del producto
    * </p>
     * @param name
    * @since 1.0
    */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * <p>Metodo que devuelve los colores del producto
    * </p>
    * @return colors
    * @since 1.0
    */
    public String[] getColors() {
        return colors;
    }

    /**
    * <p>Metodo que setea los colores del producto
    * </p>
     * @param colors
    * @since 1.0
    */
    public void setColors(String[] colors) {
        this.colors = colors;
    }

    /**
    * <p>Metodo que devuelve las tallas del producto
    * </p>
    * @return sizes
    * @since 1.0
    */
    public String[] getSizes() {
        return sizes;
    }

    /**
    * <p>Metodo que setea las tallas del producto
    * </p>
     * @param sizes
    * @since 1.0
    */
    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }

    /**
    * <p>Metodo que devuelve las categorías del producto
    * </p>
    * @return category
    * @since 1.0
    */
    public String getCategory() {
        return category;
    }

    /**
    * <p>Metodo que setea las categorías del producto
    * </p>
     * @param category
    * @since 1.0
    */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
    * <p>Metodo que devuelve el precio del producto
    * </p>
    * @return price
    * @since 1.0
    */
    public Double getPrice() {
        return price;
    }

    /**
    * <p>Metodo que setea el precio del producto
    * </p>
     * @param price
    * @since 1.0
    */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
    * <p>Metodo que devuelve el descuento del producto
    * </p>
    * @return discount
    * @since 1.0
    */
    public Double getDiscount() {
        return discount;
    }

    /**
    * <p>Metodo que setea el descuento del producto
    * </p>
     * @param discount
    * @since 1.0
    */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
    * <p>Metodo que devuelve el género del producto
    * </p>
    * @return gender
    * @since 1.0
    */
    public String getGender() {
        return gender;
    }

    /**
    * <p>Metodo que setea el género del producto
    * </p>
     * @param gender
    * @since 1.0
    */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
    * <p>Metodo que devuelve el stock del producto
    * </p>
    * @return stock
    * @since 1.0
    */
    public Integer getStock() {
        return stock;
    }

    /**
    * <p>Metodo que setea el stock del producto
    * </p>
     * @param stock
    * @since 1.0
    */
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    
    
    
}
