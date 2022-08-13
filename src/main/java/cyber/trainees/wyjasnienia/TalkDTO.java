package cyber.trainees.wyjasnienia;


//data transfer object

import java.util.List;

public class TalkDTO {
    private final String tematRozmowy;
    public String opis;
    private final List<String> przyklady;

    public TalkDTO(String tematRozmowy, List<String> przyklady) {
        this.tematRozmowy = tematRozmowy;
        this.przyklady = przyklady;
    }
}
