package AssemblyLine;

public class AssembleyLine {

    private int maxSize;
    private ManufacturedProduct[] mpArray;
    private int front;
    private int rear;
    
    

    public AssembleyLine(int s) {
        maxSize = s;
        mpArray = new ManufacturedProduct[maxSize];
        front = 0;
        rear = maxSize - 1;

    }

    public ManufacturedProduct insert(ManufacturedProduct product) {

        int x = 0;
        ManufacturedProduct mp = null;

        if (mpArray[rear] != null) {
            mp = remove(mpArray[rear]);
            mpArray[rear]=null;
        }

        for (int i = 0; i < maxSize; i++) {

            if (mpArray[i] == null) {
                x = i;
            }

        }
        while (x != front) {

            mpArray[x] = mpArray[x - 1];
            --x;
        }
        mpArray[front] = product;

        return mp;
    }

    public ManufacturedProduct remove(ManufacturedProduct p) {
        ManufacturedProduct temp =p;

        return temp.inspectionMethod(temp);
    }
}
