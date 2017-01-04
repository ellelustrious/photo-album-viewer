import java.util.ArrayList;
/**
 * Manages an list of Picture objects
 * 
 * @author Michelle Pham
 * @version Oct 31, 2016 / Final
 */
public class PhotoAlbum
{
    private ArrayList<Picture> photos;
    /**
     * constructor of the object
     */
    public PhotoAlbum()
    {
        photos = new ArrayList<Picture>();
    }
    /**
     * Draws the pictures in the PhotoAlbum horizontally
     */
    public void draw()
    {
        final int GAP = 10;
        int lastX = 0;
        for (Picture p: photos)
        {
            p.translate(lastX + GAP, 0);
            lastX = p.getMaxX();
            p.draw();
        } 
    }
    /**
     * adds a picture object to the PhotoAlbum
     * @param pic the picture
     */
    public void add(Picture pic)
    {
        photos.add(pic);
    }
    /**
     * gets the sum of the areas of all the Pictures
     * @return area the total area
     */
    public int totalArea()
    {
        int area = 0;
        for (Picture p : photos) 
        {
            area += area(p);
        }
        return area;
    }
    /**
     * gets the Picture with the largest area
     * @return largest the largest area 
     */

    public Picture largest()
    {
        Picture pic = null;
        if (photos.size() > 0) {
            pic = photos.get(0);
            for (Picture p : photos) {
                if (area(p) > area(pic)) {
                    pic = p;
                }
            }
        }
        return pic;
    }
    private static int area(Picture pic)
    {
        return pic.getHeight() * pic.getWidth();
    }
}
