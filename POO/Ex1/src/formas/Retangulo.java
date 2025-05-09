/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author rafael.neves
 */
public class Retangulo {
    private int x;
    private int y;
    private int altura;
    private int largura;
    
    
    public Retangulo(int x, int y, int largura, int altura){
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;   
    }
    
    public void desenhar(){
        System.out.printf("Retangulo(x: %d, y: %d, Altura: %d, Largura: %d\n)", x, y, altura, largura);
    }
    
    public void redimensionar(float sx, float sy){
        if (sx > 0 && sy > 0){
            largura = (int) (sx * largura);
            altura = (int) (sx * altura);
        }
        
    }
    
    
}
