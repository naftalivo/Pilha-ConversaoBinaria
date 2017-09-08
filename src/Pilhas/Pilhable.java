/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

/**
 *
 * @author Ivo
 */
public interface Pilhable {
  
    
    public Object push(Object objecto);
    public Object pop();
    public Object peek();
    public boolean empty();
    public int search(Object objecto);
    
}
