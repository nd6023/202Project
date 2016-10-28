/**
 * Added interface for the Composite View Design Pattern for Welcome Screen
 */
public interface IFirstComponent  
{
    void addChildren(IFirstComponent c);
    
    void removeChildren(IFirstComponent c);
    
    void drawComponent();
    
    void translateOut();
    
    int getSize();
}
