public class Shape {
    public int Length; 
    public int Width; 
    public int radius; 

    public void Insert(int x, int z){
        Length = x; 
        Width = z; 

        int area = Length * Width; 
        System.out.println(area);
    }
}
