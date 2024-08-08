import java.util.ArrayList;
import java.util.List;

public class AnnouncementSystem {

    public List<Announcement> announcements;
    public AnnouncementSystem() {
        announcements = new ArrayList<Announcement>();
    }
public void addAnnouncement(Announcement announcement) {
        announcements.add(announcement);

}
public void updateAnnouncement(int index, Announcement updatedAnnouncement) {
        if (index >= 0 && index < announcements.size()) {
            announcements.set(index, updatedAnnouncement);
        }
}

public void broadcastAnnouncement() {
        for (Announcement announcement : announcements) {
            System.out.println("Broadcasted: " + announcement.getType() + " - " + announcement.getMessage());
        }
}


















}
