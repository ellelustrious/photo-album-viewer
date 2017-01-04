public class PhotoAlbumViewer
{
    public static void main(String[] args)
    {
        PhotoAlbum album = new PhotoAlbum();
        album.add(new Picture("oliver_chair.jpg"));
        album.add(new Picture("oliver_mantel.jpg"));
        album.add(new Picture("oliver_sink.jpg"));
        album.add(new Picture("oliver_sitting.jpg"));
        album.add(new Picture("oliver_sprawl.jpg"));
        album.draw();
        album.largest();
        album.totalArea();
    }
}
